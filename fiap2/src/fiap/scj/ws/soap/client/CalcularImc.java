
package fiap.scj.ws.soap.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for calcularImc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="calcularImc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="altura" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="peso" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calcularImc", propOrder = {
    "altura",
    "peso"
})
public class CalcularImc {

    protected float altura;
    protected float peso;

    /**
     * Gets the value of the altura property.
     * 
     */
    public float getAltura() {
        return altura;
    }

    /**
     * Sets the value of the altura property.
     * 
     */
    public void setAltura(float value) {
        this.altura = value;
    }

    /**
     * Gets the value of the peso property.
     * 
     */
    public float getPeso() {
        return peso;
    }

    /**
     * Sets the value of the peso property.
     * 
     */
    public void setPeso(float value) {
        this.peso = value;
    }

}
