package com.spotifyteste.AmbienteDados_Integracao.Generator;


import com.github.javafaker.Faker;
import com.spotifyteste.AmbienteDados_Integracao.Models.Assinatura;
import com.spotifyteste.AmbienteDados_Integracao.Models.Enums.FormaPagamento;
import com.spotifyteste.AmbienteDados_Integracao.Models.Enums.Plano;
import com.spotifyteste.AmbienteDados_Integracao.Repositories.AssinaturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;

@Component
public class AssinaturaDataGenerator implements CommandLineRunner {

    @Autowired
    private AssinaturaRepository assinaturaRepository;

    @Override
    public void run(String... args) throws Exception {
        Faker faker = new Faker();

        System.out.println("Iniciando a geração de dados de assinatura...");

        for (int i = 0; i < 100; i++) { // Gerando 10 assinaturas aleatórias
            Assinatura assinatura = new Assinatura();
            assinatura.setPlano(Plano.values()[ThreadLocalRandom.current().nextInt(Plano.values().length)]); // Plano aleatório
            assinatura.setData_compra(Date.valueOf(faker.date().birthday().toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate())); // Data aleatória
            assinatura.setFormaPagamento(FormaPagamento.values()[ThreadLocalRandom.current().nextInt(FormaPagamento.values().length)]); // Forma de pagamento aleatória

            assinaturaRepository.save(assinatura); // Salvando no banco de dados
        }

        System.out.println("Processo de 100 gerações de assinaturas concluído!");
    }
}
