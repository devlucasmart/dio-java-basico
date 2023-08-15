package list;

import java.util.ArrayList;
import java.util.List;

import dio.innovation.Carro;

public class Main {
    public static void main(String[] args){

        List<Carro> listCarro = new ArrayList<>();

        listCarro.add(new Carro("Ford"));
        listCarro.add(new Carro("Chevrolet"));
        listCarro.add(new Carro("Wolks"));

        System.out.println(listCarro.contains(new Carro("Ford")));
        System.out.println(listCarro.get(0));

        System.out.println(listCarro.indexOf(new Carro("Wolks")));
        System.out.println(listCarro);

        System.out.println(listCarro.remove(2));
        System.out.println(listCarro);
    }
}
