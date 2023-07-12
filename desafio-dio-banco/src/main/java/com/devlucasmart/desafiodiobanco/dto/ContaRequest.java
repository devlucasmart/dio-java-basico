package com.devlucasmart.desafiodiobanco.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ContaRequest {
    @NotBlank
    private String tipoConta;
    @NotBlank
    private int numero;
    @NotBlank
    private int agencia;
    @NotBlank
    private double saldo;
}
