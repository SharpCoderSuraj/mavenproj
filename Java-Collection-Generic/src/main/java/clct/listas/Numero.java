package clct.listas;

import java.util.ArrayList;
import java.util.List;

public class Numero {
    List<Integer> listaNumeros;

    public Numero(){
        listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        listaNumeros.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;
        for(Integer num : listaNumeros)
            soma += num;
        return soma;
    }

    public int menorNumero(){
        Integer menorNumero = Integer.MAX_VALUE;
        for(Integer i: listaNumeros){
            if(i < menorNumero)
                menorNumero = i;
        }
        return menorNumero;
    }

    public int maiorNumero(){
        Integer maiorNumero = Integer.MIN_VALUE;
        for(Integer i : listaNumeros)
            if(i > maiorNumero)
                maiorNumero = i;
        return maiorNumero;
    }
}
