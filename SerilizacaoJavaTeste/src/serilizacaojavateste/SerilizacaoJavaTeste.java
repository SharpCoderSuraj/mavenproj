package serilizacaojavateste;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

class SerilizacaoJavaTeste {

    public static void main(String[] args) {
        Demo object = new Demo(1, "olá mundo!");
        String filename = "file.ser";
        
        try{
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);
            
            out.writeObject(object);
            
            out.close();
            file.close();
            
            System.out.println("Objeto foi serializado");
        } catch (IOException ex) {
            Logger.getLogger(SerilizacaoJavaTeste.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Demo object1 = null;
        
        try{
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);
            
            object1 = (Demo) in.readObject();
            in.close();
            file.close();
            
            System.out.println("Objeto foi desserializado");
            System.out.println("a = " + object1.a);
            System.out.println("b = " +object1.b);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SerilizacaoJavaTeste.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SerilizacaoJavaTeste.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SerilizacaoJavaTeste.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
