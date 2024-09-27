package com.progra2.controller;

import com.progra2.client.SoapClient;
import com.progra2.TipodeCambioFechaInicial.wsdl.TipoCambioFechaInicialResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class TipoCambioController {

    @Autowired
    private SoapClient soapClient;

    @GetMapping("/tipoCambio")
    public TipoCambioFechaInicialResponse getTipoCambio(@RequestParam("fecha") String fecha) {
        return soapClient.getTipoCambio(fecha);
    }
}
