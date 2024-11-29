package com.spotifyteste.AmbienteDados_Integracao.Models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Playlist {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    int id_playlist;
    String nome;
    Boolean isVisiblidade; // publica ou privada
    Biblioteca biblioteca;
}
