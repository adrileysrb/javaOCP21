package questions_expert;

import java.util.*;
import java.util.stream.Collectors;

public class Ex02 {
    /**
     * 2. Redução com Agrupamento Parcial e Conversão
     * Objetivo: Dado um List<String> de valores numéricos misturados com texto,
     * filtre apenas os que podem ser convertidos para Double, agrupe por parte
     * inteira e calcule a média dos valores em cada grupo.
     * 
     * {
     * 10 -> média de [10.5, 10.9, 10.0],
     * 11 -> média de [11.0],
     * 12 -> média de [12.1, 12.3]
     * }
     * 
     */
    public static void main(String... args) {
        List<String> dados = List.of("10.5", "12.1", "banana", "10.9", "11.0", "maçã", "12.3", "10.0");

        Map<Integer, List<Double>> result = dados.stream()
                .filter(Ex02::isPaseableStringToDouble)
                .map(Double::parseDouble)
                .collect(Collectors.groupingBy(Double::intValue,
                        Collectors.toList()));

        result.entrySet().forEach(System.out::println);
    }

    private static boolean isPaseableStringToDouble(String value) {
        try {
            Double.parseDouble(value);
            return true;
        } catch (NumberFormatException e) {
            System.err.println("Error! Value is unceptable: " + value);
            return false;
        }
    }

}
