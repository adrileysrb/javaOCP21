package questions_expert;

import java.util.*;
import java.util.stream.*;

public class Ex03 {
    /*
     * 3. Agrupamento Composto com Duplo groupingBy
     * Objetivo: A partir de uma lista de Pessoa(nome, idade, cidade), agrupe por
     * cidade e, dentro de cada cidade, por faixa etária: "JOVEM" (< 30), "ADULTO"
     * (30-59), "IDOSO" (60+).
     * 
     * Cidade: São Paulo
     * Faixa: JOVEM
     * Pessoa[nome=Ana, idade=25, cidade=São Paulo]
     * Faixa: ADULTO
     * Pessoa[nome=Bruno, idade=35, cidade=São Paulo]
     * Faixa: IDOSO
     * Pessoa[nome=Carlos, idade=65, cidade=São Paulo]
     * Cidade: Rio de Janeiro
     * Faixa: JOVEM
     * Pessoa[nome=Diana, idade=28, cidade=Rio de Janeiro]
     * Faixa: ADULTO
     * Pessoa[nome=Eduardo, idade=45, cidade=Rio de Janeiro]
     * Faixa: IDOSO
     * Pessoa[nome=Fátima, idade=62, cidade=Rio de Janeiro]
     * Cidade: Belo Horizonte
     * Faixa: JOVEM
     * Pessoa[nome=Gabriel, idade=18, cidade=Belo Horizonte]
     * Faixa: ADULTO
     * Pessoa[nome=Helena, idade=32, cidade=Belo Horizonte]
     * Faixa: IDOSO
     * Pessoa[nome=Igor, idade=70, cidade=Belo Horizonte]
     * 
     */
    public static void main(String[] args) {
        record Pessoa(String nome, int idade, String cidade) {
        }
        List<Pessoa> pessoas = List.of(
                new Pessoa("Ana", 25, "São Paulo"),
                new Pessoa("Bruno", 35, "São Paulo"),
                new Pessoa("Carlos", 65, "São Paulo"),
                new Pessoa("Diana", 28, "Rio de Janeiro"),
                new Pessoa("Eduardo", 45, "Rio de Janeiro"),
                new Pessoa("Fátima", 62, "Rio de Janeiro"),
                new Pessoa("Gabriel", 18, "Belo Horizonte"),
                new Pessoa("Helena", 32, "Belo Horizonte"),
                new Pessoa("Igor", 70, "Belo Horizonte"));

        Map<String, Map<String, List<Pessoa>>> result = pessoas.stream()
                .collect(Collectors.groupingBy(Pessoa::cidade,
                        Collectors.groupingBy(
                                value -> value.idade < 60 ? value.idade < 30 ? "Jovem" : "Adulto" : "Idoso",
                                Collectors.toList())));

        result.entrySet().stream().forEach(System.out::println);
    }

}
