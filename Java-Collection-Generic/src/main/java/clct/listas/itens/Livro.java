package clct.listas.itens;

public class Livro {
    String autor, titulo;
    int anoPub;

    public Livro(){}

    public Livro(String autor, String titulo, int anoPub){
        this.autor = autor;
        this.titulo = titulo;
        this.anoPub = anoPub;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoPub() {
        return anoPub;
    }

    @Override
    public String toString() {
        return String.format("(Titulo: %s; Autor: %s; Ano de publicação: %d)", titulo, autor, anoPub);
    }
}
