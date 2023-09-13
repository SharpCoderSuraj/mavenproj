package dio.estudo.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import dio.estudo.security.entity.User;
import dio.estudo.security.repository.UserRepository;
import jakarta.transaction.Transactional;

@Component
public class StartDatabseApp implements CommandLineRunner{

    @Autowired
    private UserRepository userRepository;

    @Transactional
    @Override
    public void run(String... args) throws Exception {
        User user = userRepository.findByUsername("admin");
        if(user == null){
            user = new User("admin");
            user.setName("ADMIN");
            user.setPassword("master123");
            user.getRoles().add("ADMIN");
            userRepository.save(user);
        }
        user = userRepository.findByUsername("user");
        if(user == null){
            user = new User("user");
            user.setName("USER");
            user.setPassword("user123");
            user.getRoles().add("USER");
            userRepository.save(user);
        }
    }
    
}
