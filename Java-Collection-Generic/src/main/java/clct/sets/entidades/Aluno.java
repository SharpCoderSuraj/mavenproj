package clct.sets.entidades;

import java.util.Comparator;

public class Aluno implements Comparable<Aluno>{
    private String nome;
    private Long matricula;
    private double media;

    private ComparetorNota comparador = new ComparetorNota(); 

    public Aluno(){}

    public Aluno(String nome, Long matricula, double media) {
        this.nome = nome;
        this.matricula = matricula;
        this.media = media;
    }

    public Long getMatricula() {
        return matricula;
    }

    public double getMedia() {
        return media;
    }

    public String getNome() {
        return nome;
    }

    public ComparetorNota getComparetorNota() {
        return comparador;
    }

    @Override
    public int compareTo(Aluno arg0) {
        return nome.compareTo(arg0.getNome());
    }

    class ComparetorNota implements Comparator<Aluno>{

        ComparetorNota(){
            super();
        }

        @Override
        public int compare(Aluno arg0, Aluno arg1) {
            return Double.compare(arg0.getMedia(), arg1.getMedia());
        }

    }
    
}
