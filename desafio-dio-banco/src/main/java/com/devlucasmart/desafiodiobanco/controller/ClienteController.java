package com.devlucasmart.desafiodiobanco.controller;

import com.devlucasmart.desafiodiobanco.dto.BancoDto;
import com.devlucasmart.desafiodiobanco.dto.ClienteDto;
import com.devlucasmart.desafiodiobanco.service.BancoService;
import com.devlucasmart.desafiodiobanco.service.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("clientes")
public class ClienteController {
    private final ClienteService clienteService;
    @GetMapping
    public ResponseEntity<List<ClienteDto>> buscarTodos() {
        return ResponseEntity.ok().body(clienteService.buscarTodos());
    }
}
