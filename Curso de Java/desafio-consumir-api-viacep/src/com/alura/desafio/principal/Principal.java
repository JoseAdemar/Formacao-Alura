package com.alura.desafio.principal;

import com.alura.desafio.entidades.Endereco;
import com.alura.desafio.servicos.EnderecoService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um CEP:");
        String cep = scanner.nextLine();

        EnderecoService enderecoService = new EnderecoService();
        Endereco novoEndereco = enderecoService.buscaCep(cep);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String enderecoJson = gson.toJson(novoEndereco, Endereco.class);

        FileWriter fileWriter = new FileWriter("cep.json");
        fileWriter.write(enderecoJson);
        fileWriter.close();

        System.out.println(novoEndereco);
    }
}
