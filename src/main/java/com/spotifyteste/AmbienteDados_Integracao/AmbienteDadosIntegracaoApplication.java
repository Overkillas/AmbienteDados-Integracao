package com.spotifyteste.AmbienteDados_Integracao;

import java.util.TimeZone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AmbienteDadosIntegracaoApplication {

	public static void main(String[] args) {
		TimeZone.setDefault(TimeZone.getTimeZone("America/Fortaleza"));
        SpringApplication.run(AmbienteDadosIntegracaoApplication.class, args);
    }

}
