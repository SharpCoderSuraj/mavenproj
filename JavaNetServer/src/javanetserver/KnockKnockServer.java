package javanetserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class KnockKnockServer {
    int portNumber = 5000;
    
    public void run(){
        try(
                ServerSocket serverSocket = new ServerSocket(portNumber);
                Socket clientSocket = serverSocket.accept();
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                ){
            String inputLine, outputLine;     
            
            //Inicia a conversa com o cliente
            KnockKnockProtocol kkp =  new KnockKnockProtocol();
            outputLine = kkp.processInput(null);
            out.println(outputLine);
            
            while((inputLine = in.readLine()) != null){
                outputLine = kkp.processInput(inputLine);
                out.println(outputLine);
                if(outputLine.equals("Bye."))
                    break;
            }
            
        }catch (IOException ex) {
            Logger.getLogger(KnockKnockServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
