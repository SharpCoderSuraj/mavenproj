package clct.listas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> listaDeTarefas;

    public ListaTarefas(){
        this.listaDeTarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        listaDeTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa tarefas : listaDeTarefas) {
            if(tarefas.getDescricao().equalsIgnoreCase(descricao))
                tarefasParaRemover.add(tarefas);
        }
        listaDeTarefas.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalDeTarefas(){
        return listaDeTarefas.size();
    }

    public void obterDescricaoDeTarefas(){
        System.out.println(listaDeTarefas);
    }
}
