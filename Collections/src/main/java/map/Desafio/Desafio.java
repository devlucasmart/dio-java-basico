package map.Desafio;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Desafio {
    public static void main(String[] args) {
            // Inicializa um objeto Random para gerar números aleatórios
            Random random = new Random();

            // Define o número de lançamentos
            int numLancamentos = 100;

            // Mapa para armazenar os resultados dos lançamentos
            Map<Integer, Long> resultados = new HashMap<>();

            // Simula o lançamento do dado 100 vezes
            for (int i = 0; i < numLancamentos; i++) {
                // Gera um número aleatório de 1 a 6 (simulando as faces do dado)
                int resultadoLancamento = random.nextInt(6) + 1;

                // Atualiza a contagem no mapa usando a expressão lambda
                resultados.merge(resultadoLancamento, 1L, Long::sum);
            }

            // Exibe os resultados
            System.out.println("Resultados dos lançamentos:");

            resultados.forEach((face, contagem) ->
                    System.out.println("Face " + face + ": " + contagem + " vezes")
            );
        }
}
