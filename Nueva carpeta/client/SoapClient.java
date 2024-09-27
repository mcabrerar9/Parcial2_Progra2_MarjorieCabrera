
package com.progra2.client;

import com.progra2.TipodeCambioFechaInicial.wsdl.TipoCambioFechaInicial;
import com.progra2.TipodeCambioFechaInicial.wsdl.TipoCambioFechaInicialResponse;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

/**
 *
 * @author cmarj
 */
public class SoapClient extends WebServiceGatewaySupport {
    public TipoCambioFechaInicialResponse getTipoCambio(String fecha) {
        // Crear el objeto de solicitud
        TipoCambioFechaInicial request = new TipoCambioFechaInicial();
        request.setFechainit(fecha);

        // Hacer la llamada al servicio web
        TipoCambioFechaInicialResponse response = (TipoCambioFechaInicialResponse) getWebServiceTemplate()
            .marshalSendAndReceive("http://tu-endpoint-soap.com/servicio", request);
        
        return response;
    }
}
