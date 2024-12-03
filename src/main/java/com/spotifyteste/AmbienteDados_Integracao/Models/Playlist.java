package com.spotifyteste.AmbienteDados_Integracao.Models;

import jakarta.persistence.*;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Playlist {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    int id_playlist;
    String nome;
    Boolean isVisible; // publica ou privada]
    @ManyToOne
    Usuario usuario;
    @ManyToMany(mappedBy = "playlists", fetch = FetchType.LAZY)
    List<Biblioteca> bibliotecas;
    @ManyToMany
    @JoinTable(
            name = "Playlist_musica",
            joinColumns = @JoinColumn(name = "id_playlist"),
            inverseJoinColumns = @JoinColumn(name = "id_musica")
    )
    List<Musica> musicas;
}
