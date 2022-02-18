package questao2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Questao2Tests {
    @Test
    public void shouldPrint3ForGivenInput() {
        String str = "Ya3";
        int expected = 3;

        assertEquals(expected, Questao2.passwordVerifier(str));
    }

    @Test
    public void shouldPrintFalseForVerifySpecialCharacters() {
        String str = "Ya3";
        boolean expected = false;

        assertEquals(expected, Questao2.verifySpecialCharacters(str));
    }

    @Test
    public void shouldPrintTrueForVerifyUppercase() {
        String str = "Ya3";
        boolean expected = true;

        assertEquals(expected, Questao2.verifyUpperCaseLetter(str));
    }

    @Test
    public void shouldPrintFalseForVerifyLowercase() {
        String str = "Y2FHOIJAA3";
        boolean expected = false;

        assertEquals(expected, Questao2.verifyLowerCaseLetter(str));
    }

    @Test
    public void shouldPrintTrueForVerifyDigit() {
        String str = "Ya3";
        boolean expected = true;

        assertEquals(expected, Questao2.verifyDigit(str));
    }
}
