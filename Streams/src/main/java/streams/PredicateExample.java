package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    
    public void run(){
        List<String> palavras = Arrays.asList("java", "kotlin", "python"
        , "javascript", "c", "go", "ruby");

        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

        palavras.stream().filter(temMais5Carac -> temMais5Carac.length() < 5).forEach(System.out::println);
    }
}
