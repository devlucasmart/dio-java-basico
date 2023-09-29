package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class DesafioLinguagem {

    public static void main(String[] args) {
        var linguagem = new HashSet<LinguagemFavorita>() {{
            add(new LinguagemFavorita("Java", 2000, "Intellj"));
            add(new LinguagemFavorita("Java Script", 1996, "Visual Studio Code"));
            add(new LinguagemFavorita("Type Script", 1990, "VS Code"));
            add(new LinguagemFavorita("Java", 2001, "Eclipse"));
        }};
        System.out.println("--\tOrdem Inserção\t--");
        var linguagem2= new LinkedHashSet<>(){{
            add(new LinguagemFavorita("Java", 2000, "Intellj"));
            add(new LinguagemFavorita("Java Script", 2000, "Visual Studio Code"));
            add(new LinguagemFavorita("Type Script", 2000, "VS Code"));
        }};
        linguagem2.forEach(linguagemFavorita -> System.out.println(linguagemFavorita));

        System.out.println("--\tOrdem Natural\t--");
        var linguagem3 = new TreeSet<>(linguagem2);
        linguagem3.forEach(linguagemFavorita -> System.out.println(linguagemFavorita));

//
        System.out.println("--\tOrdem pela IDE\t--");
        var linguagem4 = new TreeSet<>(new ComparatorIde());
        linguagem4.addAll(linguagem);
        linguagem4.forEach(linguagemFavorita -> System.out.println(linguagemFavorita));
//
        System.out.println("--\tOrdem Ano de Criação e Nome\t--");
        var linguagem5 = new TreeSet<>(new ComparatorAnoCriacaoNome());
        linguagem5.addAll(linguagem);
        linguagem5.forEach(linguagemFavorita -> System.out.println(linguagemFavorita));
//
        System.out.println("--\tOrdem Nome, Ano de Criação, IDE\t--");
        var linguagem6 = new TreeSet<>(new ComparatorAnoCriacaoNomeIde());
        linguagem6.addAll(linguagem);
        linguagem6.forEach(linguagemFavorita -> System.out.println(linguagemFavorita));
    }
}
