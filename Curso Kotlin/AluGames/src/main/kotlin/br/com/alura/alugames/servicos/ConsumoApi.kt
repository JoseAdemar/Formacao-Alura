package br.com.alura.alugames.servicos

import br.com.alura.alugames.modelo.Gamer
import br.com.alura.alugames.modelo.InfoGamerJson
import br.com.alura.alugames.modelo.InfoJogo
import br.com.alura.alugames.modelo.Jogo
import br.com.alura.alugames.utilitario.criaGamer
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import criarJogo
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse
import java.util.*

class ConsumoApi {

    private fun consomeDados (endereco: String): String {
        val client: HttpClient = HttpClient.newHttpClient();
        val request = HttpRequest.newBuilder()
            .uri(URI.create(endereco))
            .build();

        val response = client.send(request, HttpResponse.BodyHandlers.ofString());

        return response.body();
    }

    private val leitura = Scanner(System.`in`)
    fun buscaJogo(id: String): Jogo? {
        val endereco = "https://www.cheapshark.com/api/1.0/games?id=$id";
        val json = consomeDados(endereco)
        val gson = Gson();

        var meuJogo: Jogo? = null;
        var infoJogo: InfoJogo? = null;
        val resultado = runCatching {
            infoJogo = gson.fromJson(json, InfoJogo::class.java);
            meuJogo = Jogo(infoJogo!!.info.title, infoJogo!!.info.thumb, infoJogo!!.info.preco);
        }

        resultado.onFailure {
            println("Id não encontrado. Tente outro ID");
        }

        resultado.onSuccess {
            println("Deseja inserir uma descrição personalizada? S/N");
            val opcao = leitura.nextLine();
            if (opcao.equals("s", true)) {
                println("Insira a descrição:");
                val descricaoPersonalizada = leitura.nextLine();
                meuJogo?.descricao = descricaoPersonalizada;
            }
        };
        return meuJogo;
    }

    fun buscaJogosJson(): List<Jogo> {
        val endereco = "https://raw.githubusercontent.com/jeniblodev/arquivosJson/main/jogos.json"
        val json = consomeDados(endereco)
        val gson = Gson();

        val meuJogoTipo = object : TypeToken<List<Jogo>>() {}.type
        val listaJogos:List<Jogo> = gson.fromJson(json, meuJogoTipo)

        val listaJogoConvertida = listaJogos.map { infoJogoTipoJson ->
             infoJogoTipoJson.criarJogo()
        }
        return listaJogoConvertida
    }

    fun buscaGamers(): List<Gamer> {
        val endereco = "https://raw.githubusercontent.com/jeniblodev/arquivosJson/main/gamers.json"

        val json = consomeDados(endereco)
        val gson = Gson();

        val meuGamerTipo = object : TypeToken<List<InfoGamerJson>>() {}.type
        val listaGamer:List<InfoGamerJson> = gson.fromJson(json, meuGamerTipo)

        val listaGamerConvertida = listaGamer.map { infoGamerJson ->
            infoGamerJson.criaGamer()
        }
        return listaGamerConvertida
    }
}