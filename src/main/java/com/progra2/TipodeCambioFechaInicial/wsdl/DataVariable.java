//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.09.23 a las 09:33:19 PM CST 
//


package com.progra2.TipodeCambioFechaInicial.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;
/**
 * <p>Clase Java para DataVariable complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DataVariable"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Vars" type="{http://www.banguat.gob.gt/variables/ws/}ArrayOfVar" minOccurs="0"/&gt;
 *         &lt;element name="TotalItems" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataVariable", propOrder = {
    "vars",
    "totalItems"
})
public class DataVariable {

    @XmlElement(name = "Vars")
    protected ArrayOfVar vars;
    @XmlElement(name = "TotalItems")
    protected int totalItems;

    /**
     * Obtiene el valor de la propiedad vars.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVar }
     *     
     */
    public ArrayOfVar getVars() {
        return vars;
    }

    /**
     * Define el valor de la propiedad vars.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVar }
     *     
     */
    public void setVars(ArrayOfVar value) {
        this.vars = value;
    }

    /**
     * Obtiene el valor de la propiedad totalItems.
     * 
     */
    public int getTotalItems() {
        return totalItems;
    }

    /**
     * Define el valor de la propiedad totalItems.
     * 
     */
    public void setTotalItems(int value) {
        this.totalItems = value;
    }

}
