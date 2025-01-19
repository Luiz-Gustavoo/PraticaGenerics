package br.com.pratica.generics;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GenericsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(GenericsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("teste");
	}
}
