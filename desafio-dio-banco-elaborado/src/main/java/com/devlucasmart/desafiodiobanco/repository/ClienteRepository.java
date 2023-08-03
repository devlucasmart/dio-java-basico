package com.devlucasmart.desafiodiobanco.repository;

import com.devlucasmart.desafiodiobanco.model.Cliente;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends PagingAndSortingRepository<Cliente, Integer>,
        QuerydslPredicateExecutor<Cliente> {
    boolean existsByNomeIgnoreCase(String nome);

    boolean existsByDescricaoIgnoreCaseAndIdNot(String nome, Integer id);
}
