package clct.sets.entidades;

public class Tarefa {
    private String descricao;
    private boolean foiConcluida;
    
    public Tarefa(String descricao, boolean foiConcluida) {
        this.descricao = descricao;
        this.foiConcluida = foiConcluida;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isFoiConcluida() {
        return foiConcluida;
    }
}
