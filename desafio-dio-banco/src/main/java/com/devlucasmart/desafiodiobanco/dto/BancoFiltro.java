package com.devlucasmart.desafiodiobanco.dto;

import com.devlucasmart.desafiodiobanco.predicate.BancoPredicate;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BancoFiltro {
    private Integer id;
    private String nome;

    @JsonIgnore
    public BancoPredicate toPredicate() {
        return new BancoPredicate()
                .comId(id)
                .comNome(nome);
    }
}
