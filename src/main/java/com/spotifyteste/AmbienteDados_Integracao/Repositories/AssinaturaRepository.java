package com.spotifyteste.AmbienteDados_Integracao.Repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.spotifyteste.AmbienteDados_Integracao.Models.Assinatura;

public interface AssinaturaRepository extends JpaRepository<Assinatura, Integer> {
}
