package dio.estudo.security.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping
    public String welcome(){
        return "Bem-vindo";
    }
    
    @GetMapping("/users")
    @PreAuthorize("hasRole('USER')")
    public String users(){
        return "Usuario autorizado";
    }

    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public String admin(){
        return "Adm autorizado";
    }
}
