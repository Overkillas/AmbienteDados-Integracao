package com.spotifyteste.AmbienteDados_Integracao.Generator;


import com.github.javafaker.Faker;
import com.spotifyteste.AmbienteDados_Integracao.Models.Assinatura;
import com.spotifyteste.AmbienteDados_Integracao.Models.Enums.FormaPagamento;
import com.spotifyteste.AmbienteDados_Integracao.Models.Enums.Plano;
import com.spotifyteste.AmbienteDados_Integracao.Repositories.AssinaturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.util.concurrent.ThreadLocalRandom;

@Component
@Order(1)
public class AssinaturaDataGenerator implements CommandLineRunner {

    @Autowired
    private AssinaturaRepository assinaturaRepository;

    @Override
    public void run(String... args) throws Exception {
        Faker faker = new Faker();


        for (int i = 0; i < 100; i++) { 
            Assinatura assinatura = new Assinatura();
            assinatura.setPlano(Plano.values()[ThreadLocalRandom.current().nextInt(Plano.values().length)]); // Plano aleatório
            assinatura.setData_compra(Date.valueOf(faker.date().birthday().toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate())); // Data aleatória
            assinatura.setFormaPagamento(FormaPagamento.values()[ThreadLocalRandom.current().nextInt(FormaPagamento.values().length)]); // Forma de pagamento aleatória

            assinaturaRepository.save(assinatura); 
        }

        System.out.println("Processo de 100 gerações de assinaturas concluído!");
    }
}
