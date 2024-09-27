package com.progra2.mar.tipocambio.controller;

import com.progra2.mar.tipocambio.service.TipoCambioService;
import com.progra2.TipodeCambioFechaInicial.wsdl.TipoCambioFechaInicialResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tipo-cambio")
public class TipoCambioController {

    private static final Logger logger = LoggerFactory.getLogger(TipoCambioController.class);

    @Autowired
    private TipoCambioService tipoCambioService;

    @GetMapping("/fecha-inicial")
    public TipoCambioFechaInicialResponse obtenerTipoCambio(@RequestParam String fechaInicial) {
        logger.info("Solicitud recibida para obtener tipo de cambio en fecha: {}", fechaInicial);
        
        TipoCambioFechaInicialResponse response = tipoCambioService.obtenerTipoCambio(fechaInicial);
        
        logger.info("Respuesta generada: {}", response); // Asegúrate de que la respuesta sea legible
        return response;
    }
}
