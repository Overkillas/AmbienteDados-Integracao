package com.spotifyteste.AmbienteDados_Integracao.Generator;
import com.github.javafaker.Faker;
import com.spotifyteste.AmbienteDados_Integracao.Models.Album;
import com.spotifyteste.AmbienteDados_Integracao.Models.GeneroMusical;
import com.spotifyteste.AmbienteDados_Integracao.Models.Musica;
import com.spotifyteste.AmbienteDados_Integracao.Repositories.AlbumRepository;
import com.spotifyteste.AmbienteDados_Integracao.Repositories.GeneroMusicalRepository;
import com.spotifyteste.AmbienteDados_Integracao.Repositories.MusicaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;
import java.sql.Time;
import java.util.List;
import java.util.Random;

@Component
@Order(5)
public class MusicaDataGenerator implements CommandLineRunner {

    @Autowired
    private GeneroMusicalRepository generoMusicalRepository;

    @Autowired
    private AlbumRepository albumRepository;

    @Autowired
    private MusicaRepository musicaRepository;

    private final Faker faker = new Faker();
    private final Random random = new Random();

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        List<GeneroMusical> generos = generoMusicalRepository.findAll();
        List<Album> albuns = albumRepository.findAll();


        for (int i = 1; i <= 100; i++) {
            GeneroMusical generoAleatorio = generos.get(random.nextInt(generos.size()));
            Album albumAleatorio = albuns.get(random.nextInt(albuns.size()));

            Musica musica = new Musica();
            musica.setTitulo(faker.rockBand().name() + " - " + faker.music().instrument());
            musica.setDuracao(Time.valueOf(String.format("%02d:%02d:00", random.nextInt(2), random.nextInt(60))));
            musica.setData_lancamento(new Date(faker.date().birthday().getTime()));
            musica.setGeneroMusical(generoAleatorio);
            musica.setAlbum(albumAleatorio);

            musicaRepository.save(musica);
        }

        System.out.println("100 músicas geradas com sucesso!");
    }
}
