package testJQ.Generator_JQ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import testJQ.Generator_JQ.controllers.GeneratorDataRepository;

@SpringBootApplication
public class GeneratorMvcApplication  {

	@Autowired
	private GeneratorDataRepository repositoryX;

	public static void main(String[] args) {
		SpringApplication.run(GeneratorMvcApplication.class, args);
	}

}
