
package org.datacontract.schemas._2004._07.mofa_visa_nic;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdouble;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong;
import org.datacontract.schemas._2004._07.mofa_visa_nic_g2gservice.ArrayOfBlackListData;
import org.datacontract.schemas._2004._07.mofa_visa_nic_g2gservice.ArrayOfCancelVisaStatus;
import org.datacontract.schemas._2004._07.mofa_visa_nic_g2gservice.ArrayOfVisaDataX0020;
import org.datacontract.schemas._2004._07.mofa_visa_nic_g2gservice.ArrayOfVisaStatusX0020;
import org.datacontract.schemas._2004._07.mofa_visa_nic_g2gservice.BlackListDeporteesParam;
import org.datacontract.schemas._2004._07.mofa_visa_nic_g2gservice.BlackListParam;
import org.datacontract.schemas._2004._07.mofa_visa_nic_g2gservice.CitizenInformationData;
import org.datacontract.schemas._2004._07.mofa_visa_nic_g2gservice.CitizenInformationParam;
import org.datacontract.schemas._2004._07.mofa_visa_nic_g2gservice.DeporteesData;
import org.datacontract.schemas._2004._07.mofa_visa_nic_g2gservice.DeporteesParam;
import org.datacontract.schemas._2004._07.mofa_visa_nic_g2gservice.ExitEntryVisaData;
import org.datacontract.schemas._2004._07.mofa_visa_nic_g2gservice.ExitEntryVisaParam;
import org.datacontract.schemas._2004._07.mofa_visa_nic_g2gservice.ResidentInformationData;
import org.datacontract.schemas._2004._07.mofa_visa_nic_g2gservice.ResidentInformationParam;
import org.datacontract.schemas._2004._07.mofa_visa_nic_g2gservice.VisaDataX0020;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.mofa_visa_nic package. 
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

    private final static QName _BlackListRequestMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", "BlackListRequestMessage");
    private final static QName _BlackListResponseMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", "BlackListResponseMessage");
    private final static QName _DeporteesRequestMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", "DeporteesRequestMessage");
    private final static QName _DeporteesResponseMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", "DeporteesResponseMessage");
    private final static QName _ResidentInformationRequestMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", "ResidentInformationRequestMessage");
    private final static QName _ResidentInformationResponseMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", "ResidentInformationResponseMessage");
    private final static QName _CitizenInformationRequestMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", "CitizenInformationRequestMessage");
    private final static QName _CitizenInformationResponseMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", "CitizenInformationResponseMessage");
    private final static QName _ValidateVisaDataRequestMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", "ValidateVisaDataRequestMessage");
    private final static QName _ValidateVisaDataResponseMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", "ValidateVisaDataResponseMessage");
    private final static QName _SendVisaG2GRequestMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", "SendVisaG2gRequestMessage");
    private final static QName _SendVisaG2GResponseMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", "SendVisaG2gResponseMessage");
    private final static QName _CancelVisaG2GRequestMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", "CancelVisaG2gRequestMessage");
    private final static QName _CancelVisaG2GResponseMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", "CancelVisaG2gResponseMessage");
    private final static QName _BlackListDeporteesG2GRequestMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", "BlackListDeporteesG2gRequestMessage");
    private final static QName _BlackListDeporteesG2GResponseMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", "BlackListDeporteesG2gResponseMessage");
    private final static QName _GetNicRejectedVisaRequestMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", "GetNicRejectedVisaRequestMessage");
    private final static QName _GetNicRejectedVisaResponseMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", "GetNicRejectedVisaResponseMessage");
    private final static QName _GetExitEntryVisaRequestMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", "GetExitEntryVisaRequestMessage");
    private final static QName _GetExitEntryVisaResponseMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", "GetExitEntryVisaResponseMessage");
    private final static QName _GetExitEntryVisaWithResidentInfoRequestMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", "GetExitEntryVisaWithResidentInfoRequestMessage");
    private final static QName _GetExitEntryVisaWithResidentInfoResponseMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", "GetExitEntryVisaWithResidentInfoResponseMessage");
    private final static QName _GetWorkVisaDataRequestMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", "GetWorkVisaDataRequestMessage");
    private final static QName _GetWorkVisaDataResponseMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", "GetWorkVisaDataResponseMessage");
    private final static QName _ArrayOfWorkVisaData_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", "ArrayOfWorkVisaData");
    private final static QName _WorkVisaData_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", "WorkVisaData");
    private final static QName _ArrayOfWorkVisaDetail_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", "ArrayOfWorkVisaDetail");
    private final static QName _WorkVisaDetail_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", "WorkVisaDetail");
    private final static QName _GetDeletedWorkVisaRequestMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", "GetDeletedWorkVisaRequestMessage");
    private final static QName _GetDeletedWorkVisaResponseMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", "GetDeletedWorkVisaResponseMessage");
    private final static QName _GetOrganizationVisaInfoRequestMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.ServiceSchema", "GetOrganizationVisaInfoRequestMessage");
    private final static QName _GetOrganizationVisaInfoResponseMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.ServiceSchema", "GetOrganizationVisaInfoResponseMessage");
    private final static QName _ArrayOfOrganizationVisaData_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.ServiceSchema", "ArrayOfOrganizationVisaData");
    private final static QName _OrganizationVisaData_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.ServiceSchema", "OrganizationVisaData");
    private final static QName _OrganizationVisaDataVisaStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.ServiceSchema", "VisaStatus");
    private final static QName _OrganizationVisaDataVisitorStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.ServiceSchema", "VisitorStatus");
    private final static QName _GetOrganizationVisaInfoResponseMessageListOrganizationVisaData_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.ServiceSchema", "ListOrganizationVisaData");
    private final static QName _GetDeletedWorkVisaResponseMessageBorderNumbers_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", "BorderNumbers");
    private final static QName _WorkVisaDetailNationality_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", "Nationality");
    private final static QName _WorkVisaDetailPersonName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", "PersonName");
    private final static QName _WorkVisaDataSponsorAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", "SponsorAddress");
    private final static QName _WorkVisaDataSponsorName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", "SponsorName");
    private final static QName _WorkVisaDataWorkVisaDetailList_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", "WorkVisaDetailList");
    private final static QName _GetWorkVisaDataResponseMessageWorkVisaDataList_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", "WorkVisaDataList");
    private final static QName _GetExitEntryVisaWithResidentInfoResponseMessageExitEntryVisaData_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", "ExitEntryVisaData");
    private final static QName _GetExitEntryVisaWithResidentInfoResponseMessageResidentInformationData_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", "ResidentInformationData");
    private final static QName _GetExitEntryVisaWithResidentInfoRequestMessageExitEntryVisaParam_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", "ExitEntryVisaParam");
    private final static QName _GetNicRejectedVisaResponseMessageVisaNumbers_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", "VisaNumbers");
    private final static QName _BlackListDeporteesG2GResponseMessageBlackListData_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", "BlackListData");
    private final static QName _BlackListDeporteesG2GRequestMessageBlackListDeporteesParam_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", "BlackListDeporteesParam");
    private final static QName _CancelVisaG2GResponseMessageCancelVisaStatusList_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", "CancelVisaStatusList");
    private final static QName _SendVisaG2GResponseMessageListVisaStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", "ListVisaStatus");
    private final static QName _SendVisaG2GRequestMessageListVisaData_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", "ListVisaData");
    private final static QName _ValidateVisaDataRequestMessageValidateVisaData_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", "ValidateVisaData");
    private final static QName _CitizenInformationResponseMessageCitizenInformationData_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", "CitizenInformationData");
    private final static QName _CitizenInformationRequestMessageCitizenInformationParam_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", "CitizenInformationParam");
    private final static QName _ResidentInformationRequestMessageResidentInformationParam_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", "ResidentInformationParam");
    private final static QName _DeporteesResponseMessageDeporteesData_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", "DeporteesData");
    private final static QName _DeporteesRequestMessageDeporteesRequestParam_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", "DeporteesRequestParam");
    private final static QName _BlackListResponseMessageBlackList_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", "BlackList");
    private final static QName _BlackListRequestMessageBlackListParam_QNAME = new QName("http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", "BlackListParam");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.mofa_visa_nic
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BlackListRequestMessage }
     * 
     */
    public BlackListRequestMessage createBlackListRequestMessage() {
        return new BlackListRequestMessage();
    }

    /**
     * Create an instance of {@link BlackListResponseMessage }
     * 
     */
    public BlackListResponseMessage createBlackListResponseMessage() {
        return new BlackListResponseMessage();
    }

    /**
     * Create an instance of {@link DeporteesRequestMessage }
     * 
     */
    public DeporteesRequestMessage createDeporteesRequestMessage() {
        return new DeporteesRequestMessage();
    }

    /**
     * Create an instance of {@link DeporteesResponseMessage }
     * 
     */
    public DeporteesResponseMessage createDeporteesResponseMessage() {
        return new DeporteesResponseMessage();
    }

    /**
     * Create an instance of {@link ResidentInformationRequestMessage }
     * 
     */
    public ResidentInformationRequestMessage createResidentInformationRequestMessage() {
        return new ResidentInformationRequestMessage();
    }

    /**
     * Create an instance of {@link ResidentInformationResponseMessage }
     * 
     */
    public ResidentInformationResponseMessage createResidentInformationResponseMessage() {
        return new ResidentInformationResponseMessage();
    }

    /**
     * Create an instance of {@link CitizenInformationRequestMessage }
     * 
     */
    public CitizenInformationRequestMessage createCitizenInformationRequestMessage() {
        return new CitizenInformationRequestMessage();
    }

    /**
     * Create an instance of {@link CitizenInformationResponseMessage }
     * 
     */
    public CitizenInformationResponseMessage createCitizenInformationResponseMessage() {
        return new CitizenInformationResponseMessage();
    }

    /**
     * Create an instance of {@link ValidateVisaDataRequestMessage }
     * 
     */
    public ValidateVisaDataRequestMessage createValidateVisaDataRequestMessage() {
        return new ValidateVisaDataRequestMessage();
    }

    /**
     * Create an instance of {@link ValidateVisaDataResponseMessage }
     * 
     */
    public ValidateVisaDataResponseMessage createValidateVisaDataResponseMessage() {
        return new ValidateVisaDataResponseMessage();
    }

    /**
     * Create an instance of {@link SendVisaG2GRequestMessage }
     * 
     */
    public SendVisaG2GRequestMessage createSendVisaG2GRequestMessage() {
        return new SendVisaG2GRequestMessage();
    }

    /**
     * Create an instance of {@link SendVisaG2GResponseMessage }
     * 
     */
    public SendVisaG2GResponseMessage createSendVisaG2GResponseMessage() {
        return new SendVisaG2GResponseMessage();
    }

    /**
     * Create an instance of {@link CancelVisaG2GRequestMessage }
     * 
     */
    public CancelVisaG2GRequestMessage createCancelVisaG2GRequestMessage() {
        return new CancelVisaG2GRequestMessage();
    }

    /**
     * Create an instance of {@link CancelVisaG2GResponseMessage }
     * 
     */
    public CancelVisaG2GResponseMessage createCancelVisaG2GResponseMessage() {
        return new CancelVisaG2GResponseMessage();
    }

    /**
     * Create an instance of {@link BlackListDeporteesG2GRequestMessage }
     * 
     */
    public BlackListDeporteesG2GRequestMessage createBlackListDeporteesG2GRequestMessage() {
        return new BlackListDeporteesG2GRequestMessage();
    }

    /**
     * Create an instance of {@link BlackListDeporteesG2GResponseMessage }
     * 
     */
    public BlackListDeporteesG2GResponseMessage createBlackListDeporteesG2GResponseMessage() {
        return new BlackListDeporteesG2GResponseMessage();
    }

    /**
     * Create an instance of {@link GetNicRejectedVisaRequestMessage }
     * 
     */
    public GetNicRejectedVisaRequestMessage createGetNicRejectedVisaRequestMessage() {
        return new GetNicRejectedVisaRequestMessage();
    }

    /**
     * Create an instance of {@link GetNicRejectedVisaResponseMessage }
     * 
     */
    public GetNicRejectedVisaResponseMessage createGetNicRejectedVisaResponseMessage() {
        return new GetNicRejectedVisaResponseMessage();
    }

    /**
     * Create an instance of {@link GetExitEntryVisaRequestMessage }
     * 
     */
    public GetExitEntryVisaRequestMessage createGetExitEntryVisaRequestMessage() {
        return new GetExitEntryVisaRequestMessage();
    }

    /**
     * Create an instance of {@link GetExitEntryVisaResponseMessage }
     * 
     */
    public GetExitEntryVisaResponseMessage createGetExitEntryVisaResponseMessage() {
        return new GetExitEntryVisaResponseMessage();
    }

    /**
     * Create an instance of {@link GetExitEntryVisaWithResidentInfoRequestMessage }
     * 
     */
    public GetExitEntryVisaWithResidentInfoRequestMessage createGetExitEntryVisaWithResidentInfoRequestMessage() {
        return new GetExitEntryVisaWithResidentInfoRequestMessage();
    }

    /**
     * Create an instance of {@link GetExitEntryVisaWithResidentInfoResponseMessage }
     * 
     */
    public GetExitEntryVisaWithResidentInfoResponseMessage createGetExitEntryVisaWithResidentInfoResponseMessage() {
        return new GetExitEntryVisaWithResidentInfoResponseMessage();
    }

    /**
     * Create an instance of {@link GetWorkVisaDataRequestMessage }
     * 
     */
    public GetWorkVisaDataRequestMessage createGetWorkVisaDataRequestMessage() {
        return new GetWorkVisaDataRequestMessage();
    }

    /**
     * Create an instance of {@link GetWorkVisaDataResponseMessage }
     * 
     */
    public GetWorkVisaDataResponseMessage createGetWorkVisaDataResponseMessage() {
        return new GetWorkVisaDataResponseMessage();
    }

    /**
     * Create an instance of {@link ArrayOfWorkVisaData }
     * 
     */
    public ArrayOfWorkVisaData createArrayOfWorkVisaData() {
        return new ArrayOfWorkVisaData();
    }

    /**
     * Create an instance of {@link WorkVisaData }
     * 
     */
    public WorkVisaData createWorkVisaData() {
        return new WorkVisaData();
    }

    /**
     * Create an instance of {@link ArrayOfWorkVisaDetail }
     * 
     */
    public ArrayOfWorkVisaDetail createArrayOfWorkVisaDetail() {
        return new ArrayOfWorkVisaDetail();
    }

    /**
     * Create an instance of {@link WorkVisaDetail }
     * 
     */
    public WorkVisaDetail createWorkVisaDetail() {
        return new WorkVisaDetail();
    }

    /**
     * Create an instance of {@link GetDeletedWorkVisaRequestMessage }
     * 
     */
    public GetDeletedWorkVisaRequestMessage createGetDeletedWorkVisaRequestMessage() {
        return new GetDeletedWorkVisaRequestMessage();
    }

    /**
     * Create an instance of {@link GetDeletedWorkVisaResponseMessage }
     * 
     */
    public GetDeletedWorkVisaResponseMessage createGetDeletedWorkVisaResponseMessage() {
        return new GetDeletedWorkVisaResponseMessage();
    }

    /**
     * Create an instance of {@link GetOrganizationVisaInfoRequestMessage }
     * 
     */
    public GetOrganizationVisaInfoRequestMessage createGetOrganizationVisaInfoRequestMessage() {
        return new GetOrganizationVisaInfoRequestMessage();
    }

    /**
     * Create an instance of {@link GetOrganizationVisaInfoResponseMessage }
     * 
     */
    public GetOrganizationVisaInfoResponseMessage createGetOrganizationVisaInfoResponseMessage() {
        return new GetOrganizationVisaInfoResponseMessage();
    }

    /**
     * Create an instance of {@link ArrayOfOrganizationVisaData }
     * 
     */
    public ArrayOfOrganizationVisaData createArrayOfOrganizationVisaData() {
        return new ArrayOfOrganizationVisaData();
    }

    /**
     * Create an instance of {@link OrganizationVisaData }
     * 
     */
    public OrganizationVisaData createOrganizationVisaData() {
        return new OrganizationVisaData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BlackListRequestMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BlackListRequestMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", name = "BlackListRequestMessage")
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
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", name = "BlackListResponseMessage")
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
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", name = "DeporteesRequestMessage")
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
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", name = "DeporteesResponseMessage")
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
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", name = "ResidentInformationRequestMessage")
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
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", name = "ResidentInformationResponseMessage")
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
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", name = "CitizenInformationRequestMessage")
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
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", name = "CitizenInformationResponseMessage")
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
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", name = "ValidateVisaDataRequestMessage")
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
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", name = "ValidateVisaDataResponseMessage")
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
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", name = "SendVisaG2gRequestMessage")
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
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", name = "SendVisaG2gResponseMessage")
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
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", name = "CancelVisaG2gRequestMessage")
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
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", name = "CancelVisaG2gResponseMessage")
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
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", name = "BlackListDeporteesG2gRequestMessage")
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
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", name = "BlackListDeporteesG2gResponseMessage")
    public JAXBElement<BlackListDeporteesG2GResponseMessage> createBlackListDeporteesG2GResponseMessage(BlackListDeporteesG2GResponseMessage value) {
        return new JAXBElement<BlackListDeporteesG2GResponseMessage>(_BlackListDeporteesG2GResponseMessage_QNAME, BlackListDeporteesG2GResponseMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNicRejectedVisaRequestMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetNicRejectedVisaRequestMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", name = "GetNicRejectedVisaRequestMessage")
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
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", name = "GetNicRejectedVisaResponseMessage")
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
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", name = "GetExitEntryVisaRequestMessage")
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
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", name = "GetExitEntryVisaResponseMessage")
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
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", name = "GetExitEntryVisaWithResidentInfoRequestMessage")
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
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", name = "GetExitEntryVisaWithResidentInfoResponseMessage")
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
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", name = "GetWorkVisaDataRequestMessage")
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
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", name = "GetWorkVisaDataResponseMessage")
    public JAXBElement<GetWorkVisaDataResponseMessage> createGetWorkVisaDataResponseMessage(GetWorkVisaDataResponseMessage value) {
        return new JAXBElement<GetWorkVisaDataResponseMessage>(_GetWorkVisaDataResponseMessage_QNAME, GetWorkVisaDataResponseMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWorkVisaData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWorkVisaData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", name = "ArrayOfWorkVisaData")
    public JAXBElement<ArrayOfWorkVisaData> createArrayOfWorkVisaData(ArrayOfWorkVisaData value) {
        return new JAXBElement<ArrayOfWorkVisaData>(_ArrayOfWorkVisaData_QNAME, ArrayOfWorkVisaData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkVisaData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WorkVisaData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", name = "WorkVisaData")
    public JAXBElement<WorkVisaData> createWorkVisaData(WorkVisaData value) {
        return new JAXBElement<WorkVisaData>(_WorkVisaData_QNAME, WorkVisaData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWorkVisaDetail }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWorkVisaDetail }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", name = "ArrayOfWorkVisaDetail")
    public JAXBElement<ArrayOfWorkVisaDetail> createArrayOfWorkVisaDetail(ArrayOfWorkVisaDetail value) {
        return new JAXBElement<ArrayOfWorkVisaDetail>(_ArrayOfWorkVisaDetail_QNAME, ArrayOfWorkVisaDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkVisaDetail }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WorkVisaDetail }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", name = "WorkVisaDetail")
    public JAXBElement<WorkVisaDetail> createWorkVisaDetail(WorkVisaDetail value) {
        return new JAXBElement<WorkVisaDetail>(_WorkVisaDetail_QNAME, WorkVisaDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeletedWorkVisaRequestMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDeletedWorkVisaRequestMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", name = "GetDeletedWorkVisaRequestMessage")
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
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", name = "GetDeletedWorkVisaResponseMessage")
    public JAXBElement<GetDeletedWorkVisaResponseMessage> createGetDeletedWorkVisaResponseMessage(GetDeletedWorkVisaResponseMessage value) {
        return new JAXBElement<GetDeletedWorkVisaResponseMessage>(_GetDeletedWorkVisaResponseMessage_QNAME, GetDeletedWorkVisaResponseMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrganizationVisaInfoRequestMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetOrganizationVisaInfoRequestMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.ServiceSchema", name = "GetOrganizationVisaInfoRequestMessage")
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
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.ServiceSchema", name = "GetOrganizationVisaInfoResponseMessage")
    public JAXBElement<GetOrganizationVisaInfoResponseMessage> createGetOrganizationVisaInfoResponseMessage(GetOrganizationVisaInfoResponseMessage value) {
        return new JAXBElement<GetOrganizationVisaInfoResponseMessage>(_GetOrganizationVisaInfoResponseMessage_QNAME, GetOrganizationVisaInfoResponseMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrganizationVisaData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfOrganizationVisaData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.ServiceSchema", name = "ArrayOfOrganizationVisaData")
    public JAXBElement<ArrayOfOrganizationVisaData> createArrayOfOrganizationVisaData(ArrayOfOrganizationVisaData value) {
        return new JAXBElement<ArrayOfOrganizationVisaData>(_ArrayOfOrganizationVisaData_QNAME, ArrayOfOrganizationVisaData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationVisaData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OrganizationVisaData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.ServiceSchema", name = "OrganizationVisaData")
    public JAXBElement<OrganizationVisaData> createOrganizationVisaData(OrganizationVisaData value) {
        return new JAXBElement<OrganizationVisaData>(_OrganizationVisaData_QNAME, OrganizationVisaData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.ServiceSchema", name = "VisaStatus", scope = OrganizationVisaData.class)
    public JAXBElement<String> createOrganizationVisaDataVisaStatus(String value) {
        return new JAXBElement<String>(_OrganizationVisaDataVisaStatus_QNAME, String.class, OrganizationVisaData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.ServiceSchema", name = "VisitorStatus", scope = OrganizationVisaData.class)
    public JAXBElement<String> createOrganizationVisaDataVisitorStatus(String value) {
        return new JAXBElement<String>(_OrganizationVisaDataVisitorStatus_QNAME, String.class, OrganizationVisaData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrganizationVisaData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfOrganizationVisaData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.ServiceSchema", name = "ListOrganizationVisaData", scope = GetOrganizationVisaInfoResponseMessage.class)
    public JAXBElement<ArrayOfOrganizationVisaData> createGetOrganizationVisaInfoResponseMessageListOrganizationVisaData(ArrayOfOrganizationVisaData value) {
        return new JAXBElement<ArrayOfOrganizationVisaData>(_GetOrganizationVisaInfoResponseMessageListOrganizationVisaData_QNAME, ArrayOfOrganizationVisaData.class, GetOrganizationVisaInfoResponseMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfdouble }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfdouble }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", name = "BorderNumbers", scope = GetDeletedWorkVisaResponseMessage.class)
    public JAXBElement<ArrayOfdouble> createGetDeletedWorkVisaResponseMessageBorderNumbers(ArrayOfdouble value) {
        return new JAXBElement<ArrayOfdouble>(_GetDeletedWorkVisaResponseMessageBorderNumbers_QNAME, ArrayOfdouble.class, GetDeletedWorkVisaResponseMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", name = "Nationality", scope = WorkVisaDetail.class)
    public JAXBElement<String> createWorkVisaDetailNationality(String value) {
        return new JAXBElement<String>(_WorkVisaDetailNationality_QNAME, String.class, WorkVisaDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", name = "PersonName", scope = WorkVisaDetail.class)
    public JAXBElement<String> createWorkVisaDetailPersonName(String value) {
        return new JAXBElement<String>(_WorkVisaDetailPersonName_QNAME, String.class, WorkVisaDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", name = "SponsorAddress", scope = WorkVisaData.class)
    public JAXBElement<String> createWorkVisaDataSponsorAddress(String value) {
        return new JAXBElement<String>(_WorkVisaDataSponsorAddress_QNAME, String.class, WorkVisaData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", name = "SponsorName", scope = WorkVisaData.class)
    public JAXBElement<String> createWorkVisaDataSponsorName(String value) {
        return new JAXBElement<String>(_WorkVisaDataSponsorName_QNAME, String.class, WorkVisaData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWorkVisaDetail }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWorkVisaDetail }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", name = "WorkVisaDetailList", scope = WorkVisaData.class)
    public JAXBElement<ArrayOfWorkVisaDetail> createWorkVisaDataWorkVisaDetailList(ArrayOfWorkVisaDetail value) {
        return new JAXBElement<ArrayOfWorkVisaDetail>(_WorkVisaDataWorkVisaDetailList_QNAME, ArrayOfWorkVisaDetail.class, WorkVisaData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWorkVisaData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWorkVisaData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", name = "WorkVisaDataList", scope = GetWorkVisaDataResponseMessage.class)
    public JAXBElement<ArrayOfWorkVisaData> createGetWorkVisaDataResponseMessageWorkVisaDataList(ArrayOfWorkVisaData value) {
        return new JAXBElement<ArrayOfWorkVisaData>(_GetWorkVisaDataResponseMessageWorkVisaDataList_QNAME, ArrayOfWorkVisaData.class, GetWorkVisaDataResponseMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExitEntryVisaData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExitEntryVisaData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", name = "ExitEntryVisaData", scope = GetExitEntryVisaWithResidentInfoResponseMessage.class)
    public JAXBElement<ExitEntryVisaData> createGetExitEntryVisaWithResidentInfoResponseMessageExitEntryVisaData(ExitEntryVisaData value) {
        return new JAXBElement<ExitEntryVisaData>(_GetExitEntryVisaWithResidentInfoResponseMessageExitEntryVisaData_QNAME, ExitEntryVisaData.class, GetExitEntryVisaWithResidentInfoResponseMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResidentInformationData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResidentInformationData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", name = "ResidentInformationData", scope = GetExitEntryVisaWithResidentInfoResponseMessage.class)
    public JAXBElement<ResidentInformationData> createGetExitEntryVisaWithResidentInfoResponseMessageResidentInformationData(ResidentInformationData value) {
        return new JAXBElement<ResidentInformationData>(_GetExitEntryVisaWithResidentInfoResponseMessageResidentInformationData_QNAME, ResidentInformationData.class, GetExitEntryVisaWithResidentInfoResponseMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExitEntryVisaParam }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExitEntryVisaParam }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", name = "ExitEntryVisaParam", scope = GetExitEntryVisaWithResidentInfoRequestMessage.class)
    public JAXBElement<ExitEntryVisaParam> createGetExitEntryVisaWithResidentInfoRequestMessageExitEntryVisaParam(ExitEntryVisaParam value) {
        return new JAXBElement<ExitEntryVisaParam>(_GetExitEntryVisaWithResidentInfoRequestMessageExitEntryVisaParam_QNAME, ExitEntryVisaParam.class, GetExitEntryVisaWithResidentInfoRequestMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExitEntryVisaData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExitEntryVisaData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", name = "ExitEntryVisaData", scope = GetExitEntryVisaResponseMessage.class)
    public JAXBElement<ExitEntryVisaData> createGetExitEntryVisaResponseMessageExitEntryVisaData(ExitEntryVisaData value) {
        return new JAXBElement<ExitEntryVisaData>(_GetExitEntryVisaWithResidentInfoResponseMessageExitEntryVisaData_QNAME, ExitEntryVisaData.class, GetExitEntryVisaResponseMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExitEntryVisaParam }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExitEntryVisaParam }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", name = "ExitEntryVisaParam", scope = GetExitEntryVisaRequestMessage.class)
    public JAXBElement<ExitEntryVisaParam> createGetExitEntryVisaRequestMessageExitEntryVisaParam(ExitEntryVisaParam value) {
        return new JAXBElement<ExitEntryVisaParam>(_GetExitEntryVisaWithResidentInfoRequestMessageExitEntryVisaParam_QNAME, ExitEntryVisaParam.class, GetExitEntryVisaRequestMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfdouble }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfdouble }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", name = "VisaNumbers", scope = GetNicRejectedVisaResponseMessage.class)
    public JAXBElement<ArrayOfdouble> createGetNicRejectedVisaResponseMessageVisaNumbers(ArrayOfdouble value) {
        return new JAXBElement<ArrayOfdouble>(_GetNicRejectedVisaResponseMessageVisaNumbers_QNAME, ArrayOfdouble.class, GetNicRejectedVisaResponseMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBlackListData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfBlackListData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", name = "BlackListData", scope = BlackListDeporteesG2GResponseMessage.class)
    public JAXBElement<ArrayOfBlackListData> createBlackListDeporteesG2GResponseMessageBlackListData(ArrayOfBlackListData value) {
        return new JAXBElement<ArrayOfBlackListData>(_BlackListDeporteesG2GResponseMessageBlackListData_QNAME, ArrayOfBlackListData.class, BlackListDeporteesG2GResponseMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BlackListDeporteesParam }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BlackListDeporteesParam }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", name = "BlackListDeporteesParam", scope = BlackListDeporteesG2GRequestMessage.class)
    public JAXBElement<BlackListDeporteesParam> createBlackListDeporteesG2GRequestMessageBlackListDeporteesParam(BlackListDeporteesParam value) {
        return new JAXBElement<BlackListDeporteesParam>(_BlackListDeporteesG2GRequestMessageBlackListDeporteesParam_QNAME, BlackListDeporteesParam.class, BlackListDeporteesG2GRequestMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCancelVisaStatus }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCancelVisaStatus }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", name = "CancelVisaStatusList", scope = CancelVisaG2GResponseMessage.class)
    public JAXBElement<ArrayOfCancelVisaStatus> createCancelVisaG2GResponseMessageCancelVisaStatusList(ArrayOfCancelVisaStatus value) {
        return new JAXBElement<ArrayOfCancelVisaStatus>(_CancelVisaG2GResponseMessageCancelVisaStatusList_QNAME, ArrayOfCancelVisaStatus.class, CancelVisaG2GResponseMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", name = "VisaNumbers", scope = CancelVisaG2GRequestMessage.class)
    public JAXBElement<ArrayOflong> createCancelVisaG2GRequestMessageVisaNumbers(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_GetNicRejectedVisaResponseMessageVisaNumbers_QNAME, ArrayOflong.class, CancelVisaG2GRequestMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfVisaStatusX0020 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfVisaStatusX0020 }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", name = "ListVisaStatus", scope = SendVisaG2GResponseMessage.class)
    public JAXBElement<ArrayOfVisaStatusX0020> createSendVisaG2GResponseMessageListVisaStatus(ArrayOfVisaStatusX0020 value) {
        return new JAXBElement<ArrayOfVisaStatusX0020>(_SendVisaG2GResponseMessageListVisaStatus_QNAME, ArrayOfVisaStatusX0020 .class, SendVisaG2GResponseMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfVisaDataX0020 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfVisaDataX0020 }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", name = "ListVisaData", scope = SendVisaG2GRequestMessage.class)
    public JAXBElement<ArrayOfVisaDataX0020> createSendVisaG2GRequestMessageListVisaData(ArrayOfVisaDataX0020 value) {
        return new JAXBElement<ArrayOfVisaDataX0020>(_SendVisaG2GRequestMessageListVisaData_QNAME, ArrayOfVisaDataX0020 .class, SendVisaG2GRequestMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VisaDataX0020 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VisaDataX0020 }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", name = "ValidateVisaData", scope = ValidateVisaDataRequestMessage.class)
    public JAXBElement<VisaDataX0020> createValidateVisaDataRequestMessageValidateVisaData(VisaDataX0020 value) {
        return new JAXBElement<VisaDataX0020>(_ValidateVisaDataRequestMessageValidateVisaData_QNAME, VisaDataX0020 .class, ValidateVisaDataRequestMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CitizenInformationData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CitizenInformationData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", name = "CitizenInformationData", scope = CitizenInformationResponseMessage.class)
    public JAXBElement<CitizenInformationData> createCitizenInformationResponseMessageCitizenInformationData(CitizenInformationData value) {
        return new JAXBElement<CitizenInformationData>(_CitizenInformationResponseMessageCitizenInformationData_QNAME, CitizenInformationData.class, CitizenInformationResponseMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CitizenInformationParam }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CitizenInformationParam }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", name = "CitizenInformationParam", scope = CitizenInformationRequestMessage.class)
    public JAXBElement<CitizenInformationParam> createCitizenInformationRequestMessageCitizenInformationParam(CitizenInformationParam value) {
        return new JAXBElement<CitizenInformationParam>(_CitizenInformationRequestMessageCitizenInformationParam_QNAME, CitizenInformationParam.class, CitizenInformationRequestMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResidentInformationData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResidentInformationData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", name = "ResidentInformationData", scope = ResidentInformationResponseMessage.class)
    public JAXBElement<ResidentInformationData> createResidentInformationResponseMessageResidentInformationData(ResidentInformationData value) {
        return new JAXBElement<ResidentInformationData>(_GetExitEntryVisaWithResidentInfoResponseMessageResidentInformationData_QNAME, ResidentInformationData.class, ResidentInformationResponseMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResidentInformationParam }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResidentInformationParam }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", name = "ResidentInformationParam", scope = ResidentInformationRequestMessage.class)
    public JAXBElement<ResidentInformationParam> createResidentInformationRequestMessageResidentInformationParam(ResidentInformationParam value) {
        return new JAXBElement<ResidentInformationParam>(_ResidentInformationRequestMessageResidentInformationParam_QNAME, ResidentInformationParam.class, ResidentInformationRequestMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeporteesData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeporteesData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", name = "DeporteesData", scope = DeporteesResponseMessage.class)
    public JAXBElement<DeporteesData> createDeporteesResponseMessageDeporteesData(DeporteesData value) {
        return new JAXBElement<DeporteesData>(_DeporteesResponseMessageDeporteesData_QNAME, DeporteesData.class, DeporteesResponseMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeporteesParam }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeporteesParam }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", name = "DeporteesRequestParam", scope = DeporteesRequestMessage.class)
    public JAXBElement<DeporteesParam> createDeporteesRequestMessageDeporteesRequestParam(DeporteesParam value) {
        return new JAXBElement<DeporteesParam>(_DeporteesRequestMessageDeporteesRequestParam_QNAME, DeporteesParam.class, DeporteesRequestMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBlackListData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfBlackListData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", name = "BlackList", scope = BlackListResponseMessage.class)
    public JAXBElement<ArrayOfBlackListData> createBlackListResponseMessageBlackList(ArrayOfBlackListData value) {
        return new JAXBElement<ArrayOfBlackListData>(_BlackListResponseMessageBlackList_QNAME, ArrayOfBlackListData.class, BlackListResponseMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BlackListParam }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BlackListParam }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", name = "BlackListParam", scope = BlackListRequestMessage.class)
    public JAXBElement<BlackListParam> createBlackListRequestMessageBlackListParam(BlackListParam value) {
        return new JAXBElement<BlackListParam>(_BlackListRequestMessageBlackListParam_QNAME, BlackListParam.class, BlackListRequestMessage.class, value);
    }

}
