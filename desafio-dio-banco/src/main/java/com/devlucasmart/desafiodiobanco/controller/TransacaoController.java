package com.devlucasmart.desafiodiobanco.controller;

import com.devlucasmart.desafiodiobanco.dto.TransacaoDto;
import com.devlucasmart.desafiodiobanco.dto.TransacaoExtrato;
import com.devlucasmart.desafiodiobanco.enuns.Transacoes;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/transacao")
public class TransacaoController {
    @GetMapping("/transaction-history")
    public TransacaoExtrato getTransactionHistory() {
        TransacaoExtrato history = new TransacaoExtrato();

        // Simulating some transactions for demonstration purposes
        history.addTransaction(new TransacaoDto(LocalDateTime.now(), Transacoes.DEPOSITO, 1000.0));
        history.addTransaction(new TransacaoDto(LocalDateTime.now(), Transacoes.SAQUE, 500.0));
        history.addTransaction(new TransacaoDto(LocalDateTime.now(), Transacoes.TRANSFERENCIA, -300.0));

        return history;
    }
}
