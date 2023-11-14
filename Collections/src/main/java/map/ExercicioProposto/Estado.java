package map.ExercicioProposto;

import java.util.Objects;

public class Estado {
    private Double populacao;

    public Estado(Double populacao) {
        this.populacao = populacao;
    }

    public Estado() {}

    public Double getPopulacao() {
        return populacao;
    }

    public void setPopulacao(Double populacao) {
        this.populacao = populacao;
    }

    @Override
    public String toString() {
        return "Populacao = " + populacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Estado)) return false;
        Estado estado = (Estado) o;
        return Double.compare(estado.getPopulacao(), getPopulacao()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPopulacao());
    }
}
