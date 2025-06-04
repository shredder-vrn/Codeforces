package Codforces;

import java.util.Scanner;

public class A50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int M = scanner.nextInt();
        int N = scanner.nextInt();

        int maxDominos = calculateMaximumDominos(M, N);

        System.out.println(maxDominos);
    }
    private static int calculateMaximumDominos(int M, int N) {
        return (M*N)/2;
    }
}
