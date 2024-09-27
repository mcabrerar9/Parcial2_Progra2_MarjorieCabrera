package com.progra2.tipocambio.service;

import com.progra2.TipodeCambioFechaInicial.wsdl.TipoCambioFechaInicial;
import com.progra2.TipodeCambioFechaInicial.wsdl.TipoCambioFechaInicialResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

@Service
public class TipoCambioService {

    @Autowired
    private WebServiceTemplate webServiceTemplate;

    public TipoCambioFechaInicialResponse obtenerTipoCambio(String fechaInicial) {
        // Crear la solicitud
        TipoCambioFechaInicial request = new TipoCambioFechaInicial();
        request.setFechainit(fechaInicial); // Verifica que el nombre del campo sea correcto según el WSDL.

        // Llamar al servicio SOAP y recibir la respuesta
        TipoCambioFechaInicialResponse response = 
            (TipoCambioFechaInicialResponse) webServiceTemplate.marshalSendAndReceive(
                "https://www.banguat.gob.gt/variables/ws/TipoCambio.asmx", request);

        return response;
    }
}
