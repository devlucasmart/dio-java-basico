package com.devlucasmart.desafiodiobanco.dto;

import com.devlucasmart.desafiodiobanco.predicate.ContaPredicate;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ContaFiltro {

    private int id;
    private String tipoConta;

    private int numero;

    private int agencia;

    private double saldo;

    @JsonIgnore
    public ContaPredicate toPredicate() {
        return new ContaPredicate()
                .comId(id)
                .comTipoConta(tipoConta)
                .comNumero(numero)
                .comAgencia(agencia)
                .comSaldo(saldo);

    }
}
