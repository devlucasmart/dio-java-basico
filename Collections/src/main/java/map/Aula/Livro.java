package map.Aula;

import java.util.Objects;

public class Livro {
    private String nomeLivro;
    private Integer quantidadePaginas;

    public Livro(String nomeLivro, Integer quantidadePaginas) {
        this.nomeLivro = nomeLivro;
        this.quantidadePaginas = quantidadePaginas;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public Integer getQuantidadePaginas() {
        return quantidadePaginas;
    }

    public void setQuantidadePaginas(Integer quantidadePaginas) {
        this.quantidadePaginas = quantidadePaginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Livro)) return false;
        Livro livro = (Livro) o;
        return getNomeLivro().equals(livro.getNomeLivro()) && getQuantidadePaginas().equals(livro.getQuantidadePaginas());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNomeLivro(), getQuantidadePaginas());
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nomeLivro='" + nomeLivro + '\'' +
                ", quantidadePaginas=" + quantidadePaginas +
                '}';
    }
}
