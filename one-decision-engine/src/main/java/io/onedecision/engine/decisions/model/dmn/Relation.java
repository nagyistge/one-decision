//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.06 at 09:06:03 PM BST 
//


package io.onedecision.engine.decisions.model.dmn;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.w3c.dom.Element;


/**
 * <p>Java class for tRelation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tRelation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.omg.org/spec/DMN/20130901}tExpression"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="column" type="{http://www.omg.org/spec/DMN/20130901}tContextEntry" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.omg.org/spec/DMN/20130901}List" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tRelation", propOrder = {
    "columns",
    "lists"
})
public class Relation extends Expression implements Serializable {

    private static final long serialVersionUID = -3841040596594033436L;
    @XmlElement(name = "column")
    protected java.util.List<ContextEntry> columns;
    @XmlElement(name = "List")
    protected java.util.List<io.onedecision.engine.decisions.model.dmn.List> lists;

    /**
     * Gets the value of the columns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the columns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColumns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContextEntry }
     * 
     * 
     */
    public java.util.List<ContextEntry> getColumns() {
        if (columns == null) {
            columns = new ArrayList<ContextEntry>();
        }
        return this.columns;
    }

    /**
     * Gets the value of the lists property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lists property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLists().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link io.onedecision.engine.decisions.model.dmn.List }
     * 
     * 
     */
    public java.util.List<io.onedecision.engine.decisions.model.dmn.List> getLists() {
        if (lists == null) {
            lists = new ArrayList<io.onedecision.engine.decisions.model.dmn.List>();
        }
        return this.lists;
    }

    public Relation withColumns(ContextEntry... values) {
        if (values!= null) {
            for (ContextEntry value: values) {
                getColumns().add(value);
            }
        }
        return this;
    }

    public Relation withColumns(Collection<ContextEntry> values) {
        if (values!= null) {
            getColumns().addAll(values);
        }
        return this;
    }

    public Relation withLists(io.onedecision.engine.decisions.model.dmn.List... values) {
        if (values!= null) {
            for (io.onedecision.engine.decisions.model.dmn.List value: values) {
                getLists().add(value);
            }
        }
        return this;
    }

    public Relation withLists(Collection<io.onedecision.engine.decisions.model.dmn.List> values) {
        if (values!= null) {
            getLists().addAll(values);
        }
        return this;
    }

    @Override
    public Relation withDescription(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public Relation withAnys(Element... values) {
        if (values!= null) {
            for (Element value: values) {
                getAnys().add(value);
            }
        }
        return this;
    }

    @Override
    public Relation withAnys(Collection<Element> values) {
        if (values!= null) {
            getAnys().addAll(values);
        }
        return this;
    }

    @Override
    public Relation withId(String value) {
        setId(value);
        return this;
    }

}