package com.spotifyteste.AmbienteDados_Integracao.Models;

import com.spotifyteste.AmbienteDados_Integracao.Models.Enums.FormaPagamento;
import com.spotifyteste.AmbienteDados_Integracao.Models.Enums.Plano;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Assinatura {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    int id_assinatura;
    @Enumerated(EnumType.STRING)
    Plano plano;
    //DATA IMPORTADA DO DATE.SQL (NÃO DO UTIL)
    Date data_compra;
    @Enumerated(EnumType.STRING)
    FormaPagamento formaPagamento;
}
