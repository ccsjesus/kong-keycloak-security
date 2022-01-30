package br.com.tecnssi.securitykongkeycloak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("br.com*")
public class SecurityKongKeycloakApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityKongKeycloakApplication.class, args);
	}

}
