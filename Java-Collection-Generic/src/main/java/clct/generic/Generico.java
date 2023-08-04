package clct.generic;

import java.util.HashSet;
import java.util.Set;

public class Generico{

    public <T> Set<?> teste(){
        return new HashSet<T>();
    }

    public <T> void mandarOi(T t){
        System.out.println(t);
    }


}
