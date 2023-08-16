package list.Execicio.Ex1;

import java.util.ArrayList;
import java.util.List;

public class Execicio1 {
    public static void main(String[] args) {

        List<Double> temp = new ArrayList<>();
        temp.add(25.0);
        temp.add(30.0);
        temp.add(40.0);
        temp.add(28.8);
        temp.add(20.5);
        temp.add(21.4);

        List<String> meses = new ArrayList<>();
        meses.add("Janeiro");
        meses.add("Fevereiro");
        meses.add("Março");
        meses.add("Abril");
        meses.add("Maio");
        meses.add("Junho");

        System.out.println("Temperaturas:");

        for (int i = 0; i < temp.size(); i++) {
            System.out.println(meses.get(i) + ": " + temp.get(i) + " Celsius");
        }

        Double soma = 0d;
        for(Double value : temp){
            soma += value;
        }

        double media = soma / temp.size();
        System.out.println("Média de Temperatura: " + media);
    }
}
