package com.devlucasmart.desafiodiobanco.repository;

import com.devlucasmart.desafiodiobanco.model.Banco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BancoRepository extends JpaRepository<Banco, Integer> {
}
