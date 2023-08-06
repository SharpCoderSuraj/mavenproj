package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {
    public void run(){
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        
        Function<Integer, Integer> dobrar = numero -> numero * 2;

        List<Integer> numerosDobrados = numeros.stream().map(numero -> numero << 1).toList();

        numerosDobrados.forEach(System.out::println);
    }
}
