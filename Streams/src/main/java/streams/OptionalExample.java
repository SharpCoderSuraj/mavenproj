package streams;

import java.util.Optional;

import javax.management.RuntimeErrorException;

public class OptionalExample {
    public void run(){
        Optional<String> optionalValue = Optional.ofNullable("A");
        String result = optionalValue.orElseThrow(() -> new NullPointerException());
        System.out.println(result);
        optionalValue.ifPresent(value -> System.out.println(value));
    }
    
}
