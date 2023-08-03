package com.devlucasmart.desafiodiobanco.predicate;

import com.devlucasmart.desafiodiobanco.config.infra.PredicateBase;

import java.time.LocalDate;
import java.time.LocalTime;

import static com.devlucasmart.desafiodiobanco.model.QConta.conta;
import static org.apache.logging.log4j.util.Strings.isNotBlank;

public class ContaPredicate extends PredicateBase {
    public ContaPredicate comId(Integer id) {
        if (id != null) {
            builder.and(conta.id.eq(id));
        }
        return this;
    }

    public ContaPredicate comTipoConta(String tipoConta) {
        if (isNotBlank(tipoConta)) {
            builder.and(conta.tipoConta.equalsIgnoreCase(tipoConta));
        }

        return this;
    }

    public ContaPredicate comNumero(Integer numero) {
        if (numero != null) {
            builder.and(conta.numero.eq(numero));
        }
        return this;
    }

    public ContaPredicate comAgencia(Integer agencia) {
        if (agencia != null) {
            builder.and(conta.agencia.eq(agencia));
        }
        return this;
    }

    public ContaPredicate comSaldo(Double saldo) {
        if (saldo != null) {
            builder.and(conta.saldo.eq(saldo));
        }
        return this;
    }

    public ContaPredicate comData(LocalDate dataInicio, LocalDate dataFim) {
        if (dataInicio != null && dataFim != null) {
            builder.and(conta.dataCadastro.between(dataInicio.atStartOfDay(), dataFim.atTime(LocalTime.MAX)));
        }

        return this;
    }
    public ContaPredicate comClienteId(Integer clienteId) {
        if (clienteId != null) {
            builder.and(conta.cliente.id.eq(clienteId));
        }
        return this;
    }
    public ContaPredicate comBancoId(Integer bancoId) {
        if (bancoId != null) {
            builder.and(conta.cliente.id.eq(bancoId));
        }
        return this;
    }
}
