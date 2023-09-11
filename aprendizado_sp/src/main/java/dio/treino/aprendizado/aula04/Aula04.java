package dio.treino.aprendizado.aula04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;

public class Aula04{

    @Autowired
    private Remetente remetente;

    /*public void run(String... args) throws Exception {
        System.out.println("Mandado por " + remetente.getNome() + "\nCom o email: " + remetente.getEmail());
    }*/
    
}
