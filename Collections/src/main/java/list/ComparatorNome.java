package list;

import java.util.Comparator;

public class ComparatorNome implements Comparator<Gato> {

    public ComparatorNome() {
    }

    @Override
    public int compare(Gato g1, Gato g2) {

        return g1.getNome().compareToIgnoreCase(g2.getNome());
    }
}
