package com.estudo.restestudo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.estudo.restestudo.model.Usuario;
import com.estudo.restestudo.repository.UserRepository;

@RestController
public class UsuarioController {
    @Autowired
    private UserRepository repository;

    @GetMapping
    public List<Usuario> getUsers(){
        return repository.findAll();
    }

    @GetMapping("/users/{username}")
    public Usuario getOne(@PathVariable("username") String username){
        return repository.findByUsername(username);
    }

    @DeleteMapping("/users/{id}")
    public String delete(@PathVariable("id") Integer id){
        repository.deleteById(id);
        return repository.findById(id) + " foi deletado";

    }

    @PostMapping("/users")
    public String postUsuario(@RequestBody Usuario usuario){
        repository.save(usuario);
        return usuario.getUsername() + " foi salvo";
    }
}
