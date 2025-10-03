package teste1;

public class C {
    public static int a = 1;

    public static class C2 {
        public static int a = 2;

        public class C3 {
            public static int a = 3;

            public C3() {
                System.out.println(C2.a);
            }

        }

    }

    public class C22 {
        public int a = 4;

    }
}
