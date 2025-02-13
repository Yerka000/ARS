package kz.aitu.restpro2422.restpro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "kz.aitu.restpro2422.restpro.entities")
public class RestproApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestproApplication.class, args);
	}

}
