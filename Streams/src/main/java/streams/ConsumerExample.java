package streams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    
    public void run(){
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        /*Consumer<Integer> imprimirNumeroPar = numero -> {
            if((numero.intValue() & 1) == 0 ){
                System.out.println(numero);
            }
        };*/

        numeros.forEach(numero -> {
            if((numero.intValue() & 1) == 0 ){
                System.out.println(numero);
            }
        });
    }
}
