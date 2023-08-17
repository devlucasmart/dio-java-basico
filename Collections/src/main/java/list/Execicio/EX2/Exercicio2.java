package list.Execicio.EX2;

import java.util.ArrayList;
import java.util.List;

public class Exercicio2 {
    public static void main(String[] args){

        List<String> perguntas = new ArrayList<>();
        perguntas.add("Telefonou para a vítima?");
        perguntas.add("Esteve no local do crime?");
        perguntas.add("Mora perto da vítima?");
        perguntas.add("Devia para a vítima?");
        perguntas.add("Já trabalhou com a vítima?");

        List<Boolean> resposta = new ArrayList<>();
        resposta.add(false);
        resposta.add(false);
        resposta.add(false);
        resposta.add(false);
        resposta.add(false);
        resposta.add(false);

        int verdadeiros = 0;
        int falsos = 0;

        for (Boolean resp : resposta) {
            if (resp) {
                verdadeiros++;
            } else {
                falsos++;
            }
        }

        System.out.println("Perguntas e Respostas:");
        for (int i = 0; i < perguntas.size(); i++) {
            System.out.println(perguntas.get(i) + ": " + resposta.get(i));
        }

        System.out.println("\nClassificação:");

        if (verdadeiros == 3 || verdadeiros == 4) {
            System.out.println("Cúmplice");
        } else if (verdadeiros == 2) {
            System.out.println("Suspeito");
        } else if (verdadeiros == 5) {
            System.out.println("Assassina");
        } else {
            System.out.println("Inocente");
        }
    }
}
