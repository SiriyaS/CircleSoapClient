
package serviceclient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the serviceclient package. 
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

    private final static QName _FindCircumferenceResponse_QNAME = new QName("http://services/", "findCircumferenceResponse");
    private final static QName _FindArea_QNAME = new QName("http://services/", "findArea");
    private final static QName _FindCircumference_QNAME = new QName("http://services/", "findCircumference");
    private final static QName _FindAreaResponse_QNAME = new QName("http://services/", "findAreaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: serviceclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindCircumference }
     * 
     */
    public FindCircumference createFindCircumference() {
        return new FindCircumference();
    }

    /**
     * Create an instance of {@link FindAreaResponse }
     * 
     */
    public FindAreaResponse createFindAreaResponse() {
        return new FindAreaResponse();
    }

    /**
     * Create an instance of {@link FindArea }
     * 
     */
    public FindArea createFindArea() {
        return new FindArea();
    }

    /**
     * Create an instance of {@link FindCircumferenceResponse }
     * 
     */
    public FindCircumferenceResponse createFindCircumferenceResponse() {
        return new FindCircumferenceResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCircumferenceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "findCircumferenceResponse")
    public JAXBElement<FindCircumferenceResponse> createFindCircumferenceResponse(FindCircumferenceResponse value) {
        return new JAXBElement<FindCircumferenceResponse>(_FindCircumferenceResponse_QNAME, FindCircumferenceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindArea }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "findArea")
    public JAXBElement<FindArea> createFindArea(FindArea value) {
        return new JAXBElement<FindArea>(_FindArea_QNAME, FindArea.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCircumference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "findCircumference")
    public JAXBElement<FindCircumference> createFindCircumference(FindCircumference value) {
        return new JAXBElement<FindCircumference>(_FindCircumference_QNAME, FindCircumference.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAreaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "findAreaResponse")
    public JAXBElement<FindAreaResponse> createFindAreaResponse(FindAreaResponse value) {
        return new JAXBElement<FindAreaResponse>(_FindAreaResponse_QNAME, FindAreaResponse.class, null, value);
    }

}
