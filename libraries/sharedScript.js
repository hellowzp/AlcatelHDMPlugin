// Used when trying to invoke a primitive function
// Both single-session and multi-session functions will be handled
// For multi-session functions, one would provide a 2nd argument (irptHandler), for single-sessions only 1 argmument would be passed
function execPrimitive(functionName, primitiveParameter, primitiveResultHandler) {
	var params;
	// No primitiveParameter defined
	if( ! primitiveParameter  ) { 
		params = null;
	} else if (primitiveParameter instanceof java.lang.reflect.Array) {
        params = primitiveParameter;
    } else {
		params = new java.lang.reflect.Array.newInstance(java.lang.Object,1);
		params[0] = primitiveParameter;
	}
	
	var interrupt = new Packages.com.alcatel.hdm.jcf.JCFActionInterrupt(functionName, params, primitiveResultHandler);
	return __interrupt(interrupt);
}

function waitNextSession(nextSessionHandler) {
	var interrupt = new Packages.com.alcatel.hdm.jcf.JCFActionInterrupt("waitNextSession", null, nextSessionHandler);
	return __interrupt(interrupt);
}

// Dedicated method for performing a GPV, but without storing the results into the datamodel.
// No primitive data events should be stored if used in a multi-session custom function.
function execGPVWithoutCache(primitiveParameter) {
	var params;
	// No primitiveParameter defined
	if( ! primitiveParameter  ) { 
		params = null;
	} else if (primitiveParameter instanceof java.lang.reflect.Array) {
        params = primitiveParameter;
    } else {
		params = new java.lang.reflect.Array.newInstance(java.lang.Object,1);
		params[0] = primitiveParameter;
	}
	var interrupt = new Packages.com.alcatel.hdm.jcf.JCFGetParameterValuesActionInterrupt(params);
	return __interrupt(interrupt);
}

// Dedicated method for performing a GPV, but without storing the results into the datamodel.
// No primitive data events should be stored if used in a multi-session custom function.
function execSPVWithoutCache(primitiveParameter) {
	var params;
	// No primitiveParameter defined
	if( ! primitiveParameter  ) { 
		params = null;
	} else if (primitiveParameter instanceof java.lang.reflect.Array) {
        params = primitiveParameter;
    } else {
		params = new java.lang.reflect.Array.newInstance(java.lang.Object,1);
		params[0] = primitiveParameter;
	}
	var interrupt = new Packages.com.alcatel.hdm.jcf.JCFSetParameterValuesActionInterrupt(params);
	return __interrupt(interrupt);
}

function abort(faultCode, faultString, faultMsgParams) {

	var jcfResult = new Packages.com.alcatel.hdm.jcf.JCFResult(faultCode, faultString, faultMsgParams);
	var interrupt = new Packages.com.alcatel.hdm.jcf.JCFAbortInterrupt();
	interrupt.setJcfResult(jcfResult);
	
	return __interrupt(interrupt);
}
