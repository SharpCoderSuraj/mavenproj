package com.estudos.genericos;

public class Conta {
    private String nome;
    private Integer saldo;

    public Conta(String nome, Integer saldo){
        this.nome = nome;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public Integer getsaldo() {
        return saldo;
    }
}
