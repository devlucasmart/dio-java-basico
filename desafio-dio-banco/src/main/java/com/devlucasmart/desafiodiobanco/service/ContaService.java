package com.devlucasmart.desafiodiobanco.service;

import com.devlucasmart.desafiodiobanco.dto.ContaDto;
import com.devlucasmart.desafiodiobanco.mappers.ContaMapper;
import com.devlucasmart.desafiodiobanco.model.Conta;
import com.devlucasmart.desafiodiobanco.repository.ContaRepository;
import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ContaService {
    private final ContaRepository contaRepository;

    private ContaMapper contaMapper = Mappers.getMapper(ContaMapper.class);

    public List<ContaDto> buscarTodos() {
        List<Conta> contas = contaRepository.findAll();
        List<ContaDto> contaDtos = new ArrayList<>();

        contas.forEach(conta -> contaDtos.add(contaMapper.toDto(conta)));

        return contaDtos;
    }

    public ContaDto buscarPorId(Integer id) {
        Optional<Conta> conta = contaRepository.findById(id);
        return contaMapper.toDto(conta.get());
    }

    public ContaDto inserir(ContaDto contaDto) {
        Conta conta = contaMapper.toDomain(contaDto);
        conta = contaRepository.save(conta);
        return contaMapper.toDto(conta);
    }

    public ContaDto atualizar(Integer id, ContaDto contaDto) {
        contaDto.setId(id);
        Conta conta = contaMapper.toDomain(contaDto);
        conta = contaRepository.save(conta);
        return contaMapper.toDto(conta);
    }

    public void transferirSaldo(Integer contaOrigemId, Integer contaDestinoId, double saldo) {

        Conta contaOrigem = contaRepository.findById(contaOrigemId)
                .orElseThrow(() -> new RuntimeException("Conta de Origem não encontrada"));
        Conta contaDestino = contaRepository.findById(contaDestinoId)
                .orElseThrow(() -> new RuntimeException("Conta de Destino não Encontrada"));

        if (contaOrigem.getSaldo() < saldo) {
            throw new RuntimeException("Saldo Insuficiente na conta de Origem");
        }
        ContaDto contaOrigemDto = contaMapper.toDto(contaOrigem);
        contaOrigemDto.setSaldo(contaOrigemDto.getSaldo() - saldo);
        atualizar(contaOrigemId, contaOrigemDto);

        ContaDto contaDestinoDto = contaMapper.toDto(contaDestino);
        contaDestinoDto.setSaldo(contaDestinoDto.getSaldo() + saldo);
        atualizar(contaDestinoId, contaDestinoDto);

        extrato("Transferência Realizada. na conta: " + contaOrigemId + ",  tem o Saldo final de: " + saldo);
        extrato("Transferência Recebida. na conta: " + contaDestinoId + ",  tem o Saldo final de: " + saldo);
    }

    public void sacarSaldo(Integer contaId, double saldo) {

        Conta contaOrigem = contaRepository.findById(contaId)
                .orElseThrow(() -> new RuntimeException("Conta não encontrada"));

        if (contaOrigem.getSaldo() < saldo) {
            throw new RuntimeException("Saldo Insuficiente na conta");
        }
        ContaDto contaDto = contaMapper.toDto(contaOrigem);
        contaDto.setSaldo(contaDto.getSaldo() - saldo);
        atualizar(contaId, contaDto);

        extrato("Saque Realizado na Conta: " + contaId + ", Saldo: " + saldo);

    }
    public void depositarSaldo(Integer contaId, double saldo) {

        Conta contaOrigem = contaRepository.findById(contaId)
                .orElseThrow(() -> new RuntimeException("Conta não encontrada"));

        ContaDto contaDto = contaMapper.toDto(contaOrigem);
        contaDto.setSaldo(contaDto.getSaldo() + saldo);
        atualizar(contaId, contaDto);

        extrato("Deposito Realizado na Conta: " + contaId + ", Saldo: " + saldo);

    }

    public void extrato(String extrato) {
        System.out.println(extrato);
    }

    public void deletar(Integer id) {
        contaRepository.deleteById(id);
    }
}
