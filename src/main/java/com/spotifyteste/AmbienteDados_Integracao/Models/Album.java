package com.spotifyteste.AmbienteDados_Integracao.Models;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Album {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    int id_album;
    String titulo;
    Date data_nascimento;
    @ManyToMany
    @JoinTable(
            name = "Album_artista",
            joinColumns = @JoinColumn(name = "id_album"),
            inverseJoinColumns = @JoinColumn(name = "id_artista")
    )
    List<Artista> artistas;
    @ManyToMany(mappedBy = "albuns", fetch = FetchType.LAZY)
    List<Biblioteca> bibliotecas;
}
