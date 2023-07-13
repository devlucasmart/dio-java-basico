package com.devlucasmart.desafiodiobanco.controller;

import com.devlucasmart.desafiodiobanco.dto.BancoDto;
import com.devlucasmart.desafiodiobanco.service.BancoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
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

    @PostMapping
    public ResponseEntity<?> inserir(@RequestBody BancoDto bancoDto) {
        bancoDto = bancoService.inserir(bancoDto);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(bancoDto.getId()).toUri();
        HttpHeaders header = new HttpHeaders();
        header.add("id", bancoDto.getId().toString());

        return ResponseEntity.created(uri).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> atualizar(@PathVariable Integer id, @RequestBody BancoDto bancoDto) {
        bancoService.atualizar(id, bancoDto);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletar(@PathVariable Integer id) {
        bancoService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
