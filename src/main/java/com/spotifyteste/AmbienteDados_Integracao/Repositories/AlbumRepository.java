package com.spotifyteste.AmbienteDados_Integracao.Repositories;
import com.spotifyteste.AmbienteDados_Integracao.Models.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository<Album, Integer> {}