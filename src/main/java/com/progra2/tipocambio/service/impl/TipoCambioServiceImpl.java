
package com.progra2.tipocambio.service.impl;

import com.progra2.tipocambio.service.TipoCambioService;
import com.progra2.TipodeCambioFechaInicial.wsdl.TipoCambioFechaInicialResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class TipoCambioServiceImpl extends TipoCambioService {

    private static final Logger logger = LoggerFactory.getLogger(TipoCambioServiceImpl.class);

    @Override
    public TipoCambioFechaInicialResponse obtenerTipoCambio(String fechaInicial) {
        logger.info("Iniciando la obtención del tipo de cambio para la fecha: {}", fechaInicial);

        // Aquí va la lógica para obtener el tipo de cambio
        TipoCambioFechaInicialResponse response = new TipoCambioFechaInicialResponse(); // Reemplaza esto con tu lógica

        logger.info("Tipo de cambio obtenido: {}", response); // Asegúrate de que la respuesta sea legible
        return response;
    }
}
