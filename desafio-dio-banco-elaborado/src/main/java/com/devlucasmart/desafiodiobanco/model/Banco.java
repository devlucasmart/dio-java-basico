package com.devlucasmart.desafiodiobanco.model;

import com.devlucasmart.desafiodiobanco.dto.BancoRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import java.util.List;

@Setter
@Getter
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Banco {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_BANCO")
    @SequenceGenerator(name = "SEQ_BANCO", sequenceName = "SEQ_BANCO", allocationSize = 1)
    private Integer id;

    private String nome;
    @JsonIgnore
    @OneToMany(mappedBy = "banco", fetch = FetchType.EAGER)
    private List<Conta> contas;
    public static Banco of(BancoRequest bancoRequest) {
        return Banco.builder()
                .nome(bancoRequest.getNome())
                .build();
    }
}
