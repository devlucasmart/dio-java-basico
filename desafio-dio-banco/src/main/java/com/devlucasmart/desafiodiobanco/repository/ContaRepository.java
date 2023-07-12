package com.devlucasmart.desafiodiobanco.repository;

import com.devlucasmart.desafiodiobanco.model.Cliente;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContaRepository  extends PagingAndSortingRepository<Cliente, Integer>,
        QuerydslPredicateExecutor<Cliente> {
}
