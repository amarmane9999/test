
package sa.gov.mofa.schemas.esb._2014._12;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the sa.gov.mofa.schemas.esb._2014._12 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ContextInformation_QNAME = new QName("http://schemas.mofa.gov.sa/esb/2014/12/", "ContextInformation");
    private final static QName _Languages_QNAME = new QName("http://schemas.mofa.gov.sa/esb/2014/12/", "Languages");
    private final static QName _Credential_QNAME = new QName("http://schemas.mofa.gov.sa/esb/2014/12/", "Credential");
    private final static QName _PasswordTypes_QNAME = new QName("http://schemas.mofa.gov.sa/esb/2014/12/", "PasswordTypes");
    private final static QName _ResponseResult_QNAME = new QName("http://schemas.mofa.gov.sa/esb/2014/12/", "ResponseResult");
    private final static QName _ResponseStatuses_QNAME = new QName("http://schemas.mofa.gov.sa/esb/2014/12/", "ResponseStatuses");
    private final static QName _SeverityLevels_QNAME = new QName("http://schemas.mofa.gov.sa/esb/2014/12/", "SeverityLevels");
    private final static QName _ResponseDetails_QNAME = new QName("http://schemas.mofa.gov.sa/esb/2014/12/", "ResponseDetails");
    private final static QName _ResponseDetail_QNAME = new QName("http://schemas.mofa.gov.sa/esb/2014/12/", "ResponseDetail");
    private final static QName _EsbFault_QNAME = new QName("http://schemas.mofa.gov.sa/esb/2014/12/", "EsbFault");
    private final static QName _ErrorDetails_QNAME = new QName("http://schemas.mofa.gov.sa/esb/2014/12/", "ErrorDetails");
    private final static QName _ErrorDetail_QNAME = new QName("http://schemas.mofa.gov.sa/esb/2014/12/", "ErrorDetail");
    private final static QName _ErrorDetailMessage_QNAME = new QName("http://schemas.mofa.gov.sa/esb/2014/12/", "Message");
    private final static QName _EsbFaultErrorMessage_QNAME = new QName("http://schemas.mofa.gov.sa/esb/2014/12/", "ErrorMessage");
    private final static QName _ResponseDetailMessageAr_QNAME = new QName("http://schemas.mofa.gov.sa/esb/2014/12/", "MessageAr");
    private final static QName _ResponseResultResponseMessage_QNAME = new QName("http://schemas.mofa.gov.sa/esb/2014/12/", "ResponseMessage");
    private final static QName _CredentialUserName_QNAME = new QName("http://schemas.mofa.gov.sa/esb/2014/12/", "UserName");
    private final static QName _CredentialPassword_QNAME = new QName("http://schemas.mofa.gov.sa/esb/2014/12/", "Password");
    private final static QName _ContextInformationClientUsername_QNAME = new QName("http://schemas.mofa.gov.sa/esb/2014/12/", "ClientUsername");
    private final static QName _ContextInformationClientDisplayName_QNAME = new QName("http://schemas.mofa.gov.sa/esb/2014/12/", "ClientDisplayName");
    private final static QName _ContextInformationClientDateTime_QNAME = new QName("http://schemas.mofa.gov.sa/esb/2014/12/", "ClientDateTime");
    private final static QName _ContextInformationClientSessionId_QNAME = new QName("http://schemas.mofa.gov.sa/esb/2014/12/", "ClientSessionId");
    private final static QName _ContextInformationClientIp_QNAME = new QName("http://schemas.mofa.gov.sa/esb/2014/12/", "ClientIp");
    private final static QName _ContextInformationConsumerStationName_QNAME = new QName("http://schemas.mofa.gov.sa/esb/2014/12/", "ConsumerStationName");
    private final static QName _ContextInformationConsumerStationIp_QNAME = new QName("http://schemas.mofa.gov.sa/esb/2014/12/", "ConsumerStationIp");
    private final static QName _ContextInformationExtraMetadata_QNAME = new QName("http://schemas.mofa.gov.sa/esb/2014/12/", "ExtraMetadata");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: sa.gov.mofa.schemas.esb._2014._12
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ContextInformation }
     * 
     */
    public ContextInformation createContextInformation() {
        return new ContextInformation();
    }

    /**
     * Create an instance of {@link Credential }
     * 
     */
    public Credential createCredential() {
        return new Credential();
    }

    /**
     * Create an instance of {@link ResponseResult }
     * 
     */
    public ResponseResult createResponseResult() {
        return new ResponseResult();
    }

    /**
     * Create an instance of {@link ResponseDetails }
     * 
     */
    public ResponseDetails createResponseDetails() {
        return new ResponseDetails();
    }

    /**
     * Create an instance of {@link ResponseDetail }
     * 
     */
    public ResponseDetail createResponseDetail() {
        return new ResponseDetail();
    }

    /**
     * Create an instance of {@link EsbFault }
     * 
     */
    public EsbFault createEsbFault() {
        return new EsbFault();
    }

    /**
     * Create an instance of {@link ErrorDetails }
     * 
     */
    public ErrorDetails createErrorDetails() {
        return new ErrorDetails();
    }

    /**
     * Create an instance of {@link ErrorDetail }
     * 
     */
    public ErrorDetail createErrorDetail() {
        return new ErrorDetail();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContextInformation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ContextInformation }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.mofa.gov.sa/esb/2014/12/", name = "ContextInformation")
    public JAXBElement<ContextInformation> createContextInformation(ContextInformation value) {
        return new JAXBElement<ContextInformation>(_ContextInformation_QNAME, ContextInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Languages }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Languages }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.mofa.gov.sa/esb/2014/12/", name = "Languages")
    public JAXBElement<Languages> createLanguages(Languages value) {
        return new JAXBElement<Languages>(_Languages_QNAME, Languages.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Credential }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Credential }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.mofa.gov.sa/esb/2014/12/", name = "Credential")
    public JAXBElement<Credential> createCredential(Credential value) {
        return new JAXBElement<Credential>(_Credential_QNAME, Credential.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PasswordTypes }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PasswordTypes }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.mofa.gov.sa/esb/2014/12/", name = "PasswordTypes")
    public JAXBElement<PasswordTypes> createPasswordTypes(PasswordTypes value) {
        return new JAXBElement<PasswordTypes>(_PasswordTypes_QNAME, PasswordTypes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResponseResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.mofa.gov.sa/esb/2014/12/", name = "ResponseResult")
    public JAXBElement<ResponseResult> createResponseResult(ResponseResult value) {
        return new JAXBElement<ResponseResult>(_ResponseResult_QNAME, ResponseResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseStatuses }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResponseStatuses }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.mofa.gov.sa/esb/2014/12/", name = "ResponseStatuses")
    public JAXBElement<ResponseStatuses> createResponseStatuses(ResponseStatuses value) {
        return new JAXBElement<ResponseStatuses>(_ResponseStatuses_QNAME, ResponseStatuses.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeverityLevels }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SeverityLevels }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.mofa.gov.sa/esb/2014/12/", name = "SeverityLevels")
    public JAXBElement<SeverityLevels> createSeverityLevels(SeverityLevels value) {
        return new JAXBElement<SeverityLevels>(_SeverityLevels_QNAME, SeverityLevels.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseDetails }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResponseDetails }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.mofa.gov.sa/esb/2014/12/", name = "ResponseDetails")
    public JAXBElement<ResponseDetails> createResponseDetails(ResponseDetails value) {
        return new JAXBElement<ResponseDetails>(_ResponseDetails_QNAME, ResponseDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseDetail }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResponseDetail }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.mofa.gov.sa/esb/2014/12/", name = "ResponseDetail")
    public JAXBElement<ResponseDetail> createResponseDetail(ResponseDetail value) {
        return new JAXBElement<ResponseDetail>(_ResponseDetail_QNAME, ResponseDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EsbFault }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EsbFault }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.mofa.gov.sa/esb/2014/12/", name = "EsbFault")
    public JAXBElement<EsbFault> createEsbFault(EsbFault value) {
        return new JAXBElement<EsbFault>(_EsbFault_QNAME, EsbFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrorDetails }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ErrorDetails }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.mofa.gov.sa/esb/2014/12/", name = "ErrorDetails")
    public JAXBElement<ErrorDetails> createErrorDetails(ErrorDetails value) {
        return new JAXBElement<ErrorDetails>(_ErrorDetails_QNAME, ErrorDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrorDetail }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ErrorDetail }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.mofa.gov.sa/esb/2014/12/", name = "ErrorDetail")
    public JAXBElement<ErrorDetail> createErrorDetail(ErrorDetail value) {
        return new JAXBElement<ErrorDetail>(_ErrorDetail_QNAME, ErrorDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.mofa.gov.sa/esb/2014/12/", name = "Message", scope = ErrorDetail.class)
    public JAXBElement<String> createErrorDetailMessage(String value) {
        return new JAXBElement<String>(_ErrorDetailMessage_QNAME, String.class, ErrorDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.mofa.gov.sa/esb/2014/12/", name = "ErrorMessage", scope = EsbFault.class)
    public JAXBElement<String> createEsbFaultErrorMessage(String value) {
        return new JAXBElement<String>(_EsbFaultErrorMessage_QNAME, String.class, EsbFault.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrorDetails }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ErrorDetails }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.mofa.gov.sa/esb/2014/12/", name = "ErrorDetails", scope = EsbFault.class)
    public JAXBElement<ErrorDetails> createEsbFaultErrorDetails(ErrorDetails value) {
        return new JAXBElement<ErrorDetails>(_ErrorDetails_QNAME, ErrorDetails.class, EsbFault.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.mofa.gov.sa/esb/2014/12/", name = "Message", scope = ResponseDetail.class)
    public JAXBElement<String> createResponseDetailMessage(String value) {
        return new JAXBElement<String>(_ErrorDetailMessage_QNAME, String.class, ResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.mofa.gov.sa/esb/2014/12/", name = "MessageAr", scope = ResponseDetail.class)
    public JAXBElement<String> createResponseDetailMessageAr(String value) {
        return new JAXBElement<String>(_ResponseDetailMessageAr_QNAME, String.class, ResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.mofa.gov.sa/esb/2014/12/", name = "ResponseMessage", scope = ResponseResult.class)
    public JAXBElement<String> createResponseResultResponseMessage(String value) {
        return new JAXBElement<String>(_ResponseResultResponseMessage_QNAME, String.class, ResponseResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseDetails }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResponseDetails }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.mofa.gov.sa/esb/2014/12/", name = "ResponseDetails", scope = ResponseResult.class)
    public JAXBElement<ResponseDetails> createResponseResultResponseDetails(ResponseDetails value) {
        return new JAXBElement<ResponseDetails>(_ResponseDetails_QNAME, ResponseDetails.class, ResponseResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.mofa.gov.sa/esb/2014/12/", name = "UserName", scope = Credential.class)
    public JAXBElement<String> createCredentialUserName(String value) {
        return new JAXBElement<String>(_CredentialUserName_QNAME, String.class, Credential.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.mofa.gov.sa/esb/2014/12/", name = "Password", scope = Credential.class)
    public JAXBElement<String> createCredentialPassword(String value) {
        return new JAXBElement<String>(_CredentialPassword_QNAME, String.class, Credential.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.mofa.gov.sa/esb/2014/12/", name = "ClientUsername", scope = ContextInformation.class)
    public JAXBElement<String> createContextInformationClientUsername(String value) {
        return new JAXBElement<String>(_ContextInformationClientUsername_QNAME, String.class, ContextInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.mofa.gov.sa/esb/2014/12/", name = "ClientDisplayName", scope = ContextInformation.class)
    public JAXBElement<String> createContextInformationClientDisplayName(String value) {
        return new JAXBElement<String>(_ContextInformationClientDisplayName_QNAME, String.class, ContextInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.mofa.gov.sa/esb/2014/12/", name = "ClientDateTime", scope = ContextInformation.class)
    public JAXBElement<XMLGregorianCalendar> createContextInformationClientDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ContextInformationClientDateTime_QNAME, XMLGregorianCalendar.class, ContextInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.mofa.gov.sa/esb/2014/12/", name = "ClientSessionId", scope = ContextInformation.class)
    public JAXBElement<String> createContextInformationClientSessionId(String value) {
        return new JAXBElement<String>(_ContextInformationClientSessionId_QNAME, String.class, ContextInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.mofa.gov.sa/esb/2014/12/", name = "ClientIp", scope = ContextInformation.class)
    public JAXBElement<String> createContextInformationClientIp(String value) {
        return new JAXBElement<String>(_ContextInformationClientIp_QNAME, String.class, ContextInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.mofa.gov.sa/esb/2014/12/", name = "ConsumerStationName", scope = ContextInformation.class)
    public JAXBElement<String> createContextInformationConsumerStationName(String value) {
        return new JAXBElement<String>(_ContextInformationConsumerStationName_QNAME, String.class, ContextInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.mofa.gov.sa/esb/2014/12/", name = "ConsumerStationIp", scope = ContextInformation.class)
    public JAXBElement<String> createContextInformationConsumerStationIp(String value) {
        return new JAXBElement<String>(_ContextInformationConsumerStationIp_QNAME, String.class, ContextInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.mofa.gov.sa/esb/2014/12/", name = "ExtraMetadata", scope = ContextInformation.class)
    public JAXBElement<String> createContextInformationExtraMetadata(String value) {
        return new JAXBElement<String>(_ContextInformationExtraMetadata_QNAME, String.class, ContextInformation.class, value);
    }

}
