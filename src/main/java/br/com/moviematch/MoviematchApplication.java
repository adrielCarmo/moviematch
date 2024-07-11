package br.com.moviematch;

import br.com.moviematch.model.DadosTitulo;
import br.com.moviematch.service.ConsumoAPI;
import br.com.moviematch.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MoviematchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MoviematchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumoAPI = new ConsumoAPI();
		var json = consumoAPI.obterDados("https://www.omdbapi.com/?t=Arrow&apikey=");

		ConverteDados conversor = new ConverteDados();
		DadosTitulo dados = conversor.obterDados(json, DadosTitulo.class);

		System.out.println(dados);
	}
}
