
package com.progra2.TipodeCambioFechaInicial.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Clase Java para el tipo complejo DataVariable.
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
     * @return possible object is {@link ArrayOfVar }
     */
    public ArrayOfVar getVars() {
        return vars;
    }

    /**
     * Define el valor de la propiedad vars.
     * 
     * @param value allowed object is {@link ArrayOfVar }
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
