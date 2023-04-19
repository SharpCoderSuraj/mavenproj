
package javaio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestClassIO {
    static void run(){
        FileInputStream in = null;
        FileOutputStream out = null;
        

        //Copia dados do arquivo input para o output
        try{
            in = new FileInputStream("input.txt");
            out = new FileOutputStream("output.txt");
          
            int c;
            while((c = in.read()) != -1){
                out.write(c);
            }
        }catch (FileNotFoundException ex) {
            Logger.getLogger(TestClassIO.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex) {
            Logger.getLogger(TestClassIO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(in != null)
                try {
                    in.close();
            } catch (IOException ex) {
                Logger.getLogger(TestClassIO.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(out != null)
                try {
                    out.close();
            } catch (IOException ex) {
                Logger.getLogger(TestClassIO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }   
    }
    
    static void leitorDeTeclas() throws IOException{
        try(InputStreamReader cin = new InputStreamReader(System.in)) {
            System.out.println("Digite caracteres, aperte 'q' para encerrar: ");
            char c;
            do{
                c = (char) cin.read();
                System.out.print(c);
            }while(c != 'q');
        }
    }
    
    static void lerTxt(){
        try{
            byte bWrite[] = {11,21,3,40,5};
            OutputStream os = new FileOutputStream("test.txt");
            
            for(int x = 0; x < bWrite.length; x++){
                os.write(bWrite[x]);
            }
            os.close();
            
            InputStream is = new FileInputStream("test.txt");
            int size = is.available();
            
            for(int i = 0; i < size; i++){
                System.out.print((char)is.read()+" "); 
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TestClassIO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TestClassIO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
