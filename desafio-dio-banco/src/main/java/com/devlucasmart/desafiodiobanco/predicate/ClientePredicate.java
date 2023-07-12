package com.devlucasmart.desafiodiobanco.predicate;

import com.devlucasmart.desafiodiobanco.config.infra.PredicateBase;


import static com.devlucasmart.desafiodiobanco.model.QCliente.cliente;
import static org.apache.logging.log4j.util.Strings.isNotBlank;

public class ClientePredicate extends PredicateBase {

    public ClientePredicate comId(Integer id) {
        if (id != null) {
            builder.and(cliente.id.eq(id));
        }

        return this;
    }

    public ClientePredicate comNome(String nome) {
        if (isNotBlank(nome)) {
            builder.and(cliente.nome.equalsIgnoreCase(nome));
        }

        return this;
    }
}
