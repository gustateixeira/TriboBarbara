package org.example;

import java.util.HashMap;
import java.util.Map;

public class Nodo
{
    public int terras;
    public Nodo pai;
    public final String NOME;
    Map<String, Nodo> children;

    public Nodo(Nodo pai, String nome, int terras)
    {
        this.NOME = nome;
        this.pai = pai;
        this.terras = terras;
        this.children = new HashMap<>();
    }

}
