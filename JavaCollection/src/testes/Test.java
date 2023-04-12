package testes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Test {
    
    public static void exemplo1(){
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Manga");
        lista.add("Maça");
        lista.add("Banana");
        lista.add("Uva");
        
        System.out.println(lista);
    }
    
    public static void exemplo2E3(){
        ArrayList<Integer> listaInt = new ArrayList<>();
        listaInt.add(12);
        listaInt.add(10);
        listaInt.add(2);
        
        /*Iterator itr = listaInt.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }*/
        
        for(Integer i : listaInt){
            System.out.println(i);
        }
    }
    
    public static void exemplo4(){
        ArrayList<String> listaStr = new ArrayList<>();
        listaStr.add("Manga");
        listaStr.add("Maça");
        listaStr.add("Banana");
        listaStr.add("Uva");
        
        System.out.println("Retorno do elmento em 2ª posição: " + listaStr.get(1));
        
        listaStr.set(1, "Dados");
        for(String fruta : listaStr){
            System.out.println(fruta);
        }        
    }
    
    /***
     * Organiza duas listas
     */
    public static void exemplo5(){
        ArrayList<String> listaStr = new ArrayList<>();
        listaStr.add("Manga");
        listaStr.add("Maça");
        listaStr.add("Banana");
        listaStr.add("Pera");
        
        System.out.println("Organizando a lista de Strings");
        Collections.sort(listaStr);
        System.out.println(listaStr);
        
        ArrayList<Integer> listaInt = new ArrayList<>();
        listaInt.add(12);
        listaInt.add(8);
        listaInt.add(-4);
        listaInt.add(0);
        
        System.out.println("Organizando a lista de Integers");
        Collections.sort(listaInt);
        System.out.println(listaInt);
    }
    
    public static void exemplo6(){
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Ravi");
        lista.add("Lavi");
        lista.add("Javi");
        
        try{
            FileOutputStream fos = new FileOutputStream("file");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(lista);
            fos.close();
            oos.close();
            
            FileInputStream fis = new FileInputStream("file");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList list = (ArrayList) ois.readObject();
            System.out.println(list);
            
        } catch (Exception ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
}
