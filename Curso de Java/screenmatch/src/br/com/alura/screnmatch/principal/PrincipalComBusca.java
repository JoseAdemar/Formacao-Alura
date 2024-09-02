package br.com.alura.screnmatch.principal;

import br.com.alura.screnmatch.execao.ErroDeConversaoDeAnoException;
import br.com.alura.screnmatch.modelos.Titulo;
import br.com.alura.screnmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        List<Titulo> titulos = new ArrayList<>();

        Gson gson = new GsonBuilder().setPrettyPrinting()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();

        while (true) {
            System.out.println("Digite um o nome de um filme para busca:");
            String busca = leitura.nextLine().replace(" ", "+");

            if (busca.equalsIgnoreCase("sair")) {
                break;
            }

            try {
                String endereco = "https://www.omdbapi.com/?t=" + busca + "&apikey=d4ee72a2";

                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(endereco))
                        .build();

                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                //System.out.println(json);

                TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
                //System.out.println(meuTituloOmdb);


                Titulo meuTitulo = new Titulo(meuTituloOmdb);
                //System.out.println("Titulo já convertido");
                //System.out.println(meuTitulo);

                titulos.add(meuTitulo);

            } catch (NumberFormatException e) {
                System.out.println("Aconteceu um erro: " + e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Algum erro com o argumento utilizado na busca");
            } catch (ErroDeConversaoDeAnoException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(titulos);
        FileWriter escrita = new FileWriter("file.json");
        escrita.write(gson.toJson(titulos));
        escrita.close();


        System.out.println("O programa finalizou corretamente!");
    }
}

