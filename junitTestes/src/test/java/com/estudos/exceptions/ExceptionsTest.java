package com.estudos.exceptions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.estudos.genericos.Conta;
import com.estudos.genericos.TransferidorEntreContas;

public class ExceptionsTest {
    
    @Test
    void checkIfAnExceptionIsThrow(){
        Conta conta1 = new Conta("a12", 0);
        Conta conta2 = new Conta("45789", 100);
        TransferidorEntreContas tf = new TransferidorEntreContas();
        Assertions.assertThrows(IllegalArgumentException.class, () -> tf.tranferirEntreContas(conta1, conta2, 0));
        Assertions.assertDoesNotThrow(() -> tf.tranferirEntreContas(conta1, conta2, 10));
    }
}
