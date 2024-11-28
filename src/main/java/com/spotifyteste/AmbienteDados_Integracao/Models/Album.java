package com.spotifyteste.AmbienteDados_Integracao.Models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

public class Album {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    int id_album;
    String titulo;
    Date data_nascimento;
    Artista artista;
}
