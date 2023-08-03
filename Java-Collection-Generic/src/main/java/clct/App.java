package clct;

import clct.listas.Carrinho;
import clct.listas.ListaTarefas;

public class App implements Runnable{

    public static void main(String args[]){
            new Thread(new App()).run();

        }

    @Override
    public void run() {
       /*ListaTarefas listaT = new ListaTarefas();
        System.out.println(listaT.obterNumeroTotalDeTarefas());

        listaT.adicionarTarefa("Tarefa 1");
        listaT.adicionarTarefa("Tarefa 2");
        listaT.adicionarTarefa("Tarefa 2");
        System.out.println(listaT.obterNumeroTotalDeTarefas());

        //lista.removerTarefa("Tarefa 2");
        System.out.println(listaT.obterNumeroTotalDeTarefas());
        listaT.obterDescricaoDeTarefas();*/

        Carrinho carrinho = new Carrinho();
        carrinho.adicionarItem("null", 8, 2);
        carrinho.adicionarItem("ab", 10.8, 1);
        carrinho.exibirItens();
        System.out.println("O total de foi: " + carrinho.calcularTotal());
        carrinho.removerItem("null");
        System.out.println("O total de foi: " + carrinho.calcularTotal());
    }

        
}
