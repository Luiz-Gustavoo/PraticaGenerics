package br.com.pratica.generics;

import br.com.pratica.generics.modelos.Assinatura;
import br.com.pratica.generics.modelos.Produto;
import br.com.pratica.generics.modelos.Servico;
import br.com.pratica.generics.services.Avaliacao;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class GenericsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(GenericsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Produto produto1 = new Produto("brinquedo");
		Avaliacao<Produto> avaliacao1 = new Avaliacao<>(produto1, 4);

		Assinatura assinatura1 = new Assinatura("streaming");
		Avaliacao<Assinatura> avaliacao2 = new Avaliacao<>(assinatura1, 3.1);

		Servico servico1 = new Servico("instalação");
		Avaliacao<Servico> avaliacao3 = new Avaliacao<>(servico1, 5);

		List<Avaliacao<?>> listaDeAvaliacao = new ArrayList<>();
		listaDeAvaliacao.add(avaliacao1);
		listaDeAvaliacao.add(avaliacao2);
		listaDeAvaliacao.add(avaliacao3);

		double media = Avaliacao.mediaAvaliacoes(listaDeAvaliacao);
		System.out.println(media);
	}
}
