package com.spotifyteste.AmbienteDados_Integracao.Models;

import jakarta.persistence.*;
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
public class Usuario {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    int id_usuario;
    String nome;
    String sobrenome;
    String email;
    String senha;
    Date data_nascimento;
    @ManyToOne
    @JoinColumn(name = "id_assinatura")
    Assinatura assinatura;
}
