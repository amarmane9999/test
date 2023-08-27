
package sa.gov.mofa.schemas.nicg2gservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.5.5.redhat-00041
 * 2023-08-27T11:23:44.450+03:00
 * Generated source version: 3.5.5.redhat-00041
 */

@WebFault(name = "EsbFault", targetNamespace = "http://schemas.mofa.gov.sa/esb/2014/12/")
public class INicG2GServiceGetOrganizationVisaInfoEsbFaultFaultFaultMessage extends Exception {

    private sa.gov.mofa.schemas.esb._2014._12.EsbFault faultInfo;

    public INicG2GServiceGetOrganizationVisaInfoEsbFaultFaultFaultMessage() {
        super();
    }

    public INicG2GServiceGetOrganizationVisaInfoEsbFaultFaultFaultMessage(String message) {
        super(message);
    }

    public INicG2GServiceGetOrganizationVisaInfoEsbFaultFaultFaultMessage(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public INicG2GServiceGetOrganizationVisaInfoEsbFaultFaultFaultMessage(String message, sa.gov.mofa.schemas.esb._2014._12.EsbFault esbFault) {
        super(message);
        this.faultInfo = esbFault;
    }

    public INicG2GServiceGetOrganizationVisaInfoEsbFaultFaultFaultMessage(String message, sa.gov.mofa.schemas.esb._2014._12.EsbFault esbFault, java.lang.Throwable cause) {
        super(message, cause);
        this.faultInfo = esbFault;
    }

    public sa.gov.mofa.schemas.esb._2014._12.EsbFault getFaultInfo() {
        return this.faultInfo;
    }
}
