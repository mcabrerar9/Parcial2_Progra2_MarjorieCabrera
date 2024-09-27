package com.progra2.tipocambio.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.transport.http.HttpUrlConnectionMessageSender;

@Configuration
public class SoapConfig {

    @Bean
    public WebServiceTemplate webServiceTemplate() {
        WebServiceTemplate webServiceTemplate = new WebServiceTemplate();
        
        // Configura el sender para enviar mensajes SOAP mediante HTTP
        HttpUrlConnectionMessageSender messageSender = new HttpUrlConnectionMessageSender();
        
        webServiceTemplate.setMessageSender(messageSender);
        return webServiceTemplate;
    }
}
