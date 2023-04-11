package generics;

public class Generic<T, U> {

    T obj;
    U obj1;
    public Generic(T obj, U obj1){
        this.obj = obj;
        this.obj1 = obj1;
    }
    
    /*public T getObject(){
        return this.obj;
    }*/
    
    public void print(){
        System.out.println(obj);
        System.out.println(obj1);
    }
    
    
    public static <T extends Comparable<T> > void sortear_Genericos(T[] a){
        
        //Sorteamento tipo bolha
        for(int i = 0; i < a.length - 1; i++){
            for(int j = 0; j < a.length - i - 1; j++){
                if(a[j].compareTo(a[j + 1]) > 0){
                    swap(j, j +1, a);
                }
            }
        }
        
        for(T i : a){
            System.out.print(i + ", ");
        }
        System.out.println();
    }
    
    public static <T> void swap(int i, int j, T[] a){
        T t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
