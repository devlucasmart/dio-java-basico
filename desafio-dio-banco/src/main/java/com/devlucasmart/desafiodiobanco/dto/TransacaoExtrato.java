package com.devlucasmart.desafiodiobanco.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class TransacaoExtrato {
    private List<TransacaoDto> transacoes;

    public TransacaoExtrato() {
        transacoes = new ArrayList<>();
    }

    public void addTransaction(TransacaoDto transaction) {
        transacoes.add(transaction);
    }
}
