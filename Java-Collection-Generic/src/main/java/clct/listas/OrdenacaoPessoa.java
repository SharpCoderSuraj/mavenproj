package clct.listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import clct.listas.itens.Pessoa;

public class OrdenacaoPessoa {
    private List<Pessoa> listaPessoas;

    

    public void adicionarPessoa(String nome, int idade, double altura){
        listaPessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = listaPessoas;
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = listaPessoas;
        Collections.sort(pessoasPorAltura, new Comparator<Pessoa>() {
            public int compare(Pessoa p1, Pessoa p2){
                return Double.compare(p1.getAltura(), p2.getAltura());
            }
        });
        return listaPessoas;
    }
}
