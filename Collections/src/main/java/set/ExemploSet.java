package set;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {
    public static void main(String[] args) {
        System.out.println("Crie um conjunto e adicione as notas: ");

        var notas = new HashSet<>(Arrays.asList(7d, 9.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas);

//        System.out.println("Exiba a posição da nota 5.0: ");
//        Quando estou trabalhando com a interface set não dá para procurar pela posição

//        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
//        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");

        if(notas.contains(5d) == true)
        System.out.println("Confira se a nota 5.0 está no conjunto: " + "A nota 5 estar presente na lista");

        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println("Exiba a menor nota: " + Collections.max(notas));

        var iterator = notas.iterator();
        var soma = 0.0;
        while (iterator.hasNext()) {
            var next = iterator.next();
            soma += next;
        }

        System.out.println("Exiba a soma das notas: " + soma);

        System.out.println("Exiba a media das notas: " + (soma/ notas.size()));

        System.out.println("Remova a nota: 0");
        notas.remove(0d);
        System.out.println("Remova a notas menores que 7: ");
        var iterator1 = notas.iterator();
        while(iterator1.hasNext()) {
            var next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);
        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);

        System.out.println("Exiba todas as notas na ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);
    }
}
