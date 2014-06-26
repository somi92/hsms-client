
package com.github.somi92.hsms.webservice;

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
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "HSMSWebServiceService", targetNamespace = "http://webservice.hsms.somi92.github.com/", wsdlLocation = "http://localhost:9090/ws/hsms?wsdl")
public class HSMSWebServiceService
    extends Service
{

    private final static URL HSMSWEBSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException HSMSWEBSERVICESERVICE_EXCEPTION;
    private final static QName HSMSWEBSERVICESERVICE_QNAME = new QName("http://webservice.hsms.somi92.github.com/", "HSMSWebServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8888/ws/hsms?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        HSMSWEBSERVICESERVICE_WSDL_LOCATION = url;
        HSMSWEBSERVICESERVICE_EXCEPTION = e;
    }

    public HSMSWebServiceService() {
        super(__getWsdlLocation(), HSMSWEBSERVICESERVICE_QNAME);
    }

    public HSMSWebServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), HSMSWEBSERVICESERVICE_QNAME, features);
    }

    public HSMSWebServiceService(URL wsdlLocation) {
        super(wsdlLocation, HSMSWEBSERVICESERVICE_QNAME);
    }

    public HSMSWebServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, HSMSWEBSERVICESERVICE_QNAME, features);
    }

    public HSMSWebServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HSMSWebServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns HSMSServices
     */
    @WebEndpoint(name = "HSMSWebServicePort")
    public HSMSServices getHSMSWebServicePort() {
        return super.getPort(new QName("http://webservice.hsms.somi92.github.com/", "HSMSWebServicePort"), HSMSServices.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HSMSServices
     */
    @WebEndpoint(name = "HSMSWebServicePort")
    public HSMSServices getHSMSWebServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservice.hsms.somi92.github.com/", "HSMSWebServicePort"), HSMSServices.class, features);
    }

    private static URL __getWsdlLocation() {
        if (HSMSWEBSERVICESERVICE_EXCEPTION!= null) {
            throw HSMSWEBSERVICESERVICE_EXCEPTION;
        }
        return HSMSWEBSERVICESERVICE_WSDL_LOCATION;
    }

}
