package com.alura.conversormodenas.modelo;

import com.alura.conversormodenas.excepcion.ErrorEnConversionMonedaException;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class Consultaapi {

    public Moneda buscarMoneda(String monedaBase, String monedaTarget) {

        var clave = "4d51da5836acdbe491917bcc";
        String direccion = "https://v6.exchangerate-api.com/v6/" + clave + "/pair/" + monedaBase + "/" + monedaTarget;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);


        } catch (NumberFormatException e) {
            System.out.println("Ocurrio un error: ");
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            throw new RuntimeException("Error en la URI, verifique la dirección.");

        } catch (ErrorEnConversionMonedaException e) {
            System.out.println(e.getMessage());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}