package com.estudos.genericostests;

import com.estudos.genericos.Pessoa;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PessoaTest {
    
    @Test
    public void whenCreatingPessoaCHechkIfIdadeIs18(){
        Pessoa pessoa = new Pessoa("Carlos", LocalDateTime.of(2005, 1, 2, 0, 0, 0));
        Assertions.assertEquals(18, pessoa.getIdade());
        
    }

    @Test
    public void deveCalcularIdadeCorretamente(){
        Pessoa jessica = new Pessoa("Jéssica", LocalDateTime.of(2000, 1, 2, 0, 0, 0));
        Assertions.assertEquals(23, jessica.getIdade());
    }

    @Test
    void deveRetornarSeEMaiorDeIdade(){
        Pessoa jessica = new Pessoa("Jéssica", LocalDateTime.of(2000, 1, 2, 0, 0, 0));
        Pessoa joao = new Pessoa("João", LocalDateTime.now());
        Assertions.assertAll("pessoa", () -> Assertions.assertTrue(jessica.eMaiorDeIdade()), () -> Assertions.assertFalse(joao.eMaiorDeIdade()));
    }
}
