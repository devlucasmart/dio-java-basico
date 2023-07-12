package com.devlucasmart.desafiodiobanco.dto;

import com.devlucasmart.desafiodiobanco.model.Conta;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@EqualsAndHashCode
public class BancoDto {
    private Integer id;

    private String nome;

    private List<Conta> contas;
}
