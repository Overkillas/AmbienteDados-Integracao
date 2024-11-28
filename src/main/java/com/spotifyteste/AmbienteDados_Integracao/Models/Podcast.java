package com.spotifyteste.AmbienteDados_Integracao.Models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.sql.Date;
import java.sql.Time;

public class Podcast {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    int id_podcast;
    String titulo;
    String descricao;
    Time duracao;
    Date data_lancamento;
    Artista artista;
}
