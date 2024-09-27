package com.progra2.TipodeCambioFechaInicial.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Clase Java para el tipo complejo anónimo.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fechainit"
})
@XmlRootElement(name = "TipoCambioFechaInicial")
public class TipoCambioFechaInicial {

    protected String fechainit;

    /**
     * Obtiene el valor de la propiedad fechainit.
     * 
     * @return posible objeto es {@link String }
     */
    public String getFechainit() {
        return fechainit;
    }

    /**
     * Define el valor de la propiedad fechainit.
     * 
     * @param value allowed object is {@link String }
     */
    public void setFechainit(String value) {
        this.fechainit = value;
    }
}
