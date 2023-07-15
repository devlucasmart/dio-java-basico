package com.devlucasmart.desafiodiobanco.service;

import com.devlucasmart.desafiodiobanco.dto.ClienteDto;
import com.devlucasmart.desafiodiobanco.dto.ContaDto;
import com.devlucasmart.desafiodiobanco.mappers.ClienteMapper;
import com.devlucasmart.desafiodiobanco.model.Cliente;
import com.devlucasmart.desafiodiobanco.model.Conta;
import com.devlucasmart.desafiodiobanco.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ClienteService {
    private final ClienteRepository clienteRepository;

    private ClienteMapper clienteMapper = Mappers.getMapper(ClienteMapper.class);

    public List<ClienteDto> buscarTodos() {

        List<Cliente> clientes = clienteRepository.findAll();

        return clientes.stream()
                .map(cliente -> {
                    ClienteDto clienteDto = new ClienteDto();
                    clienteDto.setId(cliente.getId());

                    Conta conta = cliente.getConta();
                    if (conta != null) {
                        ContaDto contaDto = new ContaDto();
                        contaDto.setId(conta.getId());
                        clienteDto.setConta(conta);
                    }
                    return clienteDto;
                })
                .collect(Collectors.toList());
    }

    public ClienteDto buscarPorId(Integer id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return clienteMapper.toDto(cliente.get());
    }

    public ClienteDto inserir(ClienteDto clienteDto) {
        Cliente cliente = clienteMapper.toDomain(clienteDto);
        cliente = clienteRepository.save(cliente);
        return clienteMapper.toDto(cliente);
    }

    public ClienteDto atualizar(Integer id, ClienteDto clienteDto) {
        clienteDto.setId(id);
        Cliente cliente = clienteMapper.toDomain(clienteDto);
        cliente = clienteRepository.save(cliente);
        return clienteMapper.toDto(cliente);
    }

    public void deletar(Integer id) {
        clienteRepository.deleteById(id);
    }
}
