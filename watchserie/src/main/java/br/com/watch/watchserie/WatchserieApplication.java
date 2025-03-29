package br.com.watch.watchserie;

import br.com.watch.watchserie.model.DadosTemporada;
import br.com.watch.watchserie.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class WatchserieApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(WatchserieApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Principal principal = new Principal();
		principal.exibMenu();



		//json = consumoApi.obterDados("https://coffee.alexflipnote.dev/random.json");
		//System.out.println(json);
	}
}
