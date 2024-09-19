package br.com.alura.screenmatch;

import br.com.alura.screenmatch.model.DadosEpisodio;
import br.com.alura.screenmatch.model.DadosSerie;
import br.com.alura.screenmatch.model.DadosTemporada;
import br.com.alura.screenmatch.service.ConsumoApi;
import br.com.alura.screenmatch.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String url = "http://www.omdbapi.com/?t=Game%20of%20Thrones&apikey=d4ee72a2";
		var consumoApi = new ConsumoApi();
		var json = consumoApi.obterDados(url);
		//System.out.println(json);
		//System.out.println("--------------------------------------------");
		ConverteDados conversor = new ConverteDados();
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		System.out.println(dados);
		System.out.println("----------------------------------------");

		url = "https://www.omdbapi.com/?t=Game%20of%20Thrones&Season=1&episode=2&apikey=d4ee72a2";
		json = consumoApi.obterDados(url);
		DadosEpisodio dadosEpisodio = conversor.obterDados(json, DadosEpisodio.class);
		System.out.println(dadosEpisodio);
		System.out.println("----------------------------------------");

		List<DadosTemporada> temporadas = new ArrayList<>();
		DadosTemporada dadosTemporada = conversor.obterDados(json, DadosTemporada.class);
		for (int i = 1;  i <= dados.totalTemporadas(); i++){
			json = consumoApi.obterDados("https://www.omdbapi.com/?t=Game%20of%20Thrones&Season="+ i + "&apikey=d4ee72a2");
			dadosTemporada = conversor.obterDados(json, DadosTemporada.class);
		}

		temporadas.add(dadosTemporada);
		//temporadas.forEach(System.out::println);
		temporadas.stream().sorted()
				.forEach(System.out::println);
	}
}
