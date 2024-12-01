package com.spotifyteste.AmbienteDados_Integracao.Models;

import jakarta.persistence.*;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

@Entity
public class Podcast {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    int id_podcast;
    String titulo;
    String descricao;
    Time duracao;
    Date data_lancamento;
    @ManyToOne
    Artista artista;
    @ManyToMany(mappedBy = "podcasts", fetch = FetchType.LAZY)
    List<Biblioteca> bibliotecas;
}
