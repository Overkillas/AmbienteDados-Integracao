package com.spotifyteste.AmbienteDados_Integracao.Models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Biblioteca {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    int id_biblioteca;
    @OneToOne
    @JoinColumn(name = "id_usuario")
    Usuario usuario;
    @ManyToMany
    @JoinTable(
            name = "Album_Biblioteca",
            joinColumns = @JoinColumn(name = "id_biblioteca"),
            inverseJoinColumns = @JoinColumn(name = "id_musica")
    )
    List<Album> albuns;
    @ManyToMany
    @JoinTable(
            name = "Playlist_Biblioteca",
            joinColumns = @JoinColumn(name = "id_biblioteca"),
            inverseJoinColumns = @JoinColumn(name = "id_playlist")
    )
    List<Playlist> playlists;
    @ManyToMany
    @JoinTable(
            name = "Podcast_biblioteca",
            joinColumns = @JoinColumn(name = "id_biblioteca"),
            inverseJoinColumns = @JoinColumn(name = "id_podcast")
    )
    List<Podcast> podcasts;
}
