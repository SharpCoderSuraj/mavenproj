package com.estudo.restestudo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.estudo.restestudo.handler.BusinessException;
import com.estudo.restestudo.model.Usuario;

@Repository
public class UserRepository {
    
    private List<Usuario> usuarios = new ArrayList<>();

    public void save(Usuario usuario){
        if(usuario.getUsername().equals(null))
            try {
                throw new BusinessException("O campo username e obrigatorio");
            } catch (BusinessException e) {
                e.printStackTrace();
            }
        
        usuarios.add(usuario);

    }

    public boolean deleteById(Integer id){
        for(Usuario usuario : usuarios){
            if(usuario.getId() == id)
                return true;
        }
        return false;
    }

    public List<Usuario> findAll(){
        return usuarios;
    }

    public Usuario findById(Integer id){
        for(Usuario usuario : usuarios){
            if(usuario.getId() == id)
                return usuario;
        }
        return null;
    }

    public Usuario findByUsername(String username){
        for(Usuario usuario : usuarios){
            if(usuario.getUsername().equals(username))
                return usuario;
        }
        return new Usuario();
    }

}
