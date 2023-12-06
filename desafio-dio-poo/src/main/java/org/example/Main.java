package org.example;

import org.example.desafio.dominio.Curso;
import org.example.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        var curso1 = new Curso();
        var mentoria = new Mentoria();

        curso1.setTituto("Dominando Java");
        curso1.setDescricao("POO");
        curso1.setCargaHoraria(900);

        System.out.println(curso1);
    }
}