package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemplosDeOrdenacao {

    public static void main(String[] args) {

        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Jon", 18, "preto"));
            add(new Gato("Maria", 20, "Branco"));
            add(new Gato("Stella", 5, "preto"));
            add(new Gato("Jon", 15, "tigrado"));
        }};

        System.out.println(meusGatos);

//        for(Gato gato : meusGatos) System.out.println(gato);
        System.out.println("---\tOrdem aleatória\t---");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("---\tOrdem Natural (Nome)\t---");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("---\tOrdem Idade\t---");
        Collections.sort(meusGatos, new ComparatorIdade());
//        meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);

        System.out.println("---\tOrdem cor\t---");
        Collections.sort(meusGatos, new ComparatorCor());
        System.out.println(meusGatos);

        System.out.println("---\tOrdem nome\t---");
        Collections.sort(meusGatos, new ComparatorNome());
        System.out.println(meusGatos);

        System.out.println("---\tOrdem Nome/Cor/Idade\t---");
        Collections.sort(meusGatos, new ComparatorNomeCorIdade());
        System.out.println(meusGatos);

    }
}
