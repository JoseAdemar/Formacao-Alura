package com.alura.desafio.servicos;

import com.alura.desafio.entidades.Endereco;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class EnderecoService {

    public Endereco buscaCep(String cep) throws IOException, InterruptedException {
        String url = "https://viacep.com.br/ws/" + cep + "/json/";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();

        HttpResponse response = client.send(request, HttpResponse.BodyHandlers.ofString());

        Gson gson = new Gson();
        Endereco endereco = gson.fromJson(response.body().toString(), Endereco.class);

        return endereco;
    }
}
