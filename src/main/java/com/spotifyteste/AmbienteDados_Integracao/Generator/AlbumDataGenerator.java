package com.spotifyteste.AmbienteDados_Integracao.Generator;

import com.github.javafaker.Faker;
import com.spotifyteste.AmbienteDados_Integracao.Models.Album;
import com.spotifyteste.AmbienteDados_Integracao.Repositories.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;



@Component
public class AlbumDataGenerator implements CommandLineRunner {

    @Autowired
    private AlbumRepository albumRepository;

    private final Faker faker = new Faker();

    @Override
    public void run(String... args) throws Exception {
        for (int i = 0; i < 100; i++) {
            Album album = new Album();
            album.setTitulo(faker.book().title());
            album.setData_lancamento(faker.date().past(3650, java.util.concurrent.TimeUnit.DAYS)); 

            albumRepository.save(album);
        }

        System.out.println("100 álbuns gerados com sucesso!");
    }
}
