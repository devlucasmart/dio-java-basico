package org.example.desafio.dominio;

import java.time.LocalDate;

public abstract class Conteudo {
    protected static final double XP_PADRAO = 10d;
    private String tituto;
    private String descricao;

    public String getTituto() {
        return tituto;
    }

    public void setTituto(String tituto) {
        this.tituto = tituto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public abstract double calcularXp();
}
