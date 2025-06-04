package Task6;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        int n = scanner.nextInt();
        double e = scanner.nextDouble();
        double eDividedBy10 = e / 10.0;

        double sum = 0.0;
        double sumE = 0.0;
        double sumEDividedBy10 = 0.0;

        for (int i = 0; i <= n; i++) {
            double term = calculateTerm(i, x);
            sum += term;

            if (Math.abs(term) > e) {
                sumE += term;
            }

            if (Math.abs(term) > eDividedBy10) {
                sumEDividedBy10 += term;
            }
        }

        double mathFunctionResult = Math.pow(2, x);

        System.out.println("Сумма n слагаемых: " + sum);
        System.out.println("Сумма слагаемых, больших e: " + sumE);
        System.out.println("Сумма слагаемых, больших e/10: " + sumEDividedBy10);
        System.out.println("Значение функции с использованием Math: " + mathFunctionResult);
    }

    // Метод для вычисления каждого отдельного слагаемого
    private static double calculateTerm(int n, double x) {
        double ln2 = Math.log(2);
        double numerator = Math.pow(ln2, n) * Math.pow(x, n);
        double denominator = factorial(n);
        return numerator / denominator;
    }

    // Метод для вычисления факториала
    private static double factorial(int n) {
        if (n == 0 || n == 1) {
            return 1.0;
        } else {
            double result = 1.0;
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }
}