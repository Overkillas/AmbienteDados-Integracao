package com.spotifyteste.AmbienteDados_Integracao.Generator;

import com.github.javafaker.Faker;
import com.spotifyteste.AmbienteDados_Integracao.Models.Album;
import com.spotifyteste.AmbienteDados_Integracao.Repositories.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.concurrent.TimeUnit;


@Component
public class AlbumDataGenerator implements CommandLineRunner {

    @Autowired
    private AlbumRepository albumRepository;

    private final Faker faker = new Faker();

    @Override
    public void run(String... args) throws Exception {
        for (int i = 0; i < 300; i++) { // Gerando 300 álbuns
            Album album = new Album();
            album.setTitulo(faker.book().title());
            album.setData_lancamento(faker.date().past(3650, java.util.concurrent.TimeUnit.DAYS)); // Até 10 anos atrás

            albumRepository.save(album);
        }

        System.out.println("300 álbuns gerados com sucesso!");
    }
}
