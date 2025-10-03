package questions_expert;

import java.util.List;
import java.util.Optional;

public class Ex04 {
    /*
     * 4. Composição Funcional com Optional + Map
     * Objetivo: A partir de um List<Optional<String>>, extraia os valores não
     * vazios, e para cada valor, se tiver pelo menos duas palavras, pegue a segunda
     * palavra. No final, retorne uma lista ordenada dessas palavras.
     * 
     * ["ChatGPT", "Java", "Stream"]
     * 
     */
    public static void main(String[] args) {
        List<Optional<String>> dados = List.of(
                Optional.of("Java Stream API"),
                Optional.empty(),
                Optional.of("Certificação Java"),
                Optional.of("OpenAI ChatGPT"),
                Optional.of("Stream"));

    }
}
