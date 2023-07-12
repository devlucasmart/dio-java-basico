package com.devlucasmart.desafiodiobanco.repository;

import com.devlucasmart.desafiodiobanco.model.Conta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Integer> {
//    public List<Conta> findByClienteIdAndDataBetween(Integer cliente_id, LocalDateTime dataInicial, LocalDateTime dataFinal);

}
