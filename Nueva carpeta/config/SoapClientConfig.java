
package com.progra2.config;

import com.progra2.client.SoapClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.transport.http.HttpComponentsMessageSender;

@Configuration
public class SoapClientConfig {

    @Bean
    public SoapClient soapClient(WebServiceTemplate webServiceTemplate) {
        SoapClient client = new SoapClient();
        client.setWebServiceTemplate(webServiceTemplate);
        return client;
    }

    @Bean
    public WebServiceTemplate webServiceTemplate() {
        WebServiceTemplate webServiceTemplate = new WebServiceTemplate();
        // Configurar el endpoint
        webServiceTemplate.setDefaultUri("http://tu-endpoint-soap.com/servicio");

        // Si el servicio SOAP requiere autenticación
        // webServiceTemplate.setMessageSender(httpComponentsMessageSender());

        return webServiceTemplate;
    }

    @Bean
    public HttpComponentsMessageSender httpComponentsMessageSender() {
        return new HttpComponentsMessageSender();
    }
}
