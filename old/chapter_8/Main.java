package chapter_8;

public class Main {

    static class A implements Generica {
        public String msg;

        public A(String msg) {
            this.msg = msg;
        }

        @Override
        public String toString(){
            return msg.toString();
        }

        @Override
        public Generica duplicateString(Generica a) {
            this.msg += this.msg;
            return this;
        }

    }

    static interface Generica {
        Generica duplicateString(Generica a);
    }

    interface Pai {
        public abstract Generica a(Generica msg);
    }

    @FunctionalInterface
    interface A2 extends Pai{
        public abstract Generica a(Generica msg);
    }

    public static void main(String... argssss) {
        new Main().mainNonStatic(Generica::duplicateString);
    }

    public void mainNonStatic(A2 a2) {
        A obj = new A("Hello");
        var result = a2.a(obj);
        System.out.println(result);

    }

}
