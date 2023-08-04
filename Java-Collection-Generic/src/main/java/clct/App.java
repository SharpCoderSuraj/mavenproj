package clct;

import clct.listas.Carrinho;
import clct.listas.CatalogoLivros;
import clct.listas.ListaTarefas;
import clct.listas.Numero;
import clct.listas.OrdenacaoNumeros;
import clct.sets.AgendaContatos;

public class App{

    public static void main(String args[]) {
            new AgendaContatos().run();
        }

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

    public void runLivros() {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Carlos", "Auberto", 2010);
        catalogoLivros.adicionarLivro("Carlos", "Titulo 1", 2015);
        catalogoLivros.adicionarLivro("Carlos 3", "Titulo 3", 2023);
        catalogoLivros.adicionarLivro("Micheal Jackson", "Titulo 3", 2023);
        System.out.println(catalogoLivros.pesquisarPorAutor("Carlos"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloDeAnos(2016 , 2500));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Auberto"));
    }

    public void runNumeros() {
        Numero numeros = new Numero();
        numeros.adicionarNumero(12);
        numeros.adicionarNumero(26);
        numeros.adicionarNumero(-1);
        System.out.println(numeros.calcularSoma());
        System.out.println(numeros.maiorNumero());
        System.out.println(numeros.menorNumero());

        OrdenacaoNumeros nums = new OrdenacaoNumeros();
        nums.adicionarNumero(0);
        nums.adicionarNumero(12);
        System.out.println(nums.ordenarPorMaior());
        System.out.println(nums.ordenarPorMenor());
    }
    
}
