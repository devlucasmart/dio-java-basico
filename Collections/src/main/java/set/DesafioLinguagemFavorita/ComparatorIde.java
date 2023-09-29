package set.DesafioLinguagemFavorita;

import java.util.Comparator;

public class ComparatorIde implements Comparator<LinguagemFavorita> {
    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        var nome = l1.getIde().compareTo(l2.getIde());
        if (nome != 0) return nome;
        return 0;
    }
}
