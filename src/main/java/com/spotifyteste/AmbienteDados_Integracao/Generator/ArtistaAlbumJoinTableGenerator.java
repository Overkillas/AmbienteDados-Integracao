package com.spotifyteste.AmbienteDados_Integracao.Generator;

import com.spotifyteste.AmbienteDados_Integracao.Models.Album;
import com.spotifyteste.AmbienteDados_Integracao.Models.Artista;
import com.spotifyteste.AmbienteDados_Integracao.Repositories.AlbumRepository;
import com.spotifyteste.AmbienteDados_Integracao.Repositories.ArtistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Random;


@Component
public class ArtistaAlbumJoinTableGenerator implements CommandLineRunner {

    @Autowired
    private ArtistaRepository artistaRepository;

    @Autowired
    private AlbumRepository albumRepository;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Criando associações entre artistas e álbuns...");

        List<Artista> artistas = artistaRepository.findAll();
        List<Album> albuns = albumRepository.findAll();

        if (artistas.isEmpty() || albuns.isEmpty()) {
            System.out.println("Erro: Certifique-se de que artistas e álbuns foram gerados antes de criar as associações.");
            return;
        }

        Random rand = new Random();

        for (Artista artista : artistas) {
            int quantidadeAlbuns = rand.nextInt(3) + 1; // Cada artista terá entre 1 e 3 álbuns

            for (int i = 0; i < quantidadeAlbuns; i++) {
                Album album = albuns.get(rand.nextInt(albuns.size()));
                artista.getAlbuns().add(album); // Adiciona o álbum ao conjunto de álbuns do artista
            }

            artistaRepository.save(artista); // Atualiza as associações no banco
        }

        System.out.println("Associações entre artistas e álbuns criadas com sucesso!");
    }
}
