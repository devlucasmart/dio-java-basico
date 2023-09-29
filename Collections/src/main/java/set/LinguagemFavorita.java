package set;

import java.util.Objects;

public class LinguagemFavorita implements Comparable<LinguagemFavorita>{

    private String nome;
    private int anoDeCriacao;
    private String ide;

    public LinguagemFavorita() {
    }
    public LinguagemFavorita(String nome, int anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public void setAnoDeCriacao(int anoDeCriacao) {
        this.anoDeCriacao = anoDeCriacao;
    }

    public String getIde() {
        return ide;
    }

    public void setIde(String ide) {
        this.ide = ide;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LinguagemFavorita)) return false;
        LinguagemFavorita that = (LinguagemFavorita) o;
        return getAnoDeCriacao() == that.getAnoDeCriacao() && getNome().equals(that.getNome()) && getIde().equals(that.getIde());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getAnoDeCriacao(), getIde());
    }

    @Override
    public String toString() {
        return "LinguagemFavorita{" +
                "nome='" + nome + '\'' +
                ", anoDeCriacao=" + anoDeCriacao +
                ", ide='" + ide + '\'' +
                '}';
    }

    @Override
    public int compareTo(LinguagemFavorita linguagemFavorita) {
        int anoDeCriacao = Integer.compare(this.getAnoDeCriacao(), linguagemFavorita.getAnoDeCriacao());
        if (anoDeCriacao != 0) return anoDeCriacao;
        return this.getNome().compareTo(linguagemFavorita.getNome());
    }
}
