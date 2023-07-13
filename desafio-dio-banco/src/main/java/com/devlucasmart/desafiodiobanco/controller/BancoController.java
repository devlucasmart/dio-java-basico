package com.devlucasmart.desafiodiobanco.controller;

import com.devlucasmart.desafiodiobanco.dto.BancoDto;
import com.devlucasmart.desafiodiobanco.service.BancoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("banco")
public class BancoController {
    private final BancoService bancoService;
    @GetMapping
    public ResponseEntity<List<BancoDto>> buscarTodos() {
        return ResponseEntity.ok().body(bancoService.buscarTodos());
    }

}
