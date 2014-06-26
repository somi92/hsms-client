
package com.github.somi92.hsms.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.github.somi92.hsms.webservice package. 
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

    private final static QName _ListActionsByPriority_QNAME = new QName("http://webservice.hsms.somi92.github.com/", "listActionsByPriority");
    private final static QName _ListAllActionsResponse_QNAME = new QName("http://webservice.hsms.somi92.github.com/", "listAllActionsResponse");
    private final static QName _ListActionsByPriorityResponse_QNAME = new QName("http://webservice.hsms.somi92.github.com/", "listActionsByPriorityResponse");
    private final static QName _ListAllActions_QNAME = new QName("http://webservice.hsms.somi92.github.com/", "listAllActions");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.github.somi92.hsms.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListAllActionsResponse }
     * 
     */
    public ListAllActionsResponse createListAllActionsResponse() {
        return new ListAllActionsResponse();
    }

    /**
     * Create an instance of {@link ListActionsByPriorityResponse }
     * 
     */
    public ListActionsByPriorityResponse createListActionsByPriorityResponse() {
        return new ListActionsByPriorityResponse();
    }

    /**
     * Create an instance of {@link ListAllActions }
     * 
     */
    public ListAllActions createListAllActions() {
        return new ListAllActions();
    }

    /**
     * Create an instance of {@link ListActionsByPriority }
     * 
     */
    public ListActionsByPriority createListActionsByPriority() {
        return new ListActionsByPriority();
    }

    /**
     * Create an instance of {@link Hsms }
     * 
     */
    public Hsms createHsms() {
        return new Hsms();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListActionsByPriority }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.hsms.somi92.github.com/", name = "listActionsByPriority")
    public JAXBElement<ListActionsByPriority> createListActionsByPriority(ListActionsByPriority value) {
        return new JAXBElement<ListActionsByPriority>(_ListActionsByPriority_QNAME, ListActionsByPriority.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAllActionsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.hsms.somi92.github.com/", name = "listAllActionsResponse")
    public JAXBElement<ListAllActionsResponse> createListAllActionsResponse(ListAllActionsResponse value) {
        return new JAXBElement<ListAllActionsResponse>(_ListAllActionsResponse_QNAME, ListAllActionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListActionsByPriorityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.hsms.somi92.github.com/", name = "listActionsByPriorityResponse")
    public JAXBElement<ListActionsByPriorityResponse> createListActionsByPriorityResponse(ListActionsByPriorityResponse value) {
        return new JAXBElement<ListActionsByPriorityResponse>(_ListActionsByPriorityResponse_QNAME, ListActionsByPriorityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAllActions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.hsms.somi92.github.com/", name = "listAllActions")
    public JAXBElement<ListAllActions> createListAllActions(ListAllActions value) {
        return new JAXBElement<ListAllActions>(_ListAllActions_QNAME, ListAllActions.class, null, value);
    }

}
