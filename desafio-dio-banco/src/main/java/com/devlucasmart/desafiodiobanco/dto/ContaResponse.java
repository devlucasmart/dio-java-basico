package com.devlucasmart.desafiodiobanco.dto;

import com.devlucasmart.desafiodiobanco.model.Cliente;
import com.devlucasmart.desafiodiobanco.model.Conta;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ContaResponse {

    private Integer id;
    private String tipoConta;

    private int numero;

    private int agencia;
    private double saldo;
    public static ContaResponse of(Conta conta) {
        return ContaResponse.builder()
                .id(conta.getId())
                .tipoConta(conta.getTipoConta())
                .numero(conta.getNumero())
                .agencia(conta.getAgencia())
                .saldo(conta.getSaldo())
                .build();
    }
}
