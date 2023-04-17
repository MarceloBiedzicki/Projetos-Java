package com.br.buscacep.servico;

import com.br.buscacep.modelo.CepFromJson;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ServicoCep {

    private static String adress = "https://viacep.com.br/ws/";

    public static CepFromJson getJson(String busca) {
        CepFromJson jsonCep = null;
        try {
            String fullAdress = adress + busca + "/json";
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(fullAdress))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            String body = response.body();


            Gson gson = new GsonBuilder()
                    .setPrettyPrinting()
                    .create();

            jsonCep = gson.fromJson(body, CepFromJson.class);

            return jsonCep;

        } catch (IOException | RuntimeException | InterruptedException e) {
            System.out.println("Um cep inválido foi informado, tente novamente.");
        } catch (Exception e) {
            System.out.println("Um cep inválido foi informado, tente novamente.");
        }
        return null;

    }
}
