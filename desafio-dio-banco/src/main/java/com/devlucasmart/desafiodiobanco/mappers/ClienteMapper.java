package com.devlucasmart.desafiodiobanco.mappers;

import com.devlucasmart.desafiodiobanco.dto.ClienteDto;
import com.devlucasmart.desafiodiobanco.model.Cliente;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface ClienteMapper {
    ClienteDto toDto(Cliente cliente);
    Cliente toDomain(ClienteDto clienteDto);

    @Mapping(target = "conta", ignore = true)
    ClienteDto toDtoIgnoreConta(Cliente cliente);
}
