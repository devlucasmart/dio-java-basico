package com.devlucasmart.desafiodiobanco.dto;

import com.devlucasmart.desafiodiobanco.model.Banco;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BancoResponse {
    private Integer id;
    private String nome;
    public static BancoResponse of(Banco banco) {
        return BancoResponse.builder()
                .id(banco.getId())
                .nome(banco.getNome())
                .build();
    }
}
