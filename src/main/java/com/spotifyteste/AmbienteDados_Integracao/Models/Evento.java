package com.spotifyteste.AmbienteDados_Integracao.Models;

import jakarta.persistence.*;

import java.sql.Time;
import java.util.Date;

@Entity
public class Evento {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    int id_evento;
    String localizacao;
    Date data;
    Time horario;
    @ManyToOne
    Artista artista;
}
