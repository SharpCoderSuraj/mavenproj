package clct.listas;

import java.util.ArrayList;
import java.util.List;

import clct.listas.itens.Livro;

public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros(){
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String autor, String titulo, int anoPub){
        livroList.add(new Livro(autor, titulo, anoPub));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosDoAutor = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro livro : livroList){
                if(livro.getAutor().equalsIgnoreCase(autor)){
                    livrosDoAutor.add(livro);
                }
            }
        }
        return livrosDoAutor;
    }

    public List<Livro> pesquisarPorIntervaloDeAnos(int anoInicial, int anoFinal){
        List<Livro> livrosFiltrados = new ArrayList<>(); 
        anoInicial--;
        anoFinal++;
        if(!livroList.isEmpty()){
            for(Livro livro : livroList){
                if(livro.getAnoPub() > anoInicial && livro.getAnoPub() < anoFinal){
                    livrosFiltrados.add(livro);
                }
            }
        }
        return livrosFiltrados;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livrosFiltrado = new Livro();
        if(!livroList.isEmpty())
            for (Livro livro : livroList) {
                if(livro.getTitulo().equalsIgnoreCase(titulo)){
                    livrosFiltrado = livro;
                    break;
                }
            }
        return livrosFiltrado;
    }

    public void exibirLivros(){
        System.out.println(livroList);
    }

}
