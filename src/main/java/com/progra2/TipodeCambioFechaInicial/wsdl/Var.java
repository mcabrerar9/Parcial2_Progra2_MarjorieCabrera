package com.progra2.TipodeCambioFechaInicial.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Clase Java para Var complex type.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Var", propOrder = {
    "moneda",
    "fecha",
    "venta",
    "compra"
})
public class Var {

    protected int moneda;
    protected String fecha;
    protected float venta;
    protected float compra;

    public int getMoneda() {
        return moneda;
    }

    public void setMoneda(int value) {
        this.moneda = value;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String value) {
        this.fecha = value;
    }

    public float getVenta() {
        return venta;
    }

    public void setVenta(float value) {
        this.venta = value;
    }

    public float getCompra() {
        return compra;
    }

    public void setCompra(float value) {
        this.compra = value;
    }
}
