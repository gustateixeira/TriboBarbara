package org.example;

import java.util.HashMap;
import java.util.Map;

public class Nodo
{
    public int terras;
    public Nodo pai;
    public String barbaro;
    Map<String, Nodo> children;

    public Nodo(Nodo pai, String barbaro, int terras)
    {
        this.barbaro = barbaro;
        this.pai = pai;
        this.terras = terras;
        this.children = new HashMap<>();
    }

}
