package com.spotifyteste.AmbienteDados_Integracao.Models;

import jakarta.persistence.*;

import java.sql.Date;
import java.sql.Time;
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
public class Musica {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    int id_musica;
    String titulo;
    Time duracao;
    Date data_lancamento;
    @ManyToOne
    @JoinColumn(name = "id_genero_musical")
    GeneroMusical generoMusical;
    @ManyToOne
    @JoinColumn(name = "id_album")
    Album album;
    @ManyToMany(mappedBy = "musicas", fetch = FetchType.LAZY)
    List<Playlist> playlists;
}
