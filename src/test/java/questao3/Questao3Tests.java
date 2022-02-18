package questao3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Questao3Tests {
    @Test
    public void shouldPrint2ForOvoInputAnagram() {
        String str = "ovo";
        int expected = 2;

        assertEquals(expected, Questao3.searchAnagram(str));
    }

    @Test
    public void shouldPrint3ForifailuhkqqInput() {
        String str = "ifailuhkqq";
        int expected = 3;

        assertEquals(expected, Questao3.searchAnagram(str));
    }
}
