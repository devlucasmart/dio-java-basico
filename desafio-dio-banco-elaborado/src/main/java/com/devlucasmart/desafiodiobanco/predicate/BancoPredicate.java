package com.devlucasmart.desafiodiobanco.predicate;

import com.devlucasmart.desafiodiobanco.config.infra.PredicateBase;

import static com.devlucasmart.desafiodiobanco.model.QBanco.banco;
import static org.apache.logging.log4j.util.Strings.isNotBlank;

public class BancoPredicate extends PredicateBase {
    public BancoPredicate comId(Integer id) {
        if (id != null) {
            builder.and(banco.id.eq(id));
        }
        return this;
    }
    public BancoPredicate comNome(String nome) {
        if (isNotBlank(nome)) {
            builder.and(banco.nome.equalsIgnoreCase(nome));
        }

        return this;
    }

}
