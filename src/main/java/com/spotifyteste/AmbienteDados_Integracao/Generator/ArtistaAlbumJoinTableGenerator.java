package com.spotifyteste.AmbienteDados_Integracao.Generator;

import com.spotifyteste.AmbienteDados_Integracao.Models.Album;
import com.spotifyteste.AmbienteDados_Integracao.Models.Artista;
import com.spotifyteste.AmbienteDados_Integracao.Repositories.AlbumRepository;
import com.spotifyteste.AmbienteDados_Integracao.Repositories.ArtistaRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ArtistaAlbumJoinTableGenerator implements CommandLineRunner {

    private final ArtistaRepository artistaRepository;
    private final AlbumRepository albumRepository;

    public ArtistaAlbumJoinTableGenerator(ArtistaRepository artistaRepository, AlbumRepository albumRepository) {
        this.artistaRepository = artistaRepository;
        this.albumRepository = albumRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        // Carregar um artista existente
        Optional<Artista> artistaOpt = artistaRepository.findById(1);
        Optional<Album> albumOpt = albumRepository.findById(1);

        if (artistaOpt.isPresent() && albumOpt.isPresent()) {
            Artista artista = artistaOpt.get();
            Album album = albumOpt.get();

            // Fazer a associação
            artista.getAlbuns().add(album);

            // Salvar as alterações
            artistaRepository.save(artista);

            System.out.println("Associação criada com sucesso entre Artista e Álbum.");
        } else {
            System.out.println("Artista ou Álbum não encontrado.");
        }
    }
}
