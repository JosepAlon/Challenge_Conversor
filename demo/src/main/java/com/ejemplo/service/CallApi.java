package com.ejemplo.service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

/*
 *     // Esto reemplaza %s con el valor de apiKey.
    private String apiKey = "a23cc504d7a2f3d210d49da1";
    private String baseUrl = String.format(
        "https://v6.exchangerate-api.com/v6/%s/latest/USD", 
        apiKey
    );
 */

public class CallApi {

    private String apiKey = "a23cc504d7a2f3d210d49da1";
    
    
    //Esto hace la peticion a la api con la moneda qeu el usario tiene como principal
    public double obtenerConversion(String moneda1, String moneda2) {

        String monedaPrincipal = moneda1;
        String baseUrl = String.format("https://v6.exchangerate-api.com/v6/%s/latest/%s", apiKey, monedaPrincipal);




        System.out.println("valor de la moneda1: " + moneda1);
        System.out.println("valor de la moneda2: " + moneda2);
        
        HttpClient client = HttpClient.newHttpClient();
  
        HttpRequest solicitud = HttpRequest.newBuilder()
        .uri(URI.create(baseUrl))
        .GET()
        .build();
        
        try {
            HttpResponse<String> resp = client.send(solicitud, HttpResponse.BodyHandlers.ofString());
            System.out.println("JSON recibido");
            
            JsonObject json = JsonParser.parseString(resp.body()).getAsJsonObject();
            JsonObject conversionRates = json.getAsJsonObject("conversion_rates");

            double rate = conversionRates.get(moneda2).getAsDouble();
            System.out.println( "aca esta el rate que es la conversion: " + rate);
            return rate ;

        } catch (Exception e) {
            System.out.println("Error al realizar la solicitud: " + e.getMessage());
        }
        return 0;
    }

}
