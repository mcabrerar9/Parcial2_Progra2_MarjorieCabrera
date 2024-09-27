package com.progra2.TipodeCambioFechaInicial.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataVariable", propOrder = {
    "fecha",
    "moneda",
    "cambioDolar"
})
public class DataVariable {

    @XmlElement(name = "Fecha")
    protected String fecha;

    @XmlElement(name = "Moneda")
    protected String moneda;

    @XmlElement(name = "CambioDolar")
    protected double cambioDolar;

    // Getters y Setters
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public double getCambioDolar() {
        return cambioDolar;
    }

    public void setCambioDolar(double cambioDolar) {
        this.cambioDolar = cambioDolar;
    }

    @Override
    public String toString() {
        return "DataVariable{" +
                "fecha='" + fecha + '\'' +
                ", moneda='" + moneda + '\'' +
                ", cambioDolar=" + cambioDolar +
                '}';
    }
}
