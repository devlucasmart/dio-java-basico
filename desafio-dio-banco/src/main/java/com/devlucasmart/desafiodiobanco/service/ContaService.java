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

    public void deletar(Integer id) {
        contaRepository.deleteById(id);
    }
}
