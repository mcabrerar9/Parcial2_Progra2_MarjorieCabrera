
package com.progra2.TipodeCambioFechaInicial;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.transport.http.HttpComponentsMessageSender;

@Configuration
public class SoapConfig {

    @Bean
    public WebServiceTemplate webServiceTemplate() {
        WebServiceTemplate webServiceTemplate = new WebServiceTemplate();
        webServiceTemplate.setMessageSender(new HttpComponentsMessageSender());
        // Aquí puedes agregar más configuraciones según sea necesario
        return webServiceTemplate;
    }
}
