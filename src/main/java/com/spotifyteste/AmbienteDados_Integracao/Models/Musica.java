package com.spotifyteste.AmbienteDados_Integracao.Models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.sql.Date;
import java.sql.Time;

public class Musica {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    int id_musica;
    String titulo;

    Time duracao;
    Date data_lancamento;
    Artista artista;
    GeneroMusical generoMusical;
    Album album;
}
