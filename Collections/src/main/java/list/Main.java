package list;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Crie uma lista e adicione as sete notas");

        List<Double> notas = new ArrayList<>();
        notas.add(7.0);
        notas.add(8.0);
        notas.add(9.0);
        notas.add(8.8);
        notas.add(9.5);
        notas.add(8.4);
        notas.add(3.6);

        System.out.println(notas);

        System.out.println("Exiba a Posição da nota 9: " + notas.indexOf(9.0));

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8.4);
        System.out.println(notas);

        System.out.println("Substitua a nota 9.0 pela nota 6.0");
        notas.set(notas.indexOf(9.0), 6.0);
        System.out.println(notas);

//        for (Double nota : notas) {
//            System.out.println(nota);
//        }
    }
}
