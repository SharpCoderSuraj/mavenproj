package clct.sets;

import java.util.Set;

import clct.sets.entidades.Tarefa;

public class ListaTarefas {
    private Set<Tarefa> listaTarefas;

    

    public void adicionarTarefa(Tarefa tarefa){
        listaTarefas.add(tarefa);
    }
}
