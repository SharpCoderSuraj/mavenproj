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

    public void setFoiConcluida(boolean foiConcluida) {
        this.foiConcluida = foiConcluida;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "(Descricao: " + descricao+"; Foi concluida? "+foiConcluida+")";
    }
}
