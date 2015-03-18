//////////////////////////////////////////////////
//			ACTIVATION HELPER FUNCTIONS			//
//////////////////////////////////////////////////

function execIpAddressDiscovery(){
	
	var ipInterfaceRoot = "Device.IP.Interface.";
	var ip;
	
	var gpvParams = new Array(1);
	gpvParams[0] = ipInterfaceRoot;
	var gpv = new Packages.alamotv.hdm.functions.types.request.GetParameterValuesDTO();
	gpv.setParameterNames(gpvParams);
	
	var gpvResult = execGPVWithoutCache(gpv);
	
	if (gpvResult.isSuccess())
	{
		_log.debug("GPV on 'Device.IP.Interface.' object is successful");
		var parameterValues = gpvResult.getResponseDTO().getParameterList();
		
		var helper = new Packages.com.alcatel.hdm.jcf.JCFIPAddressHelper();
		try{
		var inter = helper.findPrimaryIpInterface(parameterValues);
			if(inter != null || inter != ""){
				_log.debug("Primary IP interface is: " + inter);
				ip = new Packages.com.alcatel.hdm.jcf.JCFIPAddress();
				ip.setInterfaceName(inter);
				ip.setIpAddress(helper.getParameterValue(parameterValues, inter));
			}
		}
		catch(e){
			_log.error("An error occured while processing IP interface. " + e);
		}
	}else{
		_log.warn("GPV on 'Device.IP.Interface.' object is not successful");
	}
	return ip;
}

function execGatewayTypeDiscovery(){
	
	var dslParameter = "Device.DSL.Line.";
	var mocaParameter = "Device.MoCA.Interface.";
	var dhcpv4Parameter = "Device.DHCPv4.Server.Enable";
	var dhcpv6Parameter = "Device.DHCPv6.Server.Enable";
	var hostsParameter = "Device.Hosts.HostNumberOfEntries";
	var manageableDeviceParameter = "Device.ManagementServer.ManageableDeviceNumberOfEntries";
	var natParameter = "Device.NAT.PortMappingNumberOfEntries";
	var routerParameter = "Device.Routing.RouterNumberOfEntries";
	
	var gpvParams = new Array(1);
	var gpv = new Packages.alamotv.hdm.functions.types.request.GetParameterValuesDTO();
	var helper = new Packages.com.alcatel.hdm.jcf.JCFGatewayTypeDiscoveryHelper();
	
	//check DSL object
	gpvParams[0] = dslParameter;
	gpv.setParameterNames(gpvParams);
	var gpvResult = execGPVWithoutCache(gpv);
	if (gpvResult.isSuccess()){
		//if Status = up then ok
		if (helper.isDslActive(gpvResult.getResponseDTO().getParameterList())){
			 _log.debug("Active DSL line detected. Device is a gateway.");
			return true;
		}
	}
	
	// check Device.MoCA interface
	gpvParams[0] = mocaParameter;
	gpv.setParameterNames(gpvParams);
	var gpvResult = execGPVWithoutCache(gpv);
	if (gpvResult.isSuccess()){
		//if Status = up  then ok
		if (helper.isMocaActive(gpvResult.getResponseDTO().getParameterList())){
			 _log.debug("Active Moca interface detected. Device is a gateway.");
			return true;
		}
	}
	
	//check DHCPv4 Server object
	gpvParams[0] = dhcpv4Parameter;
	gpv.setParameterNames(gpvParams);
	var gpvResult = execGPVWithoutCache(gpv);
	if (gpvResult.isSuccess()){
		var parameterValues = gpvResult.getResponseDTO().getParameterList();
		if(parameterValues[0].getValue() == 1){
			_log.debug("Enabled DHCPv4.Server object detected. Device is a gateway");
			return true;
		}
	}
	
	//check Device.DHCPv6.Server object
	gpvParams[0] = dhcpv6Parameter;
	gpv.setParameterNames(gpvParams);
	var gpvResult = execGPVWithoutCache(gpv);
	if (gpvResult.isSuccess()){
		var parameterValues = gpvResult.getResponseDTO().getParameterList();
		if(parameterValues[0].getValue() == 1){
			_log.debug("Enabled DHCPv6.Server object detected. Device is a gateway");
			return true;
		}
	}
	
	// Check Device.Hosts
	gpvParams[0] = hostsParameter;
	gpv.setParameterNames(gpvParams);
	var gpvResult = execGPVWithoutCache(gpv);
	if (gpvResult.isSuccess()){
		var parameterValues = gpvResult.getResponseDTO().getParameterList();
		if(parameterValues[0].getValue() > 0){
			_log.debug("Host table contains entries. Device is a gateway");
			return true;
		}
	}
	
	//Check Device.ManagementServer.ManageableDevice
	gpvParams[0] = manageableDeviceParameter;
	gpv.setParameterNames(gpvParams);
	var gpvResult = execGPVWithoutCache(gpv);
	if (gpvResult.isSuccess()){
		var parameterValues = gpvResult.getResponseDTO().getParameterList();
		if(parameterValues[0].getValue() > 0){
			_log.debug("Manageable device table contains entries. Device is a gateway");
			return true;
		}
	}

	//Check NAT
	gpvParams[0] = natParameter;
	gpv.setParameterNames(gpvParams);
	var gpvResult = execGPVWithoutCache(gpv);
	if (gpvResult.isSuccess()){
		var parameterValues = gpvResult.getResponseDTO().getParameterList();
		if(parameterValues[0].getValue() > 0){
			_log.debug("Port mapping table contains entries. Device is a gateway");
			return true;
		}
	}
	
	//Check Routing.Router
	gpvParams[0] = routerParameter;
	gpv.setParameterNames(gpvParams);
	var gpvResult = execGPVWithoutCache(gpv);
	if (gpvResult.isSuccess()){
		var parameterValues = gpvResult.getResponseDTO().getParameterList();
		if(parameterValues[0].getValue() > 0){
			_log.debug("Routing table contains entries. Device is a gateway");
			return true;
		}
	}
	return false;
}

