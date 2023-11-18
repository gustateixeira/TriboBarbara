package org.example;
import static org.junit.Assert.assertEquals;
import org.junit.Test;



public class AppTest {

    @Test
    public void isEmptyTest(){
        ArvoreBarbaros a = new ArvoreBarbaros("Jose", 10);
        boolean actual = false;
        boolean expected = a.isEmpty();
        assertEquals(expected, actual);
    }
    @Test
    public void getRootTest(){
        ArvoreBarbaros a = new ArvoreBarbaros("Jose", 10);
        Nodo actual = a.root;
        Nodo expected = a.getRoot();
        assertEquals(expected, actual);
    }
    @Test
    public void repassarTerrasTest(){
        ArvoreBarbaros a = new ArvoreBarbaros("Jose", 103787);
        a.add("Jose", "Pedro", 4626);
        a.add("Jose", "Luiz", 3530);
        a.add("Pedro", "Lucio", 10);
        Nodo nodo = a.buscarNodo("Jose");
        Nodo n = a.buscarNodo("Pedro");
        Nodo j = a.buscarNodo("Lucio");
        a.repassarTerras(nodo);
        a.repassarTerras(n);
        int expected = j.terras;
        int actual = 56519 + 10;
        assertEquals(expected, actual);
    }
    @Test
    public void paiTest(){
        ArvoreBarbaros a = new ArvoreBarbaros("Jose", 10);
        a.add("Jose", "Pedro", 10);
        a.add("Pedro", "Joao", 10);
        Nodo pedro = a.guerreiros.get(1);
        Nodo jose = a.guerreiros.get(0);
        Nodo joao = a.guerreiros.get(2);
        boolean expected = jose.children.containsKey(pedro.NOME);
        boolean actual = true;
        assertEquals(expected, actual);
    }
    @Test
    public void getProfundidadeTest(){
        ArvoreBarbaros a = new ArvoreBarbaros("Jose", 10);
        a.add("Jose", "Pedro", 10);
        a.add("Pedro", "Joao", 10);
        a.add("Pedro", "Jeferson", 10);
        Nodo n = a.buscarNodo("Joao");
        int expected = n.profundidade;
        int actual = 2;
        assertEquals(expected, actual);
    }

}
