package SuporteTecnico;

import java.util.HashSet;
public class Interpretadora {
    private HashSet <String> palavrasChave;

    public Interpretadora(){
        this.palavrasChave = new HashSet<String>();
    }
    public HashSet <String> separarPalavras(String palavra){
        palavrasChave.clear();
        String[] palavras = palavra.toLowerCase().split(" ");
        for(int i=0; i<palavras.length; i++){
            this.palavrasChave.add(palavras[i]);
        }
        return this.palavrasChave;
    }
}
