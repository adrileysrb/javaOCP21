package functional_interfaces;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;

import java.util.List;

public class Main {

    static class A extends Object {
        public static String isMar1(){
            System.out.println("isMar1 - class A");
            return "ismael";
        }

    }

    static class B extends A {
        public static String isMar1(){
            System.out.println("isMar1 - class B");
            return "small";
        }
    }

    static class C extends B {}

    public static void main(String args[]) {
        new Main().mainNonStatic();
    }

    public void mainNonStatic() {
        test1();
    }

    public void test1() {
        List<? super A> a = new ArrayList<>();

        a.add(new A());
        a.add(new B());
        a.add(new C());

        Object b = a.get(0);
        Object c = a.get(1);
        
        System.out.println(b.getClass());
        System.out.println(c.getClass());

        List<? extends A> a2 = new ArrayList<>();


        /// Pergunta
        List<? extends Number> lista1 = new ArrayList<>();
        List<? super Number> lista2 = new ArrayList<Integer>();

        Map<Object, Object> map1 = new HashMap<Object, Object>();

    }
}
