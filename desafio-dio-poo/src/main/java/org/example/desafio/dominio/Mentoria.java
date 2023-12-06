package org.example.desafio.dominio;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Mentoria extends Conteudo {
    private LocalDate data;

    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    String formattedDate = (getData() != null) ? dateFormat.format(getData()) : "null";

    @Override
    public String toString() {
        return String.format("\nMentoria {titulo='%s', descricao='%s', data=%s}",
                getTituto(), getDescricao(), formattedDate);
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }
}
