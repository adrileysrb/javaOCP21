// Passing parameters to a Java Program

// javac Main.java
// java Main param1 param2, etc

import java.util.Random;

public class Main {
    // "final" é opcional
    public final static void main(String args[]) {
        // System.out.println(args[0] +" teste");
        // System.out.println(args[1]);

        Random random = new Random();

        System.out.println(random.nextInt(10)); // 0-9
    }
}