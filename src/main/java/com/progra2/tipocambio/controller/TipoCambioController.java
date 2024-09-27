package com.progra2.tipocambio.controller;

import com.progra2.TipodeCambioFechaInicial.wsdl.DataVariable;
import com.progra2.TipodeCambioFechaInicial.wsdl.TipoCambioFechaInicialResponse;
import com.progra2.tipocambio.service.TipoCambioService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tipo-cambio")
public class TipoCambioController {

    private static final Logger logger = LoggerFactory.getLogger(TipoCambioController.class);

    @Autowired
    private TipoCambioService tipoCambioService;

    @GetMapping("/fecha-inicial")
    public ResponseEntity<?> obtenerTipoCambio(@RequestParam String fechaInicial) {
        logger.info("Solicitud recibida para obtener tipo de cambio en fecha: {}", fechaInicial);
        
        // Llama al servicio SOAP
        TipoCambioFechaInicialResponse response = tipoCambioService.obtenerTipoCambio(fechaInicial);

        // Verificar si la respuesta tiene datos
        if (response != null && response.getTipoCambioFechaInicialResult() != null) {
            // Extrae el objeto DataVariable de la respuesta
            DataVariable dataVariable = response.getTipoCambioFechaInicialResult();
            
            logger.info("Tipo de cambio obtenido: {}", dataVariable);
            return ResponseEntity.ok(dataVariable); // Devuelve el objeto como respuesta en formato JSON
        } else {
            // Si no hay datos, devuelve un error 404
            logger.warn("No se pudo obtener el tipo de cambio para la fecha: {}", fechaInicial);
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No se pudo obtener el tipo de cambio para la fecha proporcionada.");
        }
    }
}