function setCrCredentialsPeriodicInformEnableAndInterval(periodicInformInterval, fetchCrCredentialsFromDb){
	var credentials = null;
	if(fetchCrCredentialsFromDb){
		fetchDeviceCrCredentialsFromDatabase();
		credentials = _map.get("CR");
	}
	
	if (credentials == null){
		credentials = new Packages.com.alcatel.hdm.jcf.JCFCRCredentials();
		var crUsername = Packages.alamotv.hdm.commons.AutoGenerateUtils.generateUniqueUsername(_inform.getDeviceID().getProductClass(), 
				_inform.getDeviceID().getOUI(), _inform.getDeviceID().getSerialNumber());
		var crPassword = Packages.alamotv.hdm.commons.AutoGenerateUtils.generateUniquePassword(_inform.getDeviceID().getProductClass(), 
				_inform.getDeviceID().getOUI(), _inform.getDeviceID().getSerialNumber(), _log);
		credentials.setUsername(crUsername);
    	credentials.setPassword(crPassword);	
	}
	
	// SET CR CREDENTIALS, PI ENABLE and PI INTERVAL
	var spvArray = new Array(4);
	spvArray[0] = new Packages.alamotv.hdm.functions.types.struct.ParameterValueStructDTO("Device.ManagementServer.ConnectionRequestUsername",credentials.getUsername(),"string");
	spvArray[1] = new Packages.alamotv.hdm.functions.types.struct.ParameterValueStructDTO("Device.ManagementServer.ConnectionRequestPassword", credentials.getPassword() ,"string");
	spvArray[2] = new Packages.alamotv.hdm.functions.types.struct.ParameterValueStructDTO("Device.ManagementServer.PeriodicInformEnable","1" ,"boolean");
	spvArray[3] = new Packages.alamotv.hdm.functions.types.struct.ParameterValueStructDTO("Device.ManagementServer.PeriodicInformInterval" ,periodicInformInterval , "unsignedInt" );
	
	var spvDTO = new Packages.alamotv.hdm.functions.types.request.SetParameterValuesDTO(spvArray, "");
	var jcfResult = execPrimitive("setParameterValues", spvDTO);
	
	if (!jcfResult.isSuccess()) {
		var errorMsg = "Could not set CR credentials and PI interval";
		_log.error(errorMsg);
		abort(0, errorMsg, jcfResult.getFaultMsgParams());
    }else{
    	return credentials;
    }
}

function setPublicServerUrlAndCredentials(url, username, password){
    var spvParameters = new Array(3);
    spvParameters[0] = new Packages.alamotv.hdm.functions.types.struct.ParameterValueStructDTO("Device.ManagementServer.URL", url, "string");
    spvParameters[1] = new Packages.alamotv.hdm.functions.types.struct.ParameterValueStructDTO("Device.ManagementServer.Username", username, "string");
    spvParameters[2] = new Packages.alamotv.hdm.functions.types.struct.ParameterValueStructDTO("Device.ManagementServer.Password", password, "string");

    var spvDTO = new Packages.alamotv.hdm.functions.types.request.SetParameterValuesDTO(spvParameters, "");
    return  execPrimitive("setParameterValues", spvDTO);
}

