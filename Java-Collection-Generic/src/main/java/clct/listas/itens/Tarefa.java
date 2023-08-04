package clct.listas.itens;

public class Tarefa {
    String descricao;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Tarefa(String descricao){
        this.descricao = descricao;
    }

    public String toString(){
        return descricao;
    }
}
