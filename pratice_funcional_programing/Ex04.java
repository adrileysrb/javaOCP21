package pratice_funcional_programing;

import java.util.List;
import java.util.*;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Ex04 {

    /*
     * Exercício 4: Map Complexo + Reduce
     * Objetivo: Dada uma lista de produtos com preços, aplique um desconto de 10%
     * apenas aos produtos com nome iniciando com a letra “T”, e use reduce para
     * somar o total com desconto.
     */
    public static void main(String... args) {
        record Produto(String nome, double preco) {
        }

        List<Produto> produtos = List.of(
                new Produto("Televisão", 2000),
                new Produto("Tablet", 1500),
                new Produto("Notebook", 3000),
                new Produto("Teclado", 200));
        double result = produtos.stream()
                .mapToDouble(a -> a.nome().startsWith("T") ? a.preco * 0.90 : a.preco).sum();
                
        System.out.println(result);
    }
}
