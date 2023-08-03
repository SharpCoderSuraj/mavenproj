package clct.listas;

import java.util.ArrayList;
import java.util.List;
import clct.listas.Compra;

public class Carrinho {
    private List<Compra> listCompra;

    public Carrinho(){
        listCompra = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        listCompra.add(new Compra(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Compra> listaRemover = new ArrayList<>();
        for(Compra compra : listCompra){
            if(compra.getNome().equalsIgnoreCase(nome)){
                listaRemover.add(compra);
            }
        }
        listCompra.removeAll(listaRemover);
    }

    public double calcularTotal(){
        double total = 0;
        for(Compra compra : listCompra){
            total += compra.getPreco()*compra.getQuantidade();
        }
        return total;
    }

    public void exibirItens(){
        System.out.println(listCompra);
    }

}
