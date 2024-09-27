
package com.progra2.TipodeCambioFechaInicial;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class SoapClientConfig {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.progra2.TipodeCambioFechaInicial.wsdl");
        return marshaller;
    }

    @Bean
    public TipoCambioClient tipoCambioClient(Jaxb2Marshaller marshaller) {
        TipoCambioClient client = new TipoCambioClient();
        client.setDefaultUri("https://www.banguat.gob.gt/variables/ws/TipoCambio.asmx");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
}
