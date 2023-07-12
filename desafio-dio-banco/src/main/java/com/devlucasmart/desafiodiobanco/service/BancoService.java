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

@Service
@RequiredArgsConstructor
public class BancoService {
    private final BancoRepository bancoRepository;

    private BancoMapper bancoMapper = Mappers.getMapper(BancoMapper.class);
    private ContaMapper contaMapper = Mappers.getMapper(ContaMapper.class);

    public List<BancoDto> buscarTodos() {
    List<Banco> bancos = bancoRepository.findAll();
    List<BancoDto> bancoDtos = new ArrayList<BancoDto>();
        for (Banco banco : bancos) {
            List<Conta> contas = banco.getContas();
            List<ContaDto> contaDtos = new ArrayList<ContaDto>();
            for (Conta conta : contas) {
                contaDtos.add(contaMapper.toDtoIgnoreCliente(conta));
            }
            BancoDto bancoDto = bancoMapper.toDtoIgnoreConta(banco);
            bancoDto.setContas(contaDtos);
            bancoDtos.add(bancoDto);
        }
        return bancoDtos;
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
