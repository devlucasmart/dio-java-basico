package com.devlucasmart.desafiodiobanco.dto;

import com.devlucasmart.desafiodiobanco.model.Banco;
import com.devlucasmart.desafiodiobanco.model.Cliente;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@EqualsAndHashCode
public class ContaDto {
    private Integer id;
    private String tipoConta;
    private int numero;
    private int agencia;
    private double saldo;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Cliente cliente;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Banco banco;
}
