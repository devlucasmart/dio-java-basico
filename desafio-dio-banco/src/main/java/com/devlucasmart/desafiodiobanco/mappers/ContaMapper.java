package com.devlucasmart.desafiodiobanco.mappers;

import com.devlucasmart.desafiodiobanco.dto.ContaDto;
import com.devlucasmart.desafiodiobanco.model.Conta;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface ContaMapper {
    ContaDto toDto(Conta conta);
    Conta toDomain(ContaDto contaDto);

    @Mapping(target = "cliente", ignore = true)
    ContaDto toDtoIgnoreCliente(Conta conta);
}
