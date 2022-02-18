package questao2;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a password: ");
        String password = sc.nextLine();

        int result = passwordVerifier(password);
        System.out.println(result);
    }

    public static int passwordVerifier(String password) {
        int counter = 0;

        if (!verifyDigit(password)) counter++;

        if (!verifyLowerCaseLetter(password)) counter++;

        if (!verifyUpperCaseLetter(password)) counter++;

        if (!verifySpecialCharacters(password)) counter++;

        if (password.length() < 6) counter += 6 - password.length() - counter;

        return counter;
    }

    public static boolean verifyDigit(String str) {
        String[] digits = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};

        for (String s : digits) {
            if (str.contains(s)) return true;
        }

        return false;
    }

    public static boolean verifyLowerCaseLetter(String str) {
        char[] characters = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            characters[i] = str.charAt(i);
        }

        for (char c : characters) {
            if (Character.isLowerCase(c)) return true;
        }

        return false;
    }

    public static boolean verifyUpperCaseLetter(String str) {
        char[] characters = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            characters[i] = str.charAt(i);
        }

        for (char c : characters) {
            if (Character.isUpperCase(c)) return true;
        }

        return false;
    }

    public static boolean verifySpecialCharacters(String str) {
        String[] specialCharacters = {"!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "-", "+"};

        for (String s : specialCharacters) {
            if (str.contains(s)) return true;
        }

        return false;
    }
}
