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
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TipoCambioRangoMonedaResult" type="{http://www.banguat.gob.gt/variables/ws/}DataVariable" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tipoCambioRangoMonedaResult"
})
@XmlRootElement(name = "TipoCambioRangoMonedaResponse")
public class TipoCambioRangoMonedaResponse {

    @XmlElement(name = "TipoCambioRangoMonedaResult")
    protected DataVariable tipoCambioRangoMonedaResult;

    /**
     * Obtiene el valor de la propiedad tipoCambioRangoMonedaResult.
     * 
     * @return
     *     possible object is
     *     {@link DataVariable }
     *     
     */
    public DataVariable getTipoCambioRangoMonedaResult() {
        return tipoCambioRangoMonedaResult;
    }

    /**
     * Define el valor de la propiedad tipoCambioRangoMonedaResult.
     * 
     * @param value
     *     allowed object is
     *     {@link DataVariable }
     *     
     */
    public void setTipoCambioRangoMonedaResult(DataVariable value) {
        this.tipoCambioRangoMonedaResult = value;
    }

}