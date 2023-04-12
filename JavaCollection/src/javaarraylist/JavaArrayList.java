package javaarraylist;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;


public class JavaArrayList {

    public static void main(String[] args) {
        //testes.Test.exemplo6();
        /*Map<String, Produto> produtosPeloNome = new HashMap<>();
        Produto eBike =  new Produto("E-bike", "Uma bicicleta com bateria");
        Produto roadBike = new Produto("Bike de estrada", "Uma bicicleta para competição");
        produtosPeloNome.put(eBike.getNome(), eBike);
        produtosPeloNome.put(roadBike.getNome(), roadBike);
        System.out.println(produtosPeloNome.containsKey(eBike.getNome()));*/
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(3, "val");
        map.put(2, "val");
        map.put(1, "val");
        map.put(5, "val");
        map.put(4, "val");
        System.out.println(map);
        
        Integer maiorValor = map.lastKey();
        Integer menorValor = map.firstKey();
        
        Set<Integer> chavesMenor3 = map.headMap(3).keySet();
        Set<Integer> chavesMaiorIgual3 = map.tailMap(3).keySet();
        
        System.out.println(chavesMenor3);
        System.out.println(chavesMaiorIgual3);
    }    
}
