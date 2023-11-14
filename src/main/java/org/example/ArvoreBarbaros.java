package org.example;

import java.util.HashMap;
import java.util.Map;

public class ArvoreBarbaros {
    Map<String, Nodo> arvore;
    Nodo root;

    public ArvoreBarbaros(String root, int terras_root) {
        arvore = new HashMap<>();
        this.root = new Nodo(root, terras_root);
        arvore.put(root,this.root);

    }

    public void add(String nomePai, String nomeFilho, int terrasConquistadas) {
        add0(nomePai, nomeFilho, terrasConquistadas);
    }

    public void add0(String nomePai, String nome, int t) {
        Nodo pai = arvore.get(nomePai);
        if (pai != null) {
            Nodo filho = new Nodo(nome, t);
            pai.addFilho(nome,t);
            arvore.put(nome, filho);
        } else {
            System.out.println("Erro: Pai não encontrado.");
        }
    }

    public Nodo getRoot(){
        return root;
    }
}