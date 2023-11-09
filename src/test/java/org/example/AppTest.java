package org.example;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class AppTest {

    @Test
    public void isEmptyTest() {
        Nodo n = new Nodo(null, "José", 1000);
        ArvoreBarbaros arvore = new ArvoreBarbaros(n);
        arvore.add(n, "Adrielson", 100);
        boolean actual = false;
        boolean expected = arvore.isEmpty();
        assertEquals(expected, actual);
    }

}
