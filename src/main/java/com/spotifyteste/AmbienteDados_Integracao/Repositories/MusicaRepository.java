package com.spotifyteste.AmbienteDados_Integracao.Repositories;

import com.spotifyteste.AmbienteDados_Integracao.Models.Musica;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MusicaRepository extends JpaRepository<Musica, Integer> {
}
