package testJQ.Generator_JQ;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
public class  GeneratorJqApplication  {

	public static void main(String[] args) {

		SpringApplication.run(GeneratorJqApplication.class, args);
	}
}
