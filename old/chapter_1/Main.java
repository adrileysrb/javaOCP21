public class Main {
    static class Lipe implements A {
        public void program() {
            System.out.println("Lipe esta programando");
        }

        public void academia() {
            System.out.println("Lipe esta treinando");
        }

    }

    interface A {
        public void program();
    }

    final class Teste {
        private final String a;
        private final String b;

        public Teste(String a, String b) {
            this.a = a;
            this.b = b;
        }

        public String getA() {
            return a;
        }

        public String getB() {
            return b;
        }

    }

    class Teste2 {
        public Teste2(String a, String b) {
            super(a, b);
        }

        public void setA(String a) {
            super.a = a;
        }

        public void setB(String b) {
            super.b = b;
        }
    }

    public static void main(String args[]) {
        A a = new Lipe();
        a.program();

        BigDecimal
    }

}
