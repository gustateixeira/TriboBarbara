package org.example;

import java.util.HashMap;
import java.util.Map;

public class Nodo
{
    public int terras;

    public final String NOME;
    Map<String, Nodo> children;

    public Nodo(String nome, int terras)
    {
        this.NOME = nome;
        this.terras = terras;
        this.children = new HashMap<>();
    }
    public void addFilho(String nomeFilho, Nodo n){
        children.put(nomeFilho, n);
    }

}
