package com.devlucasmart.desafiodiobanco.repository;

import com.devlucasmart.desafiodiobanco.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
