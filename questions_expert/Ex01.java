package questions_expert;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Ex01 {
    /**
     * 1. Inversão de Mapa com Agrupamento por Chave Calculada
     * Objetivo: Dado um Map<String, List<Integer>>, inverta para Map<Integer,
     * List<String>>, onde cada número da lista vira chave, e o valor é a lista de
     * todas as chaves (originais do mapa) em que ele apareceu.
     * 
     * {
     * 1 -> ["A"],
     * 2 -> ["A", "B"],
     * 3 -> ["B", "C"],
     * 4 -> ["C"]
     * }
     * 
     */
    public static void main(String... args) {
        Map<String, List<Integer>> input = Map.of(
                "A", List.of(1, 2),
                "B", List.of(2, 3),
                "C", List.of(3, 4));

        input.entrySet().stream()
                .flatMap(entry -> entry.getValue().stream()
                        .map(value -> Map.entry(value, entry.getKey())))
                .peek(System.out::println)
                .collect(Collectors.groupingBy(Map.Entry::getKey,
                        Collectors.mapping(Map.Entry::getValue, Collectors.toList())))
                .entrySet().stream()
                .forEach(System.out::println);
    }

}
