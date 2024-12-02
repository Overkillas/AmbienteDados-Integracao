package com.spotifyteste.AmbienteDados_Integracao.Repositories;

import com.spotifyteste.AmbienteDados_Integracao.Models.Assinatura;
import com.spotifyteste.AmbienteDados_Integracao.Models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssinaturaRepository  extends JpaRepository<Assinatura, Integer> {
}
