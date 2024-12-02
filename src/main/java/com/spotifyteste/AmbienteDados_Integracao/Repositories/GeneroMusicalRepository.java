package com.spotifyteste.AmbienteDados_Integracao.Repositories;

import com.spotifyteste.AmbienteDados_Integracao.Models.GeneroMusical;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GeneroMusicalRepository extends JpaRepository<GeneroMusical, Integer> {
    @Query("SELECT g.descricao FROM GeneroMusical g")
    List<String> findAllDescricoes();
}
