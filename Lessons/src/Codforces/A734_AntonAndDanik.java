package Codforces;

import java.util.Scanner;

public class A734_AntonAndDanik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String winner = scanner.next();

        int Anton = 0;
        int Danik = 0;

        for (int i = 0; i < n; i++) {
            char symbol = winner.charAt(i);
            if (symbol == 'A') {
                Anton++;
            } else {
                Danik++;
            }
        }
        if (Anton > Danik) {
            System.out.println("Anton");
        } else if (Danik > Anton) {
            System.out.println("Danik");
        } else {
            System.out.println("Friendship");
        }
    }
}
