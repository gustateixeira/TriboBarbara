package org.example;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ArvoreBarbaros {
    public List<Nodo> ultimaGeracao = new ArrayList<>();
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

    private void add0(String nomePai, String nome, int t) {
        Nodo pai = buscarNodo(nomePai);
        if (pai != null) {
            Nodo filho = new Nodo(nome, t);
            pai.addFilho(nome,filho);
            guerreiros.add(filho);
            filho.setProfundidade(pai.profundidade + 1);
        } else {
            System.out.println("Erro: Pai não encontrado.");
        }

    }

    public Nodo getRoot(){
        return root;
    }
    public boolean isEmpty(){
        return size == 0;
    }

    private Nodo buscarNodo(String nome){
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

    public String getGuerreiroMaisTerras(){
        String aux = "";
        int maior = 0;
        setUltimaGeracao();
        for(Nodo n : ultimaGeracao){
            if(n.terras > maior) {
                aux = n.NOME;
                maior = n.terras;
            }
        }
        return "Guerreiro da última geração que possui mais terras: " +  aux +  "\n" + "Quantidade de terras: " + maior;
    }
    public  void setUltimaGeracao(){
        int maior = 0;
        for(Nodo n : guerreiros){
            if(n.profundidade > maior){
                maior = n.profundidade;
            }
        }
        for(Nodo n : guerreiros){
            if(n.profundidade == maior)
                ultimaGeracao.add(n);
        }
    }
}
