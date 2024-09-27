package com.progra2.TipodeCambioFechaInicial.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Esta clase es generada para representar la respuesta del servicio SOAP para el tipo de cambio.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tipoCambioFechaInicialResult"
})
@XmlRootElement(name = "TipoCambioFechaInicialResponse")
public class TipoCambioFechaInicialResponse {

    @XmlElement(name = "TipoCambioFechaInicialResult")
    protected DataVariable tipoCambioFechaInicialResult;

    public DataVariable getTipoCambioFechaInicialResult() {
        return tipoCambioFechaInicialResult;
    }

    public void setTipoCambioFechaInicialResult(DataVariable value) {
        this.tipoCambioFechaInicialResult = value;
    }
}
