package teste1;

public record TestRecord() {

    public TestRecord {
        System.out.println("TestRecord");
        new TestRecord2("", 1);
    }

    public record TestRecord2(String name, int age) {

        public static final String foo;

        public TestRecord2 {
            if (name == null || name.isEmpty()) {
                throw new IllegalArgumentException("Name must not be null or empty");
            }
            if (age < 0) {
                throw new IllegalArgumentException("Age must not be negative");
            }

            new TestRecord();
        }

        public TestRecord2(int age) {
            this("default", age);
        }

        public static TestRecord2 of() {
            return new TestRecord2("default", 1);
        }

        public static void imprime() {
            System.out.println("");
        }

        static {
            foo = "foo";
        }
    }
}