function setActiveNotificationOnIpInterface(ipInterface){
	if (ipInterface != null){
		var spaArray = new Array(1);
		spaArray[0] = new Packages.alamotv.hdm.functions.types.struct.SetParameterAttributesStructDTO(ipInterface, true, 2 , false, null);
		var spaDTO = new Packages.alamotv.hdm.functions.types.request.SetParameterAttributesDTO(spaArray);
		var jcfResult = execPrimitive("setParameterAttributes", spaDTO);
		if (!jcfResult.isSuccess()) {
			_log.error("Could not set active notification on the IP interface: "+ ipInterface+". HDM will be unaware of IP Address changes for this device!");
			_log.error("Reason for SPA failure: " + jcfResult.getFaultMsgParams());
	    }
	}else{
		_log.error("ipInterface is null. Cannot execute SPA.");
	}
}

function saveDeviceProperties(deviceProperties){
	var interrupt = new JCFDeviceUpdateInterrupt(deviceProperties);
	return __interrupt(interrupt);
}

function requestProvisioningDataFromOssWithCorrelatorsAndParameters(correlators, parameters, primitiveResultHandler){
	var interrupt = new JCFActivationInterrupt(correlators, parameters, primitiveResultHandler);
	return __interrupt(interrupt);
}

function requestProvisioningDataFromOss(primitiveResultHandler){
	var interrupt = new JCFActivationInterrupt(null, null, primitiveResultHandler);
	return __interrupt(interrupt);
}

function fetchDeviceCrCredentialsFromDatabase(){
	var interrupt = new JCFDeviceDataInterrupt();
	return __interrupt(interrupt);
}

function isPublicIPv4Address(ipAddress){
	var ipAddrCheck = new Packages.motive.hdm.commons.util.IPAddress(ipAddress);
    return !ipAddrCheck.isPrivateIPv4Address();
}

function getGatewayInfo(){
    var gatewayInfo = null;
    var gpvParams = new Array(1);
	var gpv = new Packages.alamotv.hdm.functions.types.request.GetParameterValuesDTO();

	gpvParams[0] = "Device.GatewayInfo.";
	gpv.setParameterNames(gpvParams);
	var gpvResult = execPrimitive("getParameterValues", gpv);

    if (gpvResult.isSuccess()){
        var parameterValues = gpvResult.getResponseDTO().getParameterList();
        parameterValues.sort(compareName);
        gatewayInfo = new Packages.com.alcatel.hdm.jcf.JCFGatewayInfo();
        gatewayInfo.setOui(parameterValues[0].getValue());
        gatewayInfo.setProductClass(parameterValues[1].getValue());
        gatewayInfo.setSerialNumber(parameterValues[2].getValue());
    }

    return gatewayInfo;
}

function setActiveNotificationOnGatewayInfo(){

    var spaArray = new Array(1);
	spaArray[0] = new Packages.alamotv.hdm.functions.types.struct.SetParameterAttributesStructDTO("Device.GatewayInfo.", true, 2 , false, null);
	var spaDTO = new Packages.alamotv.hdm.functions.types.request.SetParameterAttributesDTO(spaArray);
	var jcfResult = execPrimitive("setParameterAttributes", spaDTO);
	if (!jcfResult.isSuccess()) {
		_log.error("Could not set active notification on the 'Device.Gatewayinfo.' parameter");
		_log.error("Reason for SPA failure: " + jcfResult.getFaultMsgParams());
    }
}

function setActiveNotificationOnManageableDevice(){

    var spaArray = new Array(1);
	spaArray[0] = new Packages.alamotv.hdm.functions.types.struct.SetParameterAttributesStructDTO("Device.ManagementServer.ManageableDevice.", true, 2 , false, null);
	var spaDTO = new Packages.alamotv.hdm.functions.types.request.SetParameterAttributesDTO(spaArray);
	var jcfResult = execPrimitive("setParameterAttributes", spaDTO);
	if (!jcfResult.isSuccess()) {
		_log.error("Could not set active notification on the 'Device.ManagementServer.ManageableDevice.' parameter");
		_log.error("Reason for SPA failure: " + jcfResult.getFaultMsgParams());
    }
}


