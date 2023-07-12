package com.devlucasmart.desafiodiobanco.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("conta")
public class ContaController {

    @GetMapping
    public String imprimir(){
        String hello = "Hello";
        return hello;
    }
}
