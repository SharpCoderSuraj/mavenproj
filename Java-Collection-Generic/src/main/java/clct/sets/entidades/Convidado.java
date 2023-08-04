package clct.sets.entidades;

public class Convidado {
    String nome;
    int codConvite;
    
    public String getNome() {
        return nome;
    }

    public int getCodConvite() {
        return codConvite;
    }

    public Convidado(String nome, int codConvite) {
        this.nome = nome;
        this.codConvite = codConvite;
    }

    @Override
    public String toString() {
        return String.format("(Nome: %s; Código do convite: %d)", nome, codConvite);
    }
}
