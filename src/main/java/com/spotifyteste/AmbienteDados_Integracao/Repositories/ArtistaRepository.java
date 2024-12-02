package com.spotifyteste.AmbienteDados_Integracao.Repositories;
import com.spotifyteste.AmbienteDados_Integracao.Models.Artista;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistaRepository extends JpaRepository<Artista, Integer> {}