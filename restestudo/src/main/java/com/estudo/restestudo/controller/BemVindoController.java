package com.estudo.restestudo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BemVindoController {
    @GetMapping("/welcome")
    public String welcome(){
        return "Ola mundo (de novo), bem vindo a minha Spring boot web API";
    }
}
