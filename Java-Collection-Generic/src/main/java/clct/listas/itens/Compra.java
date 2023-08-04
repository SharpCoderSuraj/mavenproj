package clct.listas.itens;

public class Compra {
    private String nome;
    private double preco;
    private int quantidade;

    public Compra(){}

    public Compra(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public String toString(){
        return String.format("(Nome %s; Preço: %.2f; Quantidade: %d)", nome, preco, quantidade);
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
}
