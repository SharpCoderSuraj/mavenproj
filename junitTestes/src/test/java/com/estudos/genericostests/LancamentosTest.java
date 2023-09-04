package com.estudos.genericostests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.estudos.genericos.Pessoa;

public class LancamentosTest {
        
    @Test
    @DisplayName("Teste")
    void checkIfLancamentosAreEquals(){
        int[] primeiroLancamento = {10, 20, 30, 40, 50, 60, 70};
        int[] segundoLancamento = {-1, 5, 2, 3, 10, 16, 17};

        Assertions.assertNotEquals(primeiroLancamento, segundoLancamento);

    }

    @Test
    void validateIfTheObjextIsNotNull(){
        Pessoa pessoa = new Pessoa();

        assertNotNull(pessoa);
    }

    @Test
    void validateDiferentTypesOfNumber(){
        double valor = 8.0;

        double outroValor = 8.0d;

        Assertions.assertEquals(valor, outroValor);
    }
}
