package clct.sets;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import clct.sets.entidades.Produto;

public class CadastroProdutos {
    Set<Produto> produtoSet;

    public CadastroProdutos(){
        produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtoPorNome = new TreeSet<>(produtoSet);
        return produtoPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtoPorPreco = new TreeSet<>(Produto.getComparePreco());
        produtoPorPreco.addAll(produtoSet);
        return produtoPorPreco;
    }

    public void run(){
        CadastroProdutos cadastroProd = new CadastroProdutos();
        cadastroProd.adicionarProduto(0, "Prod 1", 10.2, 2);
        cadastroProd.adicionarProduto(1, "Prod 2", 5.2, 2);
        System.out.println(cadastroProd.exibirProdutosPorNome());
        System.out.println(cadastroProd.exibirProdutosPorPreco());
    }
}
