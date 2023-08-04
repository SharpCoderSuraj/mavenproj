package clct.sets;

import java.util.HashSet;
import java.util.Set;
import clct.sets.entidades.Contato;

public class AgendaContatos {
    private Set<Contato> contatoSets;

    public AgendaContatos() {
        contatoSets = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSets.add(new Contato(nome, numero));
    } 

    public void exibitContatos(){
        System.out.println(contatoSets);
    }

    public Contato pesquisarPorNome(String nome){
        Contato contatoPesq = null;
        for(Contato c : contatoSets)
            if(c.getNome().equalsIgnoreCase(nome))
                contatoPesq = c;
        return contatoPesq;
    }

    public void atualizarNumero(String nome, int novoNumero){
        for(Contato c : contatoSets){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                break;
            }
        }
    }

    public void run(){
        AgendaContatos agenda = new AgendaContatos();
        agenda.adicionarContato("123", 0);
        agenda.adicionarContato("Bah", 123);
        agenda.exibitContatos();
        agenda.atualizarNumero("123", 1);
        agenda.exibitContatos();
        System.out.println(agenda.pesquisarPorNome("Bah"));
    }

}
