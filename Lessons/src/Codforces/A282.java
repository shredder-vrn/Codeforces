package Codforces;

import java.util.Scanner;

public class A282 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int n = scanner.nextInt();
         scanner.nextLine();

         int x = 0;

         for (int i = 0; i < n; i++) {
             String sentence = scanner.nextLine();
             if (sentence.contains("++")) {
                 x++;
             } else {
                 x--;
             }
         }
        System.out.println(x);
    }
}
