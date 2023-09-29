package set.DesafioArcoIris;

import java.util.Objects;

public class ArcoIris implements Comparable<ArcoIris>{
    private String cor;

    public ArcoIris(){};
    public ArcoIris(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ArcoIris)) return false;
        ArcoIris arcoIris = (ArcoIris) o;
        return getCor().equals(arcoIris.getCor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCor());
    }

    @Override
    public String toString() {
        return "{" +
                "cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(ArcoIris arcoIris) {
        var cor = arcoIris.getCor().compareTo(arcoIris.getCor());
        if (arcoIris.getCor() != null) return cor;

        return cor;
    }
}

