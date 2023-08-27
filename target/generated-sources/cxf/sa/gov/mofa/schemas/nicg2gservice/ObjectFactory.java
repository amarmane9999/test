
package sa.gov.mofa.schemas.nicg2gservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.mofa_visa_nic.BlackListDeporteesG2GRequestMessage;
import org.datacontract.schemas._2004._07.mofa_visa_nic.BlackListDeporteesG2GResponseMessage;
import org.datacontract.schemas._2004._07.mofa_visa_nic.BlackListRequestMessage;
import org.datacontract.schemas._2004._07.mofa_visa_nic.BlackListResponseMessage;
import org.datacontract.schemas._2004._07.mofa_visa_nic.CancelVisaG2GRequestMessage;
import org.datacontract.schemas._2004._07.mofa_visa_nic.CancelVisaG2GResponseMessage;
import org.datacontract.schemas._2004._07.mofa_visa_nic.CitizenInformationRequestMessage;
import org.datacontract.schemas._2004._07.mofa_visa_nic.CitizenInformationResponseMessage;
import org.datacontract.schemas._2004._07.mofa_visa_nic.DeporteesRequestMessage;
import org.datacontract.schemas._2004._07.mofa_visa_nic.DeporteesResponseMessage;
import org.datacontract.schemas._2004._07.mofa_visa_nic.GetDeletedWorkVisaRequestMessage;
import org.datacontract.schemas._2004._07.mofa_visa_nic.GetDeletedWorkVisaResponseMessage;
import org.datacontract.schemas._2004._07.mofa_visa_nic.GetExitEntryVisaRequestMessage;
import org.datacontract.schemas._2004._07.mofa_visa_nic.GetExitEntryVisaResponseMessage;
import org.datacontract.schemas._2004._07.mofa_visa_nic.GetExitEntryVisaWithResidentInfoRequestMessage;
import org.datacontract.schemas._2004._07.mofa_visa_nic.GetExitEntryVisaWithResidentInfoResponseMessage;
import org.datacontract.schemas._2004._07.mofa_visa_nic.GetNicRejectedVisaRequestMessage;
import org.datacontract.schemas._2004._07.mofa_visa_nic.GetNicRejectedVisaResponseMessage;
import org.datacontract.schemas._2004._07.mofa_visa_nic.GetOrganizationVisaInfoRequestMessage;
import org.datacontract.schemas._2004._07.mofa_visa_nic.GetOrganizationVisaInfoResponseMessage;
import org.datacontract.schemas._2004._07.mofa_visa_nic.GetWorkVisaDataRequestMessage;
import org.datacontract.schemas._2004._07.mofa_visa_nic.GetWorkVisaDataResponseMessage;
import org.datacontract.schemas._2004._07.mofa_visa_nic.ResidentInformationRequestMessage;
import org.datacontract.schemas._2004._07.mofa_visa_nic.ResidentInformationResponseMessage;
import org.datacontract.schemas._2004._07.mofa_visa_nic.SendVisaG2GRequestMessage;
import org.datacontract.schemas._2004._07.mofa_visa_nic.SendVisaG2GResponseMessage;
import org.datacontract.schemas._2004._07.mofa_visa_nic.ValidateVisaDataRequestMessage;
import org.datacontract.schemas._2004._07.mofa_visa_nic.ValidateVisaDataResponseMessage;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the sa.gov.mofa.schemas.nicg2gservice package. 
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

    private final static QName _BlackListRequestMessage_QNAME = new QName("http://schemas.mofa.gov.sa/NicG2GService/", "BlackListRequestMessage");
    private final static QName _BlackListResponseMessage_QNAME = new QName("http://schemas.mofa.gov.sa/NicG2GService/", "BlackListResponseMessage");
    private final static QName _DeporteesRequestMessage_QNAME = new QName("http://schemas.mofa.gov.sa/NicG2GService/", "DeporteesRequestMessage");
    private final static QName _DeporteesResponseMessage_QNAME = new QName("http://schemas.mofa.gov.sa/NicG2GService/", "DeporteesResponseMessage");
    private final static QName _ResidentInformationRequestMessage_QNAME = new QName("http://schemas.mofa.gov.sa/NicG2GService/", "ResidentInformationRequestMessage");
    private final static QName _ResidentInformationResponseMessage_QNAME = new QName("http://schemas.mofa.gov.sa/NicG2GService/", "ResidentInformationResponseMessage");
    private final static QName _CitizenInformationRequestMessage_QNAME = new QName("http://schemas.mofa.gov.sa/NicG2GService/", "CitizenInformationRequestMessage");
    private final static QName _CitizenInformationResponseMessage_QNAME = new QName("http://schemas.mofa.gov.sa/NicG2GService/", "CitizenInformationResponseMessage");
    private final static QName _ValidateVisaDataRequestMessage_QNAME = new QName("http://schemas.mofa.gov.sa/NicG2GService/", "ValidateVisaDataRequestMessage");
    private final static QName _ValidateVisaDataResponseMessage_QNAME = new QName("http://schemas.mofa.gov.sa/NicG2GService/", "ValidateVisaDataResponseMessage");
    private final static QName _SendVisaG2GRequestMessage_QNAME = new QName("http://schemas.mofa.gov.sa/NicG2GService/", "SendVisaG2gRequestMessage");
    private final static QName _SendVisaG2GResponseMessage_QNAME = new QName("http://schemas.mofa.gov.sa/NicG2GService/", "SendVisaG2gResponseMessage");
    private final static QName _CancelVisaG2GRequestMessage_QNAME = new QName("http://schemas.mofa.gov.sa/NicG2GService/", "CancelVisaG2gRequestMessage");
    private final static QName _CancelVisaG2GResponseMessage_QNAME = new QName("http://schemas.mofa.gov.sa/NicG2GService/", "CancelVisaG2gResponseMessage");
    private final static QName _BlackListDeporteesG2GRequestMessage_QNAME = new QName("http://schemas.mofa.gov.sa/NicG2GService/", "BlackListDeporteesG2gRequestMessage");
    private final static QName _BlackListDeporteesG2GResponseMessage_QNAME = new QName("http://schemas.mofa.gov.sa/NicG2GService/", "BlackListDeporteesG2gResponseMessage");
    private final static QName _GetOrganizationVisaInfoRequestMessage_QNAME = new QName("http://schemas.mofa.gov.sa/NicG2GService/", "GetOrganizationVisaInfoRequestMessage");
    private final static QName _GetOrganizationVisaInfoResponseMessage_QNAME = new QName("http://schemas.mofa.gov.sa/NicG2GService/", "GetOrganizationVisaInfoResponseMessage");
    private final static QName _GetNicRejectedVisaRequestMessage_QNAME = new QName("http://schemas.mofa.gov.sa/NicG2GService/", "GetNicRejectedVisaRequestMessage");
    private final static QName _GetNicRejectedVisaResponseMessage_QNAME = new QName("http://schemas.mofa.gov.sa/NicG2GService/", "GetNicRejectedVisaResponseMessage");
    private final static QName _GetExitEntryVisaRequestMessage_QNAME = new QName("http://schemas.mofa.gov.sa/NicG2GService/", "GetExitEntryVisaRequestMessage");
    private final static QName _GetExitEntryVisaResponseMessage_QNAME = new QName("http://schemas.mofa.gov.sa/NicG2GService/", "GetExitEntryVisaResponseMessage");
    private final static QName _GetExitEntryVisaWithResidentInfoRequestMessage_QNAME = new QName("http://schemas.mofa.gov.sa/NicG2GService/", "GetExitEntryVisaWithResidentInfoRequestMessage");
    private final static QName _GetExitEntryVisaWithResidentInfoResponseMessage_QNAME = new QName("http://schemas.mofa.gov.sa/NicG2GService/", "GetExitEntryVisaWithResidentInfoResponseMessage");
    private final static QName _GetWorkVisaDataRequestMessage_QNAME = new QName("http://schemas.mofa.gov.sa/NicG2GService/", "GetWorkVisaDataRequestMessage");
    private final static QName _GetWorkVisaDataResponseMessage_QNAME = new QName("http://schemas.mofa.gov.sa/NicG2GService/", "GetWorkVisaDataResponseMessage");
    private final static QName _GetDeletedWorkVisaRequestMessage_QNAME = new QName("http://schemas.mofa.gov.sa/NicG2GService/", "GetDeletedWorkVisaRequestMessage");
    private final static QName _GetDeletedWorkVisaResponseMessage_QNAME = new QName("http://schemas.mofa.gov.sa/NicG2GService/", "GetDeletedWorkVisaResponseMessage");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: sa.gov.mofa.schemas.nicg2gservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BlackListRequestMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BlackListRequestMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.mofa.gov.sa/NicG2GService/", name = "BlackListRequestMessage")
    public JAXBElement<BlackListRequestMessage> createBlackListRequestMessage(BlackListRequestMessage value) {
        return new JAXBElement<BlackListRequestMessage>(_BlackListRequestMessage_QNAME, BlackListRequestMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BlackListResponseMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BlackListResponseMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.mofa.gov.sa/NicG2GService/", name = "BlackListResponseMessage")
    public JAXBElement<BlackListResponseMessage> createBlackListResponseMessage(BlackListResponseMessage value) {
        return new JAXBElement<BlackListResponseMessage>(_BlackListResponseMessage_QNAME, BlackListResponseMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeporteesRequestMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeporteesRequestMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.mofa.gov.sa/NicG2GService/", name = "DeporteesRequestMessage")
    public JAXBElement<DeporteesRequestMessage> createDeporteesRequestMessage(DeporteesRequestMessage value) {
        return new JAXBElement<DeporteesRequestMessage>(_DeporteesRequestMessage_QNAME, DeporteesRequestMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeporteesResponseMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeporteesResponseMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.mofa.gov.sa/NicG2GService/", name = "DeporteesResponseMessage")
    public JAXBElement<DeporteesResponseMessage> createDeporteesResponseMessage(DeporteesResponseMessage value) {
        return new JAXBElement<DeporteesResponseMessage>(_DeporteesResponseMessage_QNAME, DeporteesResponseMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResidentInformationRequestMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResidentInformationRequestMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.mofa.gov.sa/NicG2GService/", name = "ResidentInformationRequestMessage")
    public JAXBElement<ResidentInformationRequestMessage> createResidentInformationRequestMessage(ResidentInformationRequestMessage value) {
        return new JAXBElement<ResidentInformationRequestMessage>(_ResidentInformationRequestMessage_QNAME, ResidentInformationRequestMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResidentInformationResponseMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResidentInformationResponseMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.mofa.gov.sa/NicG2GService/", name = "ResidentInformationResponseMessage")
    public JAXBElement<ResidentInformationResponseMessage> createResidentInformationResponseMessage(ResidentInformationResponseMessage value) {
        return new JAXBElement<ResidentInformationResponseMessage>(_ResidentInformationResponseMessage_QNAME, ResidentInformationResponseMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CitizenInformationRequestMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CitizenInformationRequestMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.mofa.gov.sa/NicG2GService/", name = "CitizenInformationRequestMessage")
    public JAXBElement<CitizenInformationRequestMessage> createCitizenInformationRequestMessage(CitizenInformationRequestMessage value) {
        return new JAXBElement<CitizenInformationRequestMessage>(_CitizenInformationRequestMessage_QNAME, CitizenInformationRequestMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CitizenInformationResponseMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CitizenInformationResponseMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.mofa.gov.sa/NicG2GService/", name = "CitizenInformationResponseMessage")
    public JAXBElement<CitizenInformationResponseMessage> createCitizenInformationResponseMessage(CitizenInformationResponseMessage value) {
        return new JAXBElement<CitizenInformationResponseMessage>(_CitizenInformationResponseMessage_QNAME, CitizenInformationResponseMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateVisaDataRequestMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidateVisaDataRequestMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.mofa.gov.sa/NicG2GService/", name = "ValidateVisaDataRequestMessage")
    public JAXBElement<ValidateVisaDataRequestMessage> createValidateVisaDataRequestMessage(ValidateVisaDataRequestMessage value) {
        return new JAXBElement<ValidateVisaDataRequestMessage>(_ValidateVisaDataRequestMessage_QNAME, ValidateVisaDataRequestMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateVisaDataResponseMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidateVisaDataResponseMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.mofa.gov.sa/NicG2GService/", name = "ValidateVisaDataResponseMessage")
    public JAXBElement<ValidateVisaDataResponseMessage> createValidateVisaDataResponseMessage(ValidateVisaDataResponseMessage value) {
        return new JAXBElement<ValidateVisaDataResponseMessage>(_ValidateVisaDataResponseMessage_QNAME, ValidateVisaDataResponseMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendVisaG2GRequestMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendVisaG2GRequestMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.mofa.gov.sa/NicG2GService/", name = "SendVisaG2gRequestMessage")
    public JAXBElement<SendVisaG2GRequestMessage> createSendVisaG2GRequestMessage(SendVisaG2GRequestMessage value) {
        return new JAXBElement<SendVisaG2GRequestMessage>(_SendVisaG2GRequestMessage_QNAME, SendVisaG2GRequestMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendVisaG2GResponseMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendVisaG2GResponseMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.mofa.gov.sa/NicG2GService/", name = "SendVisaG2gResponseMessage")
    public JAXBElement<SendVisaG2GResponseMessage> createSendVisaG2GResponseMessage(SendVisaG2GResponseMessage value) {
        return new JAXBElement<SendVisaG2GResponseMessage>(_SendVisaG2GResponseMessage_QNAME, SendVisaG2GResponseMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelVisaG2GRequestMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CancelVisaG2GRequestMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.mofa.gov.sa/NicG2GService/", name = "CancelVisaG2gRequestMessage")
    public JAXBElement<CancelVisaG2GRequestMessage> createCancelVisaG2GRequestMessage(CancelVisaG2GRequestMessage value) {
        return new JAXBElement<CancelVisaG2GRequestMessage>(_CancelVisaG2GRequestMessage_QNAME, CancelVisaG2GRequestMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelVisaG2GResponseMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CancelVisaG2GResponseMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.mofa.gov.sa/NicG2GService/", name = "CancelVisaG2gResponseMessage")
    public JAXBElement<CancelVisaG2GResponseMessage> createCancelVisaG2GResponseMessage(CancelVisaG2GResponseMessage value) {
        return new JAXBElement<CancelVisaG2GResponseMessage>(_CancelVisaG2GResponseMessage_QNAME, CancelVisaG2GResponseMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BlackListDeporteesG2GRequestMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BlackListDeporteesG2GRequestMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.mofa.gov.sa/NicG2GService/", name = "BlackListDeporteesG2gRequestMessage")
    public JAXBElement<BlackListDeporteesG2GRequestMessage> createBlackListDeporteesG2GRequestMessage(BlackListDeporteesG2GRequestMessage value) {
        return new JAXBElement<BlackListDeporteesG2GRequestMessage>(_BlackListDeporteesG2GRequestMessage_QNAME, BlackListDeporteesG2GRequestMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BlackListDeporteesG2GResponseMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BlackListDeporteesG2GResponseMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.mofa.gov.sa/NicG2GService/", name = "BlackListDeporteesG2gResponseMessage")
    public JAXBElement<BlackListDeporteesG2GResponseMessage> createBlackListDeporteesG2GResponseMessage(BlackListDeporteesG2GResponseMessage value) {
        return new JAXBElement<BlackListDeporteesG2GResponseMessage>(_BlackListDeporteesG2GResponseMessage_QNAME, BlackListDeporteesG2GResponseMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrganizationVisaInfoRequestMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetOrganizationVisaInfoRequestMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.mofa.gov.sa/NicG2GService/", name = "GetOrganizationVisaInfoRequestMessage")
    public JAXBElement<GetOrganizationVisaInfoRequestMessage> createGetOrganizationVisaInfoRequestMessage(GetOrganizationVisaInfoRequestMessage value) {
        return new JAXBElement<GetOrganizationVisaInfoRequestMessage>(_GetOrganizationVisaInfoRequestMessage_QNAME, GetOrganizationVisaInfoRequestMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrganizationVisaInfoResponseMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetOrganizationVisaInfoResponseMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.mofa.gov.sa/NicG2GService/", name = "GetOrganizationVisaInfoResponseMessage")
    public JAXBElement<GetOrganizationVisaInfoResponseMessage> createGetOrganizationVisaInfoResponseMessage(GetOrganizationVisaInfoResponseMessage value) {
        return new JAXBElement<GetOrganizationVisaInfoResponseMessage>(_GetOrganizationVisaInfoResponseMessage_QNAME, GetOrganizationVisaInfoResponseMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNicRejectedVisaRequestMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetNicRejectedVisaRequestMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.mofa.gov.sa/NicG2GService/", name = "GetNicRejectedVisaRequestMessage")
    public JAXBElement<GetNicRejectedVisaRequestMessage> createGetNicRejectedVisaRequestMessage(GetNicRejectedVisaRequestMessage value) {
        return new JAXBElement<GetNicRejectedVisaRequestMessage>(_GetNicRejectedVisaRequestMessage_QNAME, GetNicRejectedVisaRequestMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNicRejectedVisaResponseMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetNicRejectedVisaResponseMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.mofa.gov.sa/NicG2GService/", name = "GetNicRejectedVisaResponseMessage")
    public JAXBElement<GetNicRejectedVisaResponseMessage> createGetNicRejectedVisaResponseMessage(GetNicRejectedVisaResponseMessage value) {
        return new JAXBElement<GetNicRejectedVisaResponseMessage>(_GetNicRejectedVisaResponseMessage_QNAME, GetNicRejectedVisaResponseMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetExitEntryVisaRequestMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetExitEntryVisaRequestMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.mofa.gov.sa/NicG2GService/", name = "GetExitEntryVisaRequestMessage")
    public JAXBElement<GetExitEntryVisaRequestMessage> createGetExitEntryVisaRequestMessage(GetExitEntryVisaRequestMessage value) {
        return new JAXBElement<GetExitEntryVisaRequestMessage>(_GetExitEntryVisaRequestMessage_QNAME, GetExitEntryVisaRequestMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetExitEntryVisaResponseMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetExitEntryVisaResponseMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.mofa.gov.sa/NicG2GService/", name = "GetExitEntryVisaResponseMessage")
    public JAXBElement<GetExitEntryVisaResponseMessage> createGetExitEntryVisaResponseMessage(GetExitEntryVisaResponseMessage value) {
        return new JAXBElement<GetExitEntryVisaResponseMessage>(_GetExitEntryVisaResponseMessage_QNAME, GetExitEntryVisaResponseMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetExitEntryVisaWithResidentInfoRequestMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetExitEntryVisaWithResidentInfoRequestMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.mofa.gov.sa/NicG2GService/", name = "GetExitEntryVisaWithResidentInfoRequestMessage")
    public JAXBElement<GetExitEntryVisaWithResidentInfoRequestMessage> createGetExitEntryVisaWithResidentInfoRequestMessage(GetExitEntryVisaWithResidentInfoRequestMessage value) {
        return new JAXBElement<GetExitEntryVisaWithResidentInfoRequestMessage>(_GetExitEntryVisaWithResidentInfoRequestMessage_QNAME, GetExitEntryVisaWithResidentInfoRequestMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetExitEntryVisaWithResidentInfoResponseMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetExitEntryVisaWithResidentInfoResponseMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.mofa.gov.sa/NicG2GService/", name = "GetExitEntryVisaWithResidentInfoResponseMessage")
    public JAXBElement<GetExitEntryVisaWithResidentInfoResponseMessage> createGetExitEntryVisaWithResidentInfoResponseMessage(GetExitEntryVisaWithResidentInfoResponseMessage value) {
        return new JAXBElement<GetExitEntryVisaWithResidentInfoResponseMessage>(_GetExitEntryVisaWithResidentInfoResponseMessage_QNAME, GetExitEntryVisaWithResidentInfoResponseMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWorkVisaDataRequestMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetWorkVisaDataRequestMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.mofa.gov.sa/NicG2GService/", name = "GetWorkVisaDataRequestMessage")
    public JAXBElement<GetWorkVisaDataRequestMessage> createGetWorkVisaDataRequestMessage(GetWorkVisaDataRequestMessage value) {
        return new JAXBElement<GetWorkVisaDataRequestMessage>(_GetWorkVisaDataRequestMessage_QNAME, GetWorkVisaDataRequestMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWorkVisaDataResponseMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetWorkVisaDataResponseMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.mofa.gov.sa/NicG2GService/", name = "GetWorkVisaDataResponseMessage")
    public JAXBElement<GetWorkVisaDataResponseMessage> createGetWorkVisaDataResponseMessage(GetWorkVisaDataResponseMessage value) {
        return new JAXBElement<GetWorkVisaDataResponseMessage>(_GetWorkVisaDataResponseMessage_QNAME, GetWorkVisaDataResponseMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeletedWorkVisaRequestMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDeletedWorkVisaRequestMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.mofa.gov.sa/NicG2GService/", name = "GetDeletedWorkVisaRequestMessage")
    public JAXBElement<GetDeletedWorkVisaRequestMessage> createGetDeletedWorkVisaRequestMessage(GetDeletedWorkVisaRequestMessage value) {
        return new JAXBElement<GetDeletedWorkVisaRequestMessage>(_GetDeletedWorkVisaRequestMessage_QNAME, GetDeletedWorkVisaRequestMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeletedWorkVisaResponseMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDeletedWorkVisaResponseMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.mofa.gov.sa/NicG2GService/", name = "GetDeletedWorkVisaResponseMessage")
    public JAXBElement<GetDeletedWorkVisaResponseMessage> createGetDeletedWorkVisaResponseMessage(GetDeletedWorkVisaResponseMessage value) {
        return new JAXBElement<GetDeletedWorkVisaResponseMessage>(_GetDeletedWorkVisaResponseMessage_QNAME, GetDeletedWorkVisaResponseMessage.class, null, value);
    }

}
