package dio.treino.aprendizado;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import dio.treino.aprendizado.aula02.ConversorJson;
import dio.treino.aprendizado.aula02.ViaCepResponse;

@SpringBootApplication
public class AprendizadoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AprendizadoApplication.class, args);

	}

	@Bean
	public CommandLineRunner run(ConversorJson conversor) throws Exception {
		return args -> {
			String json = "{\"cep\": \"01001-000\", \"logadouro\": \"Praça de Sé\", \"localidade\": \"Santa Terezinha\"}";
			ViaCepResponse response = conversor.converter(json);
			System.out.println("Dados do CEP: " + response);
		};
	}

}
