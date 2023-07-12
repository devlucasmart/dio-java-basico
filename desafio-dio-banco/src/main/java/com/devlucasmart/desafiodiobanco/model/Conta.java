package com.devlucasmart.desafiodiobanco.model;

import com.devlucasmart.desafiodiobanco.dto.ContaRequest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "conta")
public class Conta {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CONTA")
    @SequenceGenerator(name = "SEQ_CONTA", sequenceName = "SEQ_CONTA", allocationSize = 1)
    private Integer id;
    @Column(nullable = false)
    private String tipoConta;
    @Column(nullable = false)
    private int numero;
    @Column(nullable = false)
    private int agencia;
    @Column(nullable = false)
    private double saldo;
    @Column(name = "DATA_CADASTRO")
    private LocalDateTime dataCadastro;
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;
    @ManyToOne
    @JoinColumn(name = "banco_id")
    private Banco banco;

    public static Conta of(ContaRequest contaRequest) {
        return Conta.builder()
                .tipoConta(contaRequest.getTipoConta())
                .numero(contaRequest.getNumero())
                .agencia(contaRequest.getAgencia())
                .saldo(contaRequest.getSaldo())
                .build();
    }
}
