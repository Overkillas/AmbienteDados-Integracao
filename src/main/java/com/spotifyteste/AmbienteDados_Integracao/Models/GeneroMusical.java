package com.spotifyteste.AmbienteDados_Integracao.Models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class GeneroMusical {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    int id_genero_musical;
    String descricao;


}
