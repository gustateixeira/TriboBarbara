package org.example;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class AppTest {
    @Test
    public void getTerrasTest()
    {
        Barbaro b = new Barbaro("Pedro", 5);
        int actual = 5;
        int expected = b.terras;
        assertEquals(expected, actual);
    }
}
