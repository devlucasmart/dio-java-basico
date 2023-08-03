package com.devlucasmart.desafiodiobanco.dto;

import com.devlucasmart.desafiodiobanco.enuns.Transacoes;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransacaoDto {
    private LocalDateTime dataExtrato;
    private Transacoes tipo;
    private double valor;
}
