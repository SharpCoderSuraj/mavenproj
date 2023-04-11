package generics;

public class TesteMaximo {
    public static <T extends Comparable<T>> T descobrirValorMaximo(T x, T y, T z){
       T maximo = x;
       if(y.compareTo(maximo) > 0){
           maximo = y;
       }
       
       if(z.compareTo(maximo) > 0){
           maximo = z;
       }
       
       return maximo;
    }
}
