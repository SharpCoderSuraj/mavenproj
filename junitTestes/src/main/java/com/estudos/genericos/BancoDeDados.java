package com.estudos.genericos;

import java.util.logging.Logger;

public class BancoDeDados {
    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());

    public static void iniciarConexao(){
        LOGGER.info("Iniciou conexão");
    }

    public static void fecharConexao(){
        LOGGER.info("Fechou conexão");
    }

    public static void inserirDados(Pessoa pessoa){
        LOGGER.info("Inseriu: " + pessoa.getNome());
    }

    public static void removerDados(Pessoa pessoa){
        LOGGER.info("Removeu: " + pessoa.getNome());
    }
}
