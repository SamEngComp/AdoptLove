package br.com.backendlearning.AdoptLove;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class AdoptLoveApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdoptLoveApplication.class, args);
	}

}