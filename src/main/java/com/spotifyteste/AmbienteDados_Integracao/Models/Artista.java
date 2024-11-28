package com.spotifyteste.AmbienteDados_Integracao.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Artista {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    int id_artista;
    String nome;
    String nome_artistico;
    String biografia;
    String pais_origem;
}
