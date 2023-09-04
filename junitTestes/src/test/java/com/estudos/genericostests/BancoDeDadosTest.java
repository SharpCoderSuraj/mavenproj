package com.estudos.genericostests;

import java.time.LocalDateTime;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.estudos.genericos.BancoDeDados;
import com.estudos.genericos.Pessoa;

public class BancoDeDadosTest {
    
    @BeforeAll
    static void configurarConexao(){
        BancoDeDados.iniciarConexao();
    }

    @BeforeEach
    void insertDataForTest(){
        BancoDeDados.inserirDados(new Pessoa("João", LocalDateTime.now()));
    }

    @Test
    void validadteDataFromReturn(){
        Assertions.assertTrue(true);
    }

    @Test
    void validadteDataFromReturn2(){
        Assertions.assertNull(null);
    }

    @AfterAll
    static void finalizarConexao(){
        BancoDeDados.fecharConexao();
    }

    @BeforeEach
    void removeTestData(){
        BancoDeDados.removerDados(new Pessoa("João", LocalDateTime.now()));
    }
}
