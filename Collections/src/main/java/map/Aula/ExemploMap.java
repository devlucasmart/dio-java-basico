package map.Aula;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ExemploMap {

    public static void main(String[] args) {
        System.out.println("Crie um Dicionario que relacione os modelos e seus respectivos consumos");
        var carrosPopulares = new HashMap<String, Double>() {{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.4);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};

        System.out.println(carrosPopulares);

        System.out.println("Substitua o consumo do gol por 15,2 km/l: ");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);

        System.out.println("Confira se o modelo tucson está no dicionário: " + carrosPopulares.containsKey("tucson"));

        System.out.println("Exiba o Consumo do Uno: ");
        System.out.println(carrosPopulares.get("uno"));

//        System.out.println("Exiba o Terceiro modelo adicionado: ");

        System.out.println("Exiba os Modelos: ");
        var modelos = carrosPopulares.keySet();

        System.out.println(modelos);

        System.out.println("Exiba os consumos dos carros: ");
        var consumo = carrosPopulares.values();
        System.out.println(consumo);

        System.out.println("Exiba o modelo mais econômico e seu consumo: ");
        var consumoMaisEficiente = Collections.max(carrosPopulares.values());
        var modeloMaisEficiente = carrosPopulares.entrySet()
                .stream()
                .filter(entry -> entry.getValue().equals(consumoMaisEficiente))
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse("");
        System.out.println("Modelo mais Eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente);

        System.out.println("Exiba o modelo menos econômico e seu consumo: ");
        var consumoMenosEficiente = Collections.min(carrosPopulares.values());
        var modeloMenosEficiente = carrosPopulares.entrySet()
                .stream()
                .filter(entry -> entry.getValue().equals(consumoMenosEficiente))
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse("");
        System.out.println("Modelo menos Eficiente: " + modeloMenosEficiente + " - " + consumoMenosEficiente);

        System.out.println("Exiba a soma dos consumos: ");
        var iterator = carrosPopulares.values().iterator();
        var soma  = 0d;
        while(iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("Exiba a soma dos consumos: " + soma);
        System.out.println("Exiba a media dos consumos: " + (soma/carrosPopulares.size()));
        System.out.println(carrosPopulares);
        System.out.println("Remova os modelos com o consumo igual a 15,6 km/l: ");
        var iterator1 = carrosPopulares.values().iterator();
        while(iterator1.hasNext()){
            if (iterator1.next().equals(15.6)) iterator1.remove();
        }
        System.out.println(carrosPopulares);
        System.out.println("Exiba todos os carros na ordem em que foram informados: ");
        var carrosPopulares1 = new LinkedHashMap<String, Double>() {{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.4);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares1.toString());

        System.out.println("Exiba o dicionario ordenado pelo modelo: ");
        var carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2);

        System.out.println("Apague o dicionario de carros: ");
        carrosPopulares.clear();
        System.out.println(carrosPopulares);
    }
}
