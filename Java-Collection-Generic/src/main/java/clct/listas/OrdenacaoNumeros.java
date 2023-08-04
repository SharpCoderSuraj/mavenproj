package clct.listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> listaNumero;


    public OrdenacaoNumeros(){
        listaNumero = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        listaNumero.add(numero);
    }

    public List<Integer> ordenarPorMenor(){
        List<Integer> listaDescres = listaNumero;
        Collections.sort(listaDescres, new Comparator<Integer>() {
            public int compare(Integer arg0, Integer arg1){
                return Integer.compare(arg0, arg1);
            }
        } );
        return listaDescres;
    }

    public List<Integer> ordenarPorMaior(){
        List<Integer> listaCres = listaNumero;
        Collections.sort(listaCres, new Comparator<Integer>() {
            public int compare(Integer arg0, Integer arg1){
                return Integer.compare(arg1, arg0);
            }
        } );
        return listaCres;
    }
}
