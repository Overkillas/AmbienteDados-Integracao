package com.spotifyteste.AmbienteDados_Integracao.Models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.sql.Time;
import java.util.Date;

public class Evento {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    int id_evento;
    String localizacao;
    Date data;
    Time horario;
    Artista artista;
}
