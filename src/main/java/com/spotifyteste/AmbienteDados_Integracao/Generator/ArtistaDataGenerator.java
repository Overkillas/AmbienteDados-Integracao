package com.spotifyteste.AmbienteDados_Integracao.Generator;

import com.github.javafaker.Faker;
import com.spotifyteste.AmbienteDados_Integracao.Models.Artista;
import com.spotifyteste.AmbienteDados_Integracao.Repositories.ArtistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ArtistaDataGenerator implements CommandLineRunner {

    @Autowired
    private ArtistaRepository artistaRepository;

    private final Faker faker = new Faker();

    @Override
    public void run(String... args) {
        List<Artista> artistas = new ArrayList<>();

        // Gera 500 artistas fictícios
        for (int i = 0; i < 500; i++) {
            Artista artista = new Artista();
            artista.setNome_artistico(faker.artist().name());
            artista.setBiografia(faker.lorem().paragraph());
            artista.setPais_origem(faker.country().name());
            artistas.add(artista);
        }

        // Salva todos os artistas em um único batch
        artistaRepository.saveAll(artistas);

        // Feedback final
        System.out.println("500 artistas fictícios foram gerados com sucesso!");
    }
}
