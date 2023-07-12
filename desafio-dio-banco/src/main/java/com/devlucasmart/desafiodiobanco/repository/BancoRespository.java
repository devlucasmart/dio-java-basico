package com.devlucasmart.desafiodiobanco.repository;

import com.devlucasmart.desafiodiobanco.model.Banco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BancoRespository extends PagingAndSortingRepository<Banco, Integer>,
        QuerydslPredicateExecutor<Banco> {
    boolean existsByDescricaoIgnoreCase(String nome);

    boolean existsByDescricaoIgnoreCaseAndIdNot(String nome, Integer id);
}
