package clct.sets;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas{
    Set<String> setPalavras;

    public ConjuntoPalavrasUnicas() {
        setPalavras = new HashSet<>();
    }

    public void adicionarPalavraUnica(String palavraUnica){
        setPalavras.add(palavraUnica);
    }

    public void removerPalavraUnica(String palavraUnica){
        setPalavras.remove(palavraUnica);
    }

    public boolean verificarPalavra(String palavraUnica){
        for(String palavra : setPalavras)
            if(palavra == palavraUnica){
                return true;
            }
        return false;
    }

    public void exibirPalvrasUnicas(){
        System.out.println(setPalavras);
    }
}