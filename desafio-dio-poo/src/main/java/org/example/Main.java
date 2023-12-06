package org.example;

import org.example.desafio.dominio.Bootcamp;
import org.example.desafio.dominio.Curso;
import org.example.desafio.dominio.Dev;
import org.example.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        var curso1 = new Curso();
        var curso2 = new Curso();
        var mentoria = new Mentoria();

        curso1.setTituto("Dominando Java");
        curso1.setDescricao("POO");
        curso1.setCargaHoraria(900);

        curso2.setTituto("Collections ED");
        curso2.setDescricao("POO");
        curso2.setCargaHoraria(900);

        mentoria.setTituto("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        var bootcamp = new Bootcamp();
        bootcamp.setNome("BootCamp Java Developer");
        bootcamp.setDescricao("Descrição BootCamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        var devLucas = new Dev();
        devLucas.setNome("Lucas");
        devLucas.inscreverBootcamp(bootcamp);
        devLucas.progredir();
        devLucas.progredir();
        devLucas.progredir();
        System.out.println("Conteúdos Inscritos Lucas: " + devLucas.getConteudosInscritos());
        System.out.println("---");
        System.out.println("Conteúdos Concluidos Lucas: " + devLucas.getConteudosConcluidos());
        System.out.println("XP: " + devLucas.calcularTotalXp());

        System.out.println("=====================");
        var devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        devJoao.progredir();
        System.out.println("Conteúdos Inscritos João: " + devJoao.getConteudosInscritos());
        System.out.println("---");
        System.out.println("Conteúdos Concluidos João: " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());
    }
}