package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    
    public void run(){
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;

        System.out.println("A soma dos numero é: " + numeros.stream().reduce(0, Integer::sum));
    }
}
