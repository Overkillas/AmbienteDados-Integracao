package com.spotifyteste.AmbienteDados_Integracao.Models.Enums;
public enum Plano {
    NENHUM("NENHUM"),
    INDIVIDUAL("INDIVIDUAL"),
    FAMILIA("FAMILIA");

    private String plano;
    Plano(String plano) {
        this.plano = plano;
    }
}
