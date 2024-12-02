package com.spotifyteste.AmbienteDados_Integracao.Generator;

import com.spotifyteste.AmbienteDados_Integracao.Models.Assinatura;
import com.spotifyteste.AmbienteDados_Integracao.Models.Usuario;
import com.spotifyteste.AmbienteDados_Integracao.Repositories.AssinaturaRepository;
import com.spotifyteste.AmbienteDados_Integracao.Repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Random;
@Component
public class UsuarioDataGenerator implements CommandLineRunner {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private AssinaturaRepository assinaturaRepository;

    @Override
    public void run(String... args) throws Exception {
        List<Assinatura> assinaturas = assinaturaRepository.findAll();
        assinaturaRepository.findAll();

        for (int i = 1; i <= 1500; i++) {
            Usuario usuario = new Usuario();
            usuario.setNome("Usuário " + i);
            usuario.setEmail("usuario" + i + "@exemplo.com");
            usuario.setSenha("senha" + i);
            usuario.setData_nascimento(generateRandomDate());

            Assinatura assinatura = getRandomAssinatura(assinaturas);
            usuario.setAssinatura(assinatura);

            usuarioRepository.save(usuario);
        }

        System.out.println("1500 usuários foram gerados com sucesso!");
    }

    private Date generateRandomDate() {
        Random rand = new Random();
        long minDay = new Date().getTime() - 60L * 365 * 24 * 60 * 60 * 1000;
        long maxDay = new Date().getTime() - 20L * 365 * 24 * 60 * 60 * 1000;
        long randomTime = minDay + (long) (rand.nextDouble() * (maxDay - minDay));
        return new Date(randomTime);
    }

    private Assinatura getRandomAssinatura(List<Assinatura> assinaturas) {
        Random rand = new Random();
        return assinaturas.get(rand.nextInt(assinaturas.size()));
    }
}