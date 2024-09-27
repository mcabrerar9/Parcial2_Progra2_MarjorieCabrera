
package com.progra2.TipodeCambioFechaInicial.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

/**
 * Clase Java para el tipo complejo anónimo.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "TipoCambioFechaInicialRequest")
public class TipoCambioFechaInicialRequest {

    @XmlElement(name = "fechaInicial", required = true)
    protected String fechaInicial;

    /**
     * Obtiene el valor de la propiedad fechaInicial.
     * 
     * @return posible objeto es {@link String }
     */
    public String getFechaInicial() {
        return fechaInicial;
    }

    /**
     * Define el valor de la propiedad fechaInicial.
     * 
     * @param value allowed object is {@link String }
     */
    public void setFechaInicial(String value) {
        this.fechaInicial = value;
    }
}
