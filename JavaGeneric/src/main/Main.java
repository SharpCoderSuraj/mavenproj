package main;

import generics.Generic;
import java.util.ArrayList;
import java.util.List;

/*
T - Tipo
E - Elemento
K - Chave
N - Numero
V - Valor
*/

public class Main {
    
    public static <T> void mostrarGenerico(T element){
        System.out.println(element.getClass().getName() + " = " + element);
    }
    
    public static void main(String args[]){
        /*Generic<String, Integer> iObj = new Generic<>("Carlos", 15);
        iObj.print();*/
        /*mostrarGenerico(123);
        mostrarGenerico("Olá mundo!");
        mostrarGenerico(1.0);*/
        /*ArrayList<String> lista = new ArrayList<String>();
        lista.add("André");*/
        /*Integer[] listaInt = {12, 0, 26, 33};
        Character[] listaChar = {'A','a', 'C', 'c', 'z', '8'};
        String[] listaString = {"Maninho", "Poppy", "Amor da minha vida", "Pedro"};
        Generic.sortear_Genericos(listaInt);
        Generic.sortear_Genericos(listaChar);
        Generic.sortear_Genericos(listaString);*/
    }
}
