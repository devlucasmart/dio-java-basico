package set.DesafioArcoIris;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.function.Predicate;

public class DesafioArcoIris {

    public static void main(String[] args) {
        System.out.println("--\tExiba todas as cores uma abaixo da outra\t--");
        var coresArcoIris = new HashSet<ArcoIris>() {{
            add(new ArcoIris("Vermelho"));
            add(new ArcoIris("Laranja"));
            add(new ArcoIris("Amarelo"));
            add(new ArcoIris("Verde"));
            add(new ArcoIris("Azul"));
            add(new ArcoIris("Anil"));
            add(new ArcoIris("Violeta"));
        }};

        coresArcoIris.forEach(arcoIris -> System.out.println(arcoIris));

        System.out.println("--\tA Quantidade de Cores que o Arco Iris tem\t--");
        var contagem = coresArcoIris.size();
        System.out.println("Quantidade de cores: " + contagem);

        System.out.println("--\tExiba as cores em ordem Alfabética\t--");
        var arcoIris4 = new TreeSet<>(new ArcoIrisCor());
        arcoIris4.addAll(coresArcoIris);
        arcoIris4.forEach(arcoIris -> System.out.println(arcoIris.getCor()));
//        for (ArcoIris arcoIris : arcoIris4)
//            System.out.println(
//                    arcoIris.getCor()
//            );

        System.out.println("--\tExiba as cores na ordem inversa da que foi informada\t--");
        var arcoIris5 = new TreeSet<>(new ArcoIrisCor());
        arcoIris5.addAll(coresArcoIris);
        arcoIris5.descendingSet().forEach(arcoIris -> System.out.println(arcoIris.getCor()));

        System.out.println("--\tExiba todas as cores que começam com a letra V\t--");
        var arcoIris6 = new TreeSet<>(new ArcoIrisCor());
        arcoIris6.addAll(coresArcoIris);
        var verificaPrimeiraLetraV = (Predicate<ArcoIris>) arcoIris -> !arcoIris.getCor()
                .isEmpty()
                && arcoIris.getCor().charAt(0) == 'V';
        arcoIris6.stream()
                .filter(verificaPrimeiraLetraV)
                .forEach(arcoIris -> System.out.println(arcoIris.getCor()));


        System.out.println("--\tRemova todas as cores que não começam com a letra V\t--");
        var arcoIris7 = new TreeSet<>(new ArcoIrisCor());
        arcoIris7.addAll(coresArcoIris);
        var verificaPrimeiraLetraV1 = (Predicate<ArcoIris>) arcoIris -> !arcoIris.getCor()
                .isEmpty() && arcoIris.getCor().charAt(0) == 'V';
        arcoIris7.removeIf(verificaPrimeiraLetraV1);
        arcoIris7.forEach(arcoIris -> System.out.println(arcoIris.getCor()));

        System.out.println("--\tLimpem o Conjunto\t--");
        var arcoIris8 = new TreeSet<>(new ArcoIrisCor());
        arcoIris8.removeAll(coresArcoIris);
        arcoIris8.forEach(arcoIris -> System.out.println(arcoIris.getCor()));

        System.out.println("--\tConfira se o conjunto está vazio\t--");
        var arcoIris9 = new TreeSet<>(new ArcoIrisCor());
        arcoIris9.removeAll(coresArcoIris);
        if (arcoIris9.isEmpty()) {
            System.out.println("O conjunto estar vazio");
        } else {
            System.out.println("O conjunto tem elementos ainda");
        }
    }
}
