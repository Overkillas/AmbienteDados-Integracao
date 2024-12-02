package com.spotifyteste.AmbienteDados_Integracao.Generator;

import com.spotifyteste.AmbienteDados_Integracao.Models.GeneroMusical;
import com.spotifyteste.AmbienteDados_Integracao.Repositories.GeneroMusicalRepository;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
public class GeneroMusicalDataGenerator implements CommandLineRunner {

    @Autowired
    private GeneroMusicalRepository generoMusicalRepository;

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        System.out.println("Iniciando o gerador de dados para Gêneros Musicais...");

        Faker faker = new Faker();

       
        int quantidadeGeneros = 10;

 
        List<String> descricoesNoBanco = generoMusicalRepository.findAllDescricoes();
        Set<String> descricoesExistentes = new HashSet<>(descricoesNoBanco);

        int inseridos = 0;

        while (inseridos < quantidadeGeneros) {
            String descricao = faker.music().genre();

            if (!descricoesExistentes.contains(descricao)) {
                GeneroMusical generoMusical = new GeneroMusical();
                generoMusical.setDescricao(descricao);

                generoMusicalRepository.save(generoMusical);
                descricoesExistentes.add(descricao);
                inseridos++;

            } else {
                inseridos++;
            }
        }

        System.out.println("10 Gêneros musicais criados com sucesso!");
    }
}
