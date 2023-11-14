package map.ExercicioProposto;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Excercicio {

   public static void main(String[] args) {
       System.out.println("---\tOrdem aleatoria\t---");
       var estados = new HashMap<String, Double>(){{
           put("Estado = PE ", 9.616621);
           put("Estado = AL ", 3.351543);
           put("Estado = CE ", 9.187103);
           put("Estado = RN ", 3.534265);
       }};

       for(Map.Entry<String, Double> estado : estados.entrySet())
           System.out.println(estado.getKey() + " - " + estado.getValue());

       System.out.println("---\tSubstitua a população do estado do RN por 3.534.165;\t---");
       estados.put("Estado = RN ", 3.534165);
       for(Map.Entry<String, Double> estado : estados.entrySet())
           System.out.println(estado.getKey() + " - " + estado.getValue());

       System.out.println("---\tConfira se o estado PB está no dicionário, caso não adicione: PB - 4.039.277;\t---");
       if(!estados.containsKey("Estado = PB ")) {
           estados.put("Estado = PB ", 4.039277);
       }
       for(Map.Entry<String, Double> estado : estados.entrySet())
           System.out.println(estado.getKey() + " - " + estado.getValue());

       System.out.println("---\tExiba a população PE\t---");
       var estado1 = estados.entrySet()
               .stream()
               .filter(entry -> entry.getKey().equals("Estado = PE "))
               .map(Map.Entry::getValue)
               .findFirst();
       estado1.ifPresent(populacao -> System.out.println(populacao));
       System.out.println("---\tExiba todos os estados e suas populações na ordem que foi informado\t---");
       var estados2 = new LinkedHashMap<String, Double>(){{
           put("Estado = PE ", 9.616621);
           put("Estado = AL ", 3.351543);
           put("Estado = CE ", 9.187103);
           put("Estado = RN ", 3.534265);
       }};

       for(Map.Entry<String, Double> estado : estados2.entrySet())
           System.out.println(estado.getKey() + " - " + estado.getValue());

       System.out.println("---\tExiba os estados e suas populações em ordem alfabética\t---");
       var estados3 = new TreeMap<String, Double>(estados2);
       for(Map.Entry<String, Double> estado : estados3.entrySet())
           System.out.println(estado.getKey() + " - " + estado.getValue());

       System.out.println("---\tExiba o estado com o menor população e sua quantidade\t---");
       var menorPopulacao = estados.entrySet()
               .stream()
               .filter(entry -> entry.getValue().equals(Collections.min(estados.values())))
               .map(entry -> "Estado com menor População: " + entry.getKey() + " - População: " + entry.getValue())
               .findFirst()
               .orElse("");
       System.out.println(menorPopulacao);

       System.out.println("---\tExiba o estado com o maior população e sua quantidade\t---");
       var maiorPopulacao = estados.entrySet()
               .stream()
               .filter(entry -> entry.getValue().equals(Collections.max(estados.values())))
               .map(entry -> "Estado com maior População: " + entry.getKey() + " - População: " + entry.getValue())
               .findFirst()
               .orElse("");
       System.out.println(maiorPopulacao);
       System.out.println("---\tExiba a soma da população desses estados;\t---");
       var iterator = estados.values().iterator();
       var soma  = 0d;
       while(iterator.hasNext()){
           soma += iterator.next();
       }
       System.out.println("Exiba a soma da População dos Estados: " + soma);
       System.out.println("Exiba a media das Populações: " + (soma/estados.size()));
       System.out.println("---\tRemova os estados com a população menor que 4.000.000\t---");
       estados.entrySet()
               .stream()
               .filter(entry -> entry.getValue() > 4.000000)
               .forEach(entry -> System.out.println("Estado: " + entry.getKey() + " - População: " + entry.getValue()));

       System.out.println("Apague o dicionário de estados: ");
       estados.clear();
       System.out.println(estados);
       System.out.println("Confira se o dicionário está vazio. ");
       if (estados.isEmpty()) System.out.println("O Dicionario Estar Vazio");



   }
}
