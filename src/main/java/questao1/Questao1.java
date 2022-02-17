package questao1;

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a number: ");
        int n = sc.nextInt();

        System.out.println(printStair(n));
    }

    public static String printStair(int n) {
        int counter = 1;
        String stair = "";

        for (int k = 0; k < n; k++) {
            for (int i = 1; i <= n - counter; i++) {
                stair += " ";
            }

            for (int j = 0; j < counter; j++) {
                stair += "*";
            }

            counter++;

            if (!(k == n - 1)) stair += "\n";
        }

        return stair;
    }
}
