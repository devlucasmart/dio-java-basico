package set.AulaSetBasico;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ExemploOrdenacaoSet {
    public static void main(String[] args) {
        System.out.println("--\tOrdem aleatoria\t--");
        var minhaSeries = new HashSet<Serie>() {{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "fantasia", 60));
        }};
        for (Serie serie : minhaSeries)
            System.out.println(
                    serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio()
            );

        System.out.println("--\tOrdem Inserção\t--");
        var minhaSeries2 = new LinkedHashSet<Serie>() {{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "fantasia", 25));
        }};
        for (Serie serie : minhaSeries2)
            System.out.println(
                    serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio()
            );

        System.out.println("--\tOrdem Natural (TempoEpisodio)\t--");
        var minhaSeries3 = new TreeSet<>(minhaSeries2);
        for (Serie serie : minhaSeries3)
            System.out.println(
                    serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio()
            );

        System.out.println("--\tOrdem Nome/Gênero/TempoEpisodio\t--");
        var minhaSeries4 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        minhaSeries4.addAll(minhaSeries);
        for (Serie serie : minhaSeries4)
            System.out.println(
                    serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio()
            );
    }
}
