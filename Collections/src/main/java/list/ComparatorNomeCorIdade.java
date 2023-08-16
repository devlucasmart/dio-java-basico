package list;

import java.util.Comparator;

public class ComparatorNomeCorIdade implements Comparator<Gato> {

    public ComparatorNomeCorIdade() {
    }

    @Override
    public int compare(Gato g1, Gato g2) {
        var nome = new ComparatorNome().compare(g1, g2);
        var cor = new ComparatorCor().compare(g1, g2);
        var idade = new ComparatorIdade().compare(g1, g2);

        if(nome != 0)
        { return nome;
        } else if (cor != 0) {
            return cor;
        } else if (idade != 0) {
            return idade;
        }

        return 0;
    }
}
