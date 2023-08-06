package clct.sets.entidades;

import java.util.Comparator;

public class Produto implements Comparable<Produto>{
    private long cod;    
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(long cod, String nome, double preco, int quantidade){
        this.cod = cod;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public long getCod() {
        return cod;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return String.format("(Codigo: %d; Nome: %s; Preco: %f; Quantidade: %d)", cod, nome, preco, quantidade);
    }

    @Override
    public int compareTo(Produto p1) {
        return nome.compareTo(p1.getNome());
    }

    public static comparePreco getComparePreco(){
        return new comparePreco();
    }

}

class comparePreco implements Comparator<Produto>{
    @Override
    public int compare(Produto arg0, Produto arg1) {
        return Double.compare(arg0.getPreco(), arg1.getPreco());
     }
    
}
