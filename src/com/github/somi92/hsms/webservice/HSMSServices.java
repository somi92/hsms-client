
package com.github.somi92.hsms.webservice;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "HSMSServices", targetNamespace = "http://webservice.hsms.somi92.github.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface HSMSServices {


    /**
     * 
     * @return
     *     returns java.util.List<com.github.somi92.hsms.webservice.Hsms>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listAllActions", targetNamespace = "http://webservice.hsms.somi92.github.com/", className = "com.github.somi92.hsms.webservice.ListAllActions")
    @ResponseWrapper(localName = "listAllActionsResponse", targetNamespace = "http://webservice.hsms.somi92.github.com/", className = "com.github.somi92.hsms.webservice.ListAllActionsResponse")
    @Action(input = "http://webservice.hsms.somi92.github.com/HSMSServices/listAllActionsRequest", output = "http://webservice.hsms.somi92.github.com/HSMSServices/listAllActionsResponse")
    public List<Hsms> listAllActions();

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<com.github.somi92.hsms.webservice.Hsms>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listActionsByPriority", targetNamespace = "http://webservice.hsms.somi92.github.com/", className = "com.github.somi92.hsms.webservice.ListActionsByPriority")
    @ResponseWrapper(localName = "listActionsByPriorityResponse", targetNamespace = "http://webservice.hsms.somi92.github.com/", className = "com.github.somi92.hsms.webservice.ListActionsByPriorityResponse")
    @Action(input = "http://webservice.hsms.somi92.github.com/HSMSServices/listActionsByPriorityRequest", output = "http://webservice.hsms.somi92.github.com/HSMSServices/listActionsByPriorityResponse")
    public List<Hsms> listActionsByPriority(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

}
