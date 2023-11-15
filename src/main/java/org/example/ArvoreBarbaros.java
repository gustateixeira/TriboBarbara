package org.example;

import java.util.ArrayList;
import java.util.List;

public class ArvoreBarbaros {

    public List<Nodo> guerreiros = new ArrayList<>();
    private int size;

    public Nodo root;

    public ArvoreBarbaros(String root, int terras_root) {
        this.root = new Nodo(root, terras_root);
        guerreiros.add(this.root);
        size++;
    }

    public void add(String nomePai, String nomeFilho, int terrasConquistadas) {
        add0(nomePai, nomeFilho, terrasConquistadas);
    }

    public void add0(String nomePai, String nome, int t) {
        Nodo pai = buscarNodo(nomePai);
        if (pai != null) {
            Nodo filho = new Nodo(nome, t);
            pai.addFilho(nome,filho);
            guerreiros.add(filho);
            size++;
        } else {
            System.out.println("Erro: Pai não encontrado.");
        }
    }

    public Nodo getRoot(){
        return root;
    }

    public String toString() {
        String aux = "";
        for (Nodo nodo : guerreiros) {
            aux += "Nome: " + nodo.NOME + ", Terras: " + nodo.terras + "\n";
        }
        return aux;
    }
    public int getSize(){
        return size;
    }
    public boolean isEmpty(){
        return size == 0;
    }

    public Nodo buscarNodo(String nome){
        for(Nodo n : guerreiros){
            if(n.NOME.equals(nome))
                return n;
        }
        return null;
    }

    public void repassarTerras(Nodo guerreiro) {
        int totalFilhos = guerreiro.children.size();

        for (Nodo filho : guerreiro.children.values()) {
            int terrasRepassadas = guerreiro.terras / totalFilhos;
            filho.terras += terrasRepassadas;
        }
        if(totalFilhos != 0){
            guerreiro.terras = 0;
        }
    }
}
