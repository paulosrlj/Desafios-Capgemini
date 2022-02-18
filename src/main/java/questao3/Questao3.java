package questao3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type a word to verify the anagrams pairs: ");
        String word = sc.next();
        int amountPairs = searchAnagram(word);

        System.out.println(amountPairs);
    }

    static int searchAnagram(String word) {
        HashMap<String, Integer> anagrams = new HashMap<>();
        word = word.toLowerCase();

        for (int i = 0; i < word.length(); i++) {
            for (int j = i; j < word.length(); j++) {
                char[] charArr = word.substring(i, j + 1).toCharArray();

                Arrays.sort(charArr);
                String str = new String(charArr);

                if (anagrams.containsKey(str)) anagrams.put(str, anagrams.get(str) + 1);
                else anagrams.put(str, 1);
            }
        }
        int counter = 0;
        for (String key : anagrams.keySet()) {
            int n = anagrams.get(key);
            counter += (n * (n - 1)) / 2;
        }

        return counter;
    }
}
