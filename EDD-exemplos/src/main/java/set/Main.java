package set;

import dio.innovation.Carro;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args){

        Set<Carro> hashSetCarros = new HashSet<>();

        hashSetCarros.add(new Carro("Alamo"));
        hashSetCarros.add(new Carro("Ford"));
        hashSetCarros.add(new Carro("Hyundai"));
        hashSetCarros.add(new Carro("Honda"));
        hashSetCarros.add(new Carro("Wolks"));
        hashSetCarros.add(new Carro("Pegeout"));

        System.out.println(hashSetCarros);

        Set<Carro> treeSetCarros = new TreeSet<>();

        hashSetCarros.add(new Carro("Alamo"));
        treeSetCarros.add(new Carro("Ford"));
        treeSetCarros.add(new Carro("Hyundai"));
        treeSetCarros.add(new Carro("Honda"));
        treeSetCarros.add(new Carro("Wolks"));
        treeSetCarros.add(new Carro("Pegeout"));

        System.out.println(treeSetCarros);


    }
}
