package com.spotifyteste.AmbienteDados_Integracao.Models;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Artista {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    int id_artista;
    String nome_artistico;
    String biografia;
    String pais_origem;
    @ManyToMany(mappedBy = "artistas", fetch = FetchType.LAZY)
    Set<Album> albuns;
}
