package com.estudos.genericos;

public class TransferidorEntreContas {
    public void tranferirEntreContas(Conta contaDoadora, Conta contaReceptora, int valor){
        if(valor < 1)
            throw new IllegalArgumentException("Argumento deve ser maior que 0");
            
    }
}
