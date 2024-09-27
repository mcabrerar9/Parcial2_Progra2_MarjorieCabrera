
package com.progra2.TipodeCambioFechaInicial;

import com.progra2.TipodeCambioFechaInicial.wsdl.TipoCambioFechaInicialResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

public class TipoCambioClient {
    public static void main(String[] args) {
        String fechaInicio = "01/01/2023"; // Cambia la fecha según sea necesario

        String soapRequest = String.format(
                "<?xml version=\"1.0\" encoding=\"utf-8\"?>" +
                "<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" " +
                "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" " +
                "xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">" +
                "<soap:Body>" +
                "<TipoCambioFechaInicial xmlns=\"http://www.banguat.gob.gt/variables/ws/\">" +
                "<fechainit>%s</fechainit>" +
                "</TipoCambioFechaInicial>" +
                "</soap:Body>" +
                "</soap:Envelope>", fechaInicio);

        try (CloseableHttpClient client = HttpClients.createDefault()) {
            HttpPost post = new HttpPost("https://www.banguat.gob.gt/variables/ws/TipoCambio.asmx");
            post.setHeader("Content-Type", "text/xml; charset=utf-8");
            post.setHeader("SOAPAction", "http://www.banguat.gob.gt/variables/ws/TipoCambioFechaInicial");
            post.setEntity(new StringEntity(soapRequest));

            String response = EntityUtils.toString(client.execute(post).getEntity());
            System.out.println("Response: " + response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    TipoCambioFechaInicialResponse obtenerTipoCambio(String fechaInicial) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setDefaultUri(String httpswwwbanguatgobgtvariableswsTipoCambio) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setMarshaller(Jaxb2Marshaller marshaller) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setUnmarshaller(Jaxb2Marshaller marshaller) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
