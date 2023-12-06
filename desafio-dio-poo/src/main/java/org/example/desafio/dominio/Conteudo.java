package org.example.desafio.dominio;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class Conteudo {
    protected static final double XP_PADRAO = 10d;
    private String tituto;
    private String descricao;

    public abstract double calcularXp();
}
