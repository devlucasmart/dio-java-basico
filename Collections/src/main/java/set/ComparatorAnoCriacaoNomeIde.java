package set;

import java.util.Comparator;

public class ComparatorAnoCriacaoNomeIde implements Comparator<LinguagemFavorita> {
    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        var nome = l1.getNome().compareTo(l2.getNome());
        if (nome != 0) return nome;

        var ide = l1.getIde().compareTo(l2.getIde());
        if (ide != 0) return ide;

        return Integer.compare(l1.getAnoDeCriacao(), l2.getAnoDeCriacao());
    }
}
