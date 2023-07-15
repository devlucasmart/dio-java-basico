package com.devlucasmart.desafiodiobanco.repository;

import com.devlucasmart.desafiodiobanco.model.Conta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Integer> {
//    public List<Conta> findByClienteIdAndDataBetween(Integer cliente_id, LocalDateTime dataInicial, LocalDateTime dataFinal);

}
