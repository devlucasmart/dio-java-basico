package com.devlucasmart.desafiodiobanco.service;

import com.devlucasmart.desafiodiobanco.dto.BancoDto;
import com.devlucasmart.desafiodiobanco.dto.ContaDto;
import com.devlucasmart.desafiodiobanco.mappers.BancoMapper;
import com.devlucasmart.desafiodiobanco.mappers.ContaMapper;
import com.devlucasmart.desafiodiobanco.model.Banco;
import com.devlucasmart.desafiodiobanco.model.Conta;
import com.devlucasmart.desafiodiobanco.repository.BancoRepository;
import com.devlucasmart.desafiodiobanco.repository.ContaRepository;
import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BancoService {
    private final BancoRepository bancoRepository;

    private BancoMapper bancoMapper = Mappers.getMapper(BancoMapper.class);
    private ContaMapper contaMapper = Mappers.getMapper(ContaMapper.class);

    public List<BancoDto> buscarTodos() {
    List<Banco> bancos = bancoRepository.findAll();

        return bancos.stream()
                .map(banco -> {
                    List<ContaDto> contaDtos = banco
                            .getContas()
                            .stream()
                            .map(conta -> contaMapper.toDtoIgnoreCliente(conta))
                            .collect(Collectors.toList());

                    BancoDto bancoDto = bancoMapper.toDtoIgnoreConta(banco);
                    bancoDto.setContas(contaDtos);

                    return bancoDto;
                })
                .collect(Collectors.toList());
    }

    public BancoDto buscarPorId(Integer id) {
        Optional<Banco> banco = bancoRepository.findById(id);
        return bancoMapper.toDto(banco.get());
    }
    public BancoDto inserir(BancoDto bancoDto) {
        Banco banco = bancoMapper.toDomain(bancoDto);
        banco = bancoRepository.save(banco);
        return bancoMapper.toDto(banco);
    }

    public BancoDto atualizar(Integer id, BancoDto bancoDto) {
        bancoDto.setId(id);
        Banco banco = bancoMapper.toDomain(bancoDto);
        banco = bancoRepository.save(banco);
        return bancoMapper.toDto(banco);
    }

    public void deletar(Integer id) {
        bancoRepository.deleteById(id);
    }
}
