package com.devlucasmart.desafiodiobanco.controller;

import com.devlucasmart.desafiodiobanco.dto.ClienteDto;
import com.devlucasmart.desafiodiobanco.dto.ContaDto;
import com.devlucasmart.desafiodiobanco.service.ClienteService;
import com.devlucasmart.desafiodiobanco.service.ContaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("contas")
public class ContaController {

    private final ContaService contaService;
    @GetMapping
    public ResponseEntity<List<ContaDto>> buscarTodos() {
        return ResponseEntity.ok().body(contaService.buscarTodos());
    }
}
