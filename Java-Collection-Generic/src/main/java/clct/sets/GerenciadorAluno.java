package clct.sets;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import clct.sets.entidades.Aluno;

public class GerenciadorAluno {
    private Set<Aluno> alunoSet;

    public GerenciadorAluno(){
        alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media){
        alunoSet.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula){
        for(Aluno a : alunoSet){
            if(a.getMatricula() == matricula){
                alunoSet.remove(a);
                break;
            }
        }
    }

    public Set<Aluno> exibirAlunosPorNome(){
        return new TreeSet<>(alunoSet);
    }

    public Set<Aluno> exibirAlunosPorNota(){
        Set<Aluno> porNota = new TreeSet<>(new Aluno().getComparetorNota()); 
        porNota.addAll(alunoSet);
        return porNota;
    }

}
