package teste3;

import teste1.Teste1;
import teste2.Teste2;

public class Teste3 extends Teste2 {

    private final String testeVariable = "Teste3";

    public static Number testeHidden() {
        return 1;
    }

    public Number testeOverriden() {
        return 11111;
    }

}