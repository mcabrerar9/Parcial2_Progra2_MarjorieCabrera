
package com.progra2.mar.tipocambio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;
import com.progra2.TipodeCambioFechaInicial.wsdl.TipoCambioFechaInicial;
import com.progra2.TipodeCambioFechaInicial.wsdl.TipoCambioFechaInicialResponse;

@Service
public class TipoCambioService {

    @Autowired
    private WebServiceTemplate webServiceTemplate;

    public TipoCambioFechaInicialResponse obtenerTipoCambio(String fechaInicial) {
        // Crear la solicitud
        TipoCambioFechaInicial request = new TipoCambioFechaInicial();
        request.setFecha(fechaInicial);

        // Llamar al servicio SOAP
        TipoCambioFechaInicialResponse response = 
            (TipoCambioFechaInicialResponse) webServiceTemplate.marshalSendAndReceive(
                "https://www.banguat.gob.gt/variables/ws/TipoCambio.asmx", request);

        return response;
    }
}
