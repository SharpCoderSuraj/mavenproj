package clct.sets;

import java.util.HashSet;
import java.util.Set;

import clct.sets.entidades.Convidado;

public class ConjuntoConvidados {
    Set<Convidado> setConvidados;

    public ConjuntoConvidados() {
        super();
        setConvidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codConvite){
        setConvidados.add(new Convidado(nome, codConvite));
    }

    public void removerConvidadoPorCodigoConvite(String codConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado c : setConvidados){
            if(c.getCodConvite() == Integer.parseInt(codConvite)){
                convidadoParaRemover = c;
                break;
            }
        }
        setConvidados.remove(convidadoParaRemover);
    }

    public int qtdConvidados(){
        return setConvidados.size();
    }

    public void exibirConvidados(){
        System.out.println(setConvidados);
    }
}
