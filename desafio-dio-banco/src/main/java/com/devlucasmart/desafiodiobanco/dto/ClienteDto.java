package com.devlucasmart.desafiodiobanco.dto;

import com.devlucasmart.desafiodiobanco.model.Conta;
import com.fasterxml.jackson.annotation.JsonInclude;
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
public class ClienteDto {
    private Integer id;

    private String nome;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Conta conta;
}
