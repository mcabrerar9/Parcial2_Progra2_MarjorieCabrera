
package com.progra2.TipodeCambioFechaInicial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.progra2.TipodeCambioFechaInicial.wsdl.TipoCambioFechaInicialResponse;

@Service
public class TipoCambioService {

    @Autowired
    private TipoCambioClient tipoCambioClient;

    public TipoCambioFechaInicialResponse obtenerTipoCambioPorFecha(String fechaInicial) {
        return tipoCambioClient.obtenerTipoCambio(fechaInicial);
    }
}
