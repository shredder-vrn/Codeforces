package Codforces;

import java.util.Scanner;

public class A112 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstString = scanner.nextLine().toLowerCase();
        String secondString = scanner.nextLine().toLowerCase();

        int result = firstString.compareTo(secondString);
        if (result < 0) {
            System.out.println("-1");
        } else if (result > 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
        scanner.close();
    }
}
