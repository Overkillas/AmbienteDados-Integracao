package com.spotifyteste.AmbienteDados_Integracao.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Set;

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
