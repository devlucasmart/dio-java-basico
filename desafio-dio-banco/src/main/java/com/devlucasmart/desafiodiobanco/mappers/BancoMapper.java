package com.devlucasmart.desafiodiobanco.mappers;

import com.devlucasmart.desafiodiobanco.dto.BancoDto;
import com.devlucasmart.desafiodiobanco.model.Banco;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface BancoMapper {

    BancoDto toDto(Banco banco);
    Banco toDomain(BancoDto bancoDto);
    @Mapping(target = "contas", ignore = true)
    BancoDto toDtoIgnoreConta(Banco banco);
}
