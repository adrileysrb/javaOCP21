package functional_interfaces;

import java.time.LocalDate;
import java.util.ArrayList;

public class MainBackup {
    public static void main(String args[]) {
        new Main().mainNonStatic();
    }

    public void mainNonStatic() {
        // Supplier é para gerar valor sem um input
        // Supplier == Fornecedor
        // Supplier<LocalDate> a = LocalDate::now;
        // Supplier<LocalDate> b = () -> LocalDate.now();

        // LocalDate c = a.get();
        // LocalDate d = b.get();

        // System.out.println(c);
        // System.out.println(d);

        // Supplier<ArrayList<String>> a1 = ArrayList::new;
        // Supplier<ArrayList<String>> b1 = () -> new ArrayList<>();

        // ArrayList<String> c1 = a1.get();
        // ArrayList<String> d1 = b1.get();

        // if (c1 instanceof ArrayList<String>) {
        //     System.out.println("c1 instanceof ArrayList<String>");
        // }

        // if (d1 instanceof ArrayList<String>) {
        //     System.out.println("d1 instanceof ArrayList<String>");
        // }

        // System.out.println(c1);
        // System.out.println(d1);

        // System.out.println(a1);
        // System.out.println(b1);

        // System.out.println("- - - - - - - - - - - - - - - - - - - - - - - -");

        // Consumer<String> a2 = System.out::println;
        // Consumer<String> b2 = (i) -> System.out.println(i); 

        // String ref = new String("Teste");
        // BiConsumer<String, String> a3 = ref::replaceAll;
        // BiConsumer<String, String> b3 = (i, j) -> ref.replaceAll(i, j);
        // BiConsumer<String, String> b3_2 = (String i, String j) -> ref.replaceAll(i, j);

        // System.out.println("- - - - - - - - - - - - - - - - - - - - - - - -");

        // Predicate<String> a4 = String::isEmpty;
        // Predicate<String> b4 = i -> i.isEmpty();

        // BiPredicate<String, String> a5 = String::startsWith;
        // BiPredicate<String, String> b5 = (i, j) -> i.startsWith(j);

        // Function<String, Integer> a6 = String::length;
        // Function<String, Integer> b6 = i -> i.length();

        // BiFunction<String, String, String> a7 = String::concat;
        // BiFunction<String, String, String> b7 = (i, j) -> i.concat(j);

        // UnaryOperator<String> a8 = String::toUpperCase;
        // UnaryOperator<String> b8 = i -> i.toUpperCase();

        // BinaryOperator<String, String> a9 = String::concat;
        // BinaryOperator<String, String> b9 = (i, j) -> i.concat(j);

    }
}
