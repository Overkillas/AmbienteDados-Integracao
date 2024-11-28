package com.spotifyteste.AmbienteDados_Integracao.Models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Biblioteca {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    int id_biblioteca;
    Usuario usuario;
}
