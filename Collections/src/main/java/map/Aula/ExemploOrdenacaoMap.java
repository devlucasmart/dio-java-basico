package map.Aula;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class ExemploOrdenacaoMap {
    public static void main(String[] args) {
        System.out.println("---\tOrdem aleatoria\t---");
        var meusLivros = new HashMap<String, Livro>(){{
            put("Hawking, Stephen", new Livro( "Uma breve historia do Tempo", 230));
            put("Duhigg, Charles", new Livro( "O Poder do Hábito", 448));
            put("Harari, Yuval Noah", new Livro( "21 Lições Para o Século 21", 432));
        }};

        for(Map.Entry<String, Livro> livro : meusLivros.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue());

        System.out.println("---\tOrdem Inserção\t---");
        var meusLivros1 = new LinkedHashMap<String, Livro>(){{
            put("Hawking, Stephen", new Livro( "Uma breve historia do Tempo", 230));
            put("Duhigg, Charles", new Livro( "O Poder do Hábito", 448));
            put("Harari, Yuval Noah", new Livro( "21 Lições Para o Século 21", 432));
        }};

        for(Map.Entry<String, Livro> livro : meusLivros1.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue());

        System.out.println("---\tOrdem alfabética autores\t---");
        var meusLivros2 = new TreeMap<String, Livro>(meusLivros1);
        for(Map.Entry<String, Livro> livro : meusLivros2.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue());

        System.out.println("---\tOrdem alfabética nomes dos Livros\t---");
        var meusLivros3 = new TreeSet<>( new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());
        for(Map.Entry<String, Livro> livro : meusLivros3)
            System.out.println(livro.getKey() + " - " + livro.getValue());
    }
}
