package com.devlucasmart.desafiodiobanco.controller;

import com.devlucasmart.desafiodiobanco.dto.ContaDto;
import com.devlucasmart.desafiodiobanco.service.ContaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
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

    @GetMapping("/{id}")
    public ResponseEntity<ContaDto> buscarPorId(@PathVariable Integer id) {
        return ResponseEntity.ok().body(contaService.buscarPorId(id));
    }

    @PostMapping("{contaId}/extrato")
    public ResponseEntity<String> extrato(@PathVariable Integer contaId, @RequestBody String extrato) {
        try {
            contaService.extrato(extrato);
            return ResponseEntity.ok("Extrato processed successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to process extrato");
        }
    }

    @PostMapping
    public ResponseEntity<?> inserir(@RequestBody ContaDto contaDto) {
        contaDto = contaService.inserir(contaDto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(contaDto.getId()).toUri();
        HttpHeaders header = new HttpHeaders();
        header.add("id", contaDto.getId().toString());

        return ResponseEntity.created(uri).build();
    }

    @PostMapping("/{contaOrigemId}/transferir/{contaDestinoId}")
    public ResponseEntity<String> transferirSaldo(
            @PathVariable Integer contaOrigemId,
            @PathVariable Integer contaDestinoId,
            @RequestParam double saldo) {
        try {
            contaService.transferirSaldo(contaOrigemId, contaDestinoId, saldo);
            return ResponseEntity.ok("Transfer successful");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Transfer failed: " + e.getMessage());
        }
    }

    @PostMapping("sacar/{contaId}")
    public ResponseEntity<String> sacarSaldo(
            @PathVariable Integer contaId,
            @RequestParam double saldo) {
        try {
            contaService.sacarSaldo(contaId, saldo);
            return ResponseEntity.ok("Saque Realizado com Sucesso!");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Saque falhou: " + e.getMessage());
        }
    }

    @PostMapping("depositar/{contaId}")
    public ResponseEntity<String> depositarSaldo(
            @PathVariable Integer contaId,
            @RequestParam double saldo) {
        try {
            contaService.depositarSaldo(contaId, saldo);
            return ResponseEntity.ok("Deposito Realizado com Sucesso!");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Deposito falhou: " + e.getMessage());
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> atualizar(@PathVariable Integer id, @RequestBody ContaDto contaDto) {
        contaService.atualizar(id, contaDto);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletar(@PathVariable Integer id) {
        contaService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
