package dio.treino.aprendizado.aula05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import dio.treino.aprendizado.aula05.model.User;
import dio.treino.aprendizado.aula05.repository.UserRepository;

@Component
public class StartApp implements CommandLineRunner{

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        
        User user = new User();
        user.setNome("Pedro");
        user.setSenha("senha1234444");

        userRepository.save(user);
        for(User u : userRepository.findAll()){
            System.out.println(u.getNome());
        }

        for(User u : userRepository.findByNomeLike("PEdro")){
            System.out.println(u.getSenha());
        }
    }
    
}