function doStunSettings(){
    //First , retrieve STUN parameters from the SCE
    var stunServerAddress = Packages.com.alcatel.hdm.configuration.ConfigurationUtil.getProperty("TR111.stunServerAddress");
    var stunServerPort = Packages.com.alcatel.hdm.configuration.ConfigurationUtil.getProperty("TR111.stunServerPort");
    var stunUsername = Packages.com.alcatel.hdm.configuration.ConfigurationUtil.getProperty("TR111.stunDefaultUsername");
    var stunPassword = Packages.com.alcatel.hdm.configuration.ConfigurationUtil.getProperty("TR111.stunDefaultPassword");
    
    //Check whether STUN Server Address and Port is defined. Otherwise, no SPV will be executed.
    if (stunServerAddress != null && stunServerPort != null && stunServerAddress != "" && stunServerPort != ""){
    	var spvParameters;
    	//Username and password are optional
    	if (stunUsername != null && stunPassword != null && stunUsername != "" && stunPassword != null){
    		spvParameters = new Array(5);
    		spvParameters[3] = new Packages.alamotv.hdm.functions.types.struct.ParameterValueStructDTO("Device.ManagementServer.STUNUsername", stunUsername, "string");
    		spvParameters[4] = new Packages.alamotv.hdm.functions.types.struct.ParameterValueStructDTO("Device.ManagementServer.STUNPassword", stunPassword, "string");
    	}
    	else{
    		spvParameters = new Array(3);
    	}
	    spvParameters[0] = new Packages.alamotv.hdm.functions.types.struct.ParameterValueStructDTO("Device.ManagementServer.STUNEnable", "1", "boolean");
	    spvParameters[1] = new Packages.alamotv.hdm.functions.types.struct.ParameterValueStructDTO("Device.ManagementServer.STUNServerAddress", stunServerAddress, "string");
	    spvParameters[2] = new Packages.alamotv.hdm.functions.types.struct.ParameterValueStructDTO("Device.ManagementServer.STUNServerPort", stunServerPort, "unsignedInt");
	   	
	    var spvDTO = new Packages.alamotv.hdm.functions.types.request.SetParameterValuesDTO(spvParameters, "");
	    _log.debug("Setting STUN parameters");
	    var jcfResult = execPrimitive("setParameterValues", spvDTO);
	    
	    if (!jcfResult.isSuccess()) {
			_log.error("An error occured while doing SPV for STUN Parameters: " + jcfResult.getFaultMsgParams() );
	    }else{
	    	//Set Active Notification on UDPConnectionRequestAddress and NATDetected parameters
	    	var spaArray = new Array(2);
	    	spaArray[0] = new Packages.alamotv.hdm.functions.types.struct.SetParameterAttributesStructDTO("Device.ManagementServer.UDPConnectionRequestAddress", true, 2 , false, null);
	    	spaArray[1] = new Packages.alamotv.hdm.functions.types.struct.SetParameterAttributesStructDTO("Device.ManagementServer.NATDetected", true, 2 , false, null);

	    	var spaDTO = new Packages.alamotv.hdm.functions.types.request.SetParameterAttributesDTO(spaArray);
	    	var jcfResult2 = execPrimitive("setParameterAttributes", spaDTO);
	    	if (!jcfResult2.isSuccess()) {
	    		_log.error("Could not set active notification on UDPConnectionRequestAddress and NATDetected parameters.");
	    		_log.error("Reason for SPA failure: " + jcfResult2.getFaultMsgParams());
	        }
	    	else{
	    		_log.debug("STUN settings are successfully done.");
	    	}
	    }
    }else{
    	_log.warn("STUNServerAddress and STUNServerPort parameters are not defined in the SCE. No SPV will be executed on the device.");
    }
}

function doPortMapping(gwInfo){
	var interrupt = new JCFPortMappingInterrupt(gwInfo);
	return __interrupt(interrupt);
}

function compareName(a,b) {
	  var compare = -1;
	  if( a.getName() > b.getName() ) {
	    compare = 1;
	  } else if( a.getName() == b.getName() ) {
	    compare = 0;
	  }
	  return compare;
 }

function requestExternalCRSettings(primitiveResultHandler,gpvResponseDTO){
	var interrupt = new JCFExternalCRInterrupt(primitiveResultHandler,gpvResponseDTO);
	return __interrupt(interrupt);	
}