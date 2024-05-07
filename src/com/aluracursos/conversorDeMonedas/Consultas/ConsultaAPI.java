package com.aluracursos.conversorDeMonedas.Consultas;

import com.aluracursos.conversorDeMonedas.Modelos.Moneda;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.lang.module.FindException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaAPI {
    public Moneda consultaTipoDeCambio(String monedaOrigen, String monedaDestino, double montoAConvertir){
        String clave = "2e3432bb28c3b934f22ef35a";
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/" + clave + "/pair/" + monedaOrigen + "/" + monedaDestino + "/" + montoAConvertir);
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();
            Moneda miMoneda = gson.fromJson(json, Moneda.class);
            System.out.println(miMoneda);

            return new Gson().fromJson(response.body(), Moneda.class);


        } catch (FindException | IOException | InterruptedException e){
            throw new RuntimeException("No encontre esta moneda");
        }
    }
}
