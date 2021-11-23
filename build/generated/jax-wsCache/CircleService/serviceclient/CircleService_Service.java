
package serviceclient;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CircleService", targetNamespace = "http://services/", wsdlLocation = "http://localhost:8080/CircleSoapService/CircleService?WSDL")
public class CircleService_Service
    extends Service
{

    private final static URL CIRCLESERVICE_WSDL_LOCATION;
    private final static WebServiceException CIRCLESERVICE_EXCEPTION;
    private final static QName CIRCLESERVICE_QNAME = new QName("http://services/", "CircleService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/CircleSoapService/CircleService?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CIRCLESERVICE_WSDL_LOCATION = url;
        CIRCLESERVICE_EXCEPTION = e;
    }

    public CircleService_Service() {
        super(__getWsdlLocation(), CIRCLESERVICE_QNAME);
    }

    public CircleService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), CIRCLESERVICE_QNAME, features);
    }

    public CircleService_Service(URL wsdlLocation) {
        super(wsdlLocation, CIRCLESERVICE_QNAME);
    }

    public CircleService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CIRCLESERVICE_QNAME, features);
    }

    public CircleService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CircleService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CircleService
     */
    @WebEndpoint(name = "CircleServicePort")
    public CircleService getCircleServicePort() {
        return super.getPort(new QName("http://services/", "CircleServicePort"), CircleService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CircleService
     */
    @WebEndpoint(name = "CircleServicePort")
    public CircleService getCircleServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://services/", "CircleServicePort"), CircleService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CIRCLESERVICE_EXCEPTION!= null) {
            throw CIRCLESERVICE_EXCEPTION;
        }
        return CIRCLESERVICE_WSDL_LOCATION;
    }

}
