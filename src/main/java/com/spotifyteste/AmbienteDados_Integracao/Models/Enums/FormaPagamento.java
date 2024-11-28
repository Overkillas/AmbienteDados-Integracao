package com.spotifyteste.AmbienteDados_Integracao.Models.Enums;

public enum FormaPagamento {
    CREDITO("CREDITO"),
    DEBITO("DEBITO");

    String formaPagamento;

    FormaPagamento (String formaPagamento){
        this.formaPagamento = formaPagamento;
    }
}
