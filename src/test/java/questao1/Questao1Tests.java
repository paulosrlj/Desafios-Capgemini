package questao1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Questao1Tests {
    @Test
    public void shouldPrintStairsCorrectely() {
        int n = 6;
        String expected = """
                     *
                    **
                   ***
                  ****
                 *****
                ******""";

        assertEquals(expected, Questao1.printStair(n));
    }
}
