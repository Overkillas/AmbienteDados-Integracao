package com.spotifyteste.AmbienteDados_Integracao.Repositories;
import com.spotifyteste.AmbienteDados_Integracao.Models.Biblioteca;
import com.spotifyteste.AmbienteDados_Integracao.Models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BibliotecaRepository extends JpaRepository<Biblioteca, Integer> {
    boolean existsByUsuario(Usuario usuario);
}
