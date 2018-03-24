
package fiap.scj.ws.soap.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fiap.scj.ws.soap.client package. 
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

    private final static QName _RetornaSituacao_QNAME = new QName("http://soap.ws.scj.fiap/", "retornaSituacao");
    private final static QName _CalcularImcResponse_QNAME = new QName("http://soap.ws.scj.fiap/", "calcularImcResponse");
    private final static QName _CalcularImc_QNAME = new QName("http://soap.ws.scj.fiap/", "calcularImc");
    private final static QName _RetornaSituacaoResponse_QNAME = new QName("http://soap.ws.scj.fiap/", "retornaSituacaoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fiap.scj.ws.soap.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RetornaSituacaoResponse }
     * 
     */
    public RetornaSituacaoResponse createRetornaSituacaoResponse() {
        return new RetornaSituacaoResponse();
    }

    /**
     * Create an instance of {@link CalcularImcResponse }
     * 
     */
    public CalcularImcResponse createCalcularImcResponse() {
        return new CalcularImcResponse();
    }

    /**
     * Create an instance of {@link CalcularImc }
     * 
     */
    public CalcularImc createCalcularImc() {
        return new CalcularImc();
    }

    /**
     * Create an instance of {@link RetornaSituacao }
     * 
     */
    public RetornaSituacao createRetornaSituacao() {
        return new RetornaSituacao();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornaSituacao }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.ws.scj.fiap/", name = "retornaSituacao")
    public JAXBElement<RetornaSituacao> createRetornaSituacao(RetornaSituacao value) {
        return new JAXBElement<RetornaSituacao>(_RetornaSituacao_QNAME, RetornaSituacao.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularImcResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.ws.scj.fiap/", name = "calcularImcResponse")
    public JAXBElement<CalcularImcResponse> createCalcularImcResponse(CalcularImcResponse value) {
        return new JAXBElement<CalcularImcResponse>(_CalcularImcResponse_QNAME, CalcularImcResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularImc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.ws.scj.fiap/", name = "calcularImc")
    public JAXBElement<CalcularImc> createCalcularImc(CalcularImc value) {
        return new JAXBElement<CalcularImc>(_CalcularImc_QNAME, CalcularImc.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornaSituacaoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.ws.scj.fiap/", name = "retornaSituacaoResponse")
    public JAXBElement<RetornaSituacaoResponse> createRetornaSituacaoResponse(RetornaSituacaoResponse value) {
        return new JAXBElement<RetornaSituacaoResponse>(_RetornaSituacaoResponse_QNAME, RetornaSituacaoResponse.class, null, value);
    }

}
