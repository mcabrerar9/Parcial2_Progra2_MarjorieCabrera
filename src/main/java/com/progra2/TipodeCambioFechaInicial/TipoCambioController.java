
package com.progra2.TipodeCambioFechaInicial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.progra2.TipodeCambioFechaInicial.wsdl.TipoCambioFechaInicialResponse;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.springframework.http.ResponseEntity;

@RestController
public class TipoCambioController {

    @Autowired
    private TipoCambioService tipoCambioService;

    @GetMapping("/tipoCambio")
    public ResponseEntity<?> obtenerTipoCambio(@RequestParam("fecha") String fechaInicial) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);

        try {
            // Verificar el formato de la fecha
            sdf.parse(fechaInicial);

            TipoCambioFechaInicialResponse response = tipoCambioService.obtenerTipoCambioPorFecha(fechaInicial);
            return ResponseEntity.ok(response);
        } catch (ParseException pe) {
            return ResponseEntity.badRequest().body("Formato de fecha inválido, use 'dd/MM/yyyy'");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error al obtener el tipo de cambio: " + e.getMessage());
        }

    }
}