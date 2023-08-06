package streams;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExemple {
    public void run(){
        Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)";

        List<String> listaSaudacao = Stream.generate(() -> 
            "Olá, bem-vindo").limit(5).toList();
        listaSaudacao.forEach(System.out::println);
        
    }
}