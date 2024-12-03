package com.spotifyteste.AmbienteDados_Integracao.Generator;

import com.spotifyteste.AmbienteDados_Integracao.Models.Biblioteca;
import com.spotifyteste.AmbienteDados_Integracao.Models.Usuario;
import com.spotifyteste.AmbienteDados_Integracao.Repositories.BibliotecaRepository;
import com.spotifyteste.AmbienteDados_Integracao.Repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class BibliotecaDataGenerator implements CommandLineRunner {

    @Autowired
    private BibliotecaRepository bibliotecaRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public void run(String... args) {
        List<Usuario> usuarios = usuarioRepository.findAll();
        
        Collections.shuffle(usuarios);

  
        int limite = Math.min(20, usuarios.size());

        for (int i = 0; i < limite; i++) {
            Usuario usuario = usuarios.get(i);

            Biblioteca biblioteca = new Biblioteca();
            biblioteca.setUsuario(usuario); 
            bibliotecaRepository.save(biblioteca); 

        }

        System.out.println("Foram criadas 20 bibliotecas");
    }
}
