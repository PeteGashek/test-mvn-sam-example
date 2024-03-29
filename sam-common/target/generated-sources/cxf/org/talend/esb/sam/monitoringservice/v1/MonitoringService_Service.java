package org.talend.esb.sam.monitoringservice.v1;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-12-06T12:19:03.212+02:00
 * Generated source version: 2.7.0
 * 
 */
@WebServiceClient(name = "MonitoringService", 
                  wsdlLocation = "file:/C:/Users/Peter.Gashenko/Documents/WSPACE/tesb-rt-se/sam/sam-common/src/main/resources/wsdl/MonitoringService_v1.wsdl",
                  targetNamespace = "http://www.talend.org/esb/sam/MonitoringService/v1") 
public class MonitoringService_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.talend.org/esb/sam/MonitoringService/v1", "MonitoringService");
    public final static QName MonitoringServiceSOAP = new QName("http://www.talend.org/esb/sam/MonitoringService/v1", "MonitoringServiceSOAP");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/Peter.Gashenko/Documents/WSPACE/tesb-rt-se/sam/sam-common/src/main/resources/wsdl/MonitoringService_v1.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(MonitoringService_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/Peter.Gashenko/Documents/WSPACE/tesb-rt-se/sam/sam-common/src/main/resources/wsdl/MonitoringService_v1.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public MonitoringService_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public MonitoringService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MonitoringService_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public MonitoringService_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public MonitoringService_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public MonitoringService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns MonitoringService
     */
    @WebEndpoint(name = "MonitoringServiceSOAP")
    public MonitoringService getMonitoringServiceSOAP() {
        return super.getPort(MonitoringServiceSOAP, MonitoringService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MonitoringService
     */
    @WebEndpoint(name = "MonitoringServiceSOAP")
    public MonitoringService getMonitoringServiceSOAP(WebServiceFeature... features) {
        return super.getPort(MonitoringServiceSOAP, MonitoringService.class, features);
    }

}
