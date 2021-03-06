//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.30 at 01:30:38 PM GMT 
//


package io.onedecision.engine.decisions.model.dmn;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>
 * Java class for tAuthorityRequirement complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="tAuthorityRequirement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="requiredDecision" type="{http://www.omg.org/spec/DMN/20151101/dmn.xsd}tDMNElementReference"/&gt;
 *         &lt;element name="requiredInput" type="{http://www.omg.org/spec/DMN/20151101/dmn.xsd}tDMNElementReference"/&gt;
 *         &lt;element name="requiredAuthority" type="{http://www.omg.org/spec/DMN/20151101/dmn.xsd}tDMNElementReference"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tAuthorityRequirement", propOrder = {
    "requiredDecision",
    "requiredInput",
    "requiredAuthority"
})
public class AuthorityRequirement implements Serializable {

    private static final long serialVersionUID = -4682304898515499291L;

    private static ObjectFactory objFact = new ObjectFactory();

    protected DmnElementReference requiredDecision;
    protected DmnElementReference requiredInput;
    protected DmnElementReference requiredAuthority;

    /**
     * Gets the value of the requiredDecision property.
     * 
     * @return
     *     possible object is
     *     {@link DmnElementReference }
     *     
     */
    public DmnElementReference getRequiredDecision() {
        return requiredDecision;
    }

    /**
     * Sets the value of the requiredDecision property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmnElementReference }
     *     
     */
    public void setRequiredDecision(DmnElementReference value) {
        this.requiredDecision = value;
    }

    /**
     * Gets the value of the requiredInput property.
     * 
     * @return
     *     possible object is
     *     {@link DmnElementReference }
     *     
     */
    public DmnElementReference getRequiredInput() {
        return requiredInput;
    }

    /**
     * Sets the value of the requiredInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmnElementReference }
     *     
     */
    public void setRequiredInput(DmnElementReference value) {
        this.requiredInput = value;
    }

    /**
     * Gets the value of the requiredAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link DmnElementReference }
     *     
     */
    public DmnElementReference getRequiredAuthority() {
        return requiredAuthority;
    }

    /**
     * Sets the value of the requiredAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmnElementReference }
     *     
     */
    public void setRequiredAuthority(DmnElementReference value) {
        this.requiredAuthority = value;
    }

    public AuthorityRequirement withRequiredDecision(DmnElementReference value) {
        setRequiredDecision(value);
        return this;
    }

    public AuthorityRequirement withRequiredInput(DmnElementReference value) {
        setRequiredInput(value);
        return this;
    }

    public AuthorityRequirement withRequiredAuthority(DmnElementReference value) {
        setRequiredAuthority(value);
        return this;
    }

    public AuthorityRequirement withRequiredAuthority(
            KnowledgeSource knowledgeSource) {
        setRequiredAuthority(objFact.createDmnElementReference().withHref(
                knowledgeSource.getId()));
        return this;
    }

    public AuthorityRequirement withRequiredAuthority(BusinessKnowledgeModel bkm) {
        setRequiredAuthority(objFact.createDmnElementReference().withHref(
                bkm.getId()));
        return this;
    }

}
