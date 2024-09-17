package br.com.alura.screenmatch;

import br.com.alura.screenmatch.service.ConsumoApi;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String url = "http://www.omdbapi.com/?t=Game%20of%20Thrones&Season=1&apikey=d4ee72a2";
		var consumoApi = new ConsumoApi();
		var json = consumoApi.obterDados(url);
		System.out.println(json);
	}
}
