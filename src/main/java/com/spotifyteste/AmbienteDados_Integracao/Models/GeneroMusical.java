package com.spotifyteste.AmbienteDados_Integracao.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class GeneroMusical {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    int id_genero_musical;
    String descricao;
}
