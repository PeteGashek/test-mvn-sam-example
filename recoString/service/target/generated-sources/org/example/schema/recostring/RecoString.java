
package org.example.schema.recostring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inputString" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "inputString"
})
@XmlRootElement(name = "recoString")
public class RecoString {

    @XmlElement(required = true)
    protected String inputString;

    /**
     * Gets the value of the inputString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputString() {
        return inputString;
    }

    /**
     * Sets the value of the inputString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputString(String value) {
        this.inputString = value;
    }

}
