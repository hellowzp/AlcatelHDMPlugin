package hdm.functions.types.response;

import com.sun.xml.bind.AnyTypeAdapter;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement
@XmlSeeAlso({StateChangeCompleteDTO.class, AddObjectResponseDTO.class, BackupResponseDTO.class, CancelTransferResponseDTO.class, CustomResponseDTO.class, CwmpCustomPreactivationResponseDTO.class, CwmpWaitExternalSystemResponseDTO.class, DataModelDiscoveryResponseDTO.class, DeleteObjectResponseDTO.class, DownloadResponseDTO.class, GetOptionsResponseDTO.class, GetParameterAttributesResponseDTO.class, GetParameterNamesResponseDTO.class, GetParameterValuesResponseDTO.class, GetRPCMethodsResponseDTO.class, KeyValueResponseDTO.class, ScheduleDownloadResponseDTO.class, SetParameterValuesResponseDTO.class, SnmpGetParameterValuesResponseDTO.class, UploadResponseDTO.class, StringResponseDTO.class})
@XmlJavaTypeAdapter(AnyTypeAdapter.class)
public abstract interface ResponseDTO
{
}