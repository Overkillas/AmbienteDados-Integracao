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

       
        for (int i = 0; i < 100; i++) {
            Artista artista = new Artista();
            artista.setNome_artistico(faker.artist().name());
            artista.setBiografia(faker.lorem().paragraph());
            artista.setPais_origem(faker.country().name());
            artistas.add(artista);
        }

       
        artistaRepository.saveAll(artistas);

        
        System.out.println("100 artistas fictícios foram gerados com sucesso!");
    }
}
