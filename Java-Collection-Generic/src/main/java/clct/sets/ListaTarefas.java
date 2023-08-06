package clct.sets;

import java.util.HashSet;
import java.util.Set;

import clct.sets.entidades.Tarefa;

public class ListaTarefas {
    private Set<Tarefa> listaTarefas;

    public ListaTarefas(){
        listaTarefas = new HashSet<>();
    }

    public void adicionarTarefa(Tarefa tarefa){
        listaTarefas.add(tarefa);
    }

    public void removerTarefa(Tarefa tarefa){
        for(Tarefa t : listaTarefas){
             if(t.getDescricao().equalsIgnoreCase(tarefa.getDescricao()) && t.isFoiConcluida() == t.isFoiConcluida()){
                listaTarefas.remove(t);
                break;
            }
        }
    }

    public void exibirTarefas(){
        System.out.println(listaTarefas);
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for(Tarefa tarefa : listaTarefas)
            if(tarefa.isFoiConcluida())
                tarefasConcluidas.add(tarefa);
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasNaoConcluidas(){
        Set<Tarefa> tarefasNaoConcluidas = new HashSet<>();
        for(Tarefa tarefa : listaTarefas)
            if(!tarefa.isFoiConcluida())
                tarefasNaoConcluidas.add(tarefa);
        return tarefasNaoConcluidas;
    }

    public void marcarTarefaConcluida(Tarefa tarefa){
        for(Tarefa t : listaTarefas)
            if(t.getDescricao().equalsIgnoreCase(tarefa.getDescricao()) && t.isFoiConcluida() == t.isFoiConcluida())
                t.setFoiConcluida(true);
    }
    
    public void marcarTarefaPendente(Tarefa tarefa){
        for(Tarefa t : listaTarefas)
            if(t.getDescricao().equalsIgnoreCase(tarefa.getDescricao()) && t.isFoiConcluida() == t.isFoiConcluida())
                t.setFoiConcluida(false);
    }

    public void run(){
        ListaTarefas listaTarefas = new ListaTarefas();
        listaTarefas.adicionarTarefa(new Tarefa("Carlos", false));
        listaTarefas.adicionarTarefa(new Tarefa("Andre", true));
        listaTarefas.adicionarTarefa(new Tarefa("Andre 2", true));
        listaTarefas.exibirTarefas();
        listaTarefas.removerTarefa(new Tarefa("Andre", true));
        listaTarefas.exibirTarefas();
        System.out.println(listaTarefas.obterTarefasConcluidas());
        System.out.println(listaTarefas.obterTarefasNaoConcluidas());
        listaTarefas.marcarTarefaConcluida(new Tarefa("Carlos", false));
        listaTarefas.exibirTarefas();
        listaTarefas.marcarTarefaPendente(new Tarefa("Andre 2", true));
        listaTarefas.exibirTarefas();
    }

}
