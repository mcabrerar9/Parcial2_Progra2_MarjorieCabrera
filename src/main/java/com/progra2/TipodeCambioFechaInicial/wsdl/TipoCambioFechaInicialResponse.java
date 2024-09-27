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
    "tipoCambioFechaInicialResult"
})
@XmlRootElement(name = "TipoCambioFechaInicialResponse")
public class TipoCambioFechaInicialResponse {

    @XmlElement(name = "TipoCambioFechaInicialResult")
    protected DataVariable tipoCambioFechaInicialResult;

    /**
     * Obtiene el valor de la propiedad tipoCambioFechaInicialResult.
     * 
     * @return posible objeto es {@link DataVariable }
     */
    public DataVariable getTipoCambioFechaInicialResult() {
        return tipoCambioFechaInicialResult;
    }

    /**
     * Define el valor de la propiedad tipoCambioFechaInicialResult.
     * 
     * @param value allowed object is {@link DataVariable }
     */
    public void setTipoCambioFechaInicialResult(DataVariable value) {
        this.tipoCambioFechaInicialResult = value;
    }
}
