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
    public void herancaTerras(){
            for(Nodo nodos : arvore.values()){
                herancaTerrasRecursivo(nodos, nodos.terras);
            }

    }

    private void herancaTerrasRecursivo(Nodo n, int terras){
        int filhos = n.children.size();
        if(filhos > 0 ) {
            int terrasRepassadas = terras / filhos;
            for (Nodo node : arvore.values()) {
                node.terras += terrasRepassadas;
                herancaTerrasRecursivo(node, terrasRepassadas);
            }
            n.terras = 0;
        }
    }

    public String toString(){
        String aux = "";
        for(Nodo node : arvore.values()){
            aux += "Nome: " + node.NOME + " N de terras: "+ node.terras +  "\n";
        }
        return aux;

    }



}