package Codforces;

import java.util.Scanner;

public class C1294_TheProductOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // количество наборов входных данных
        int[] inputs = new int[t]; // массив для хранения входных данных

        // Считываем все наборы входных данных
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt(); // число из текущего набора входных данных
            inputs[i] = n;
        }

        // Выводим ответы на все наборы данных
        for (int i = 0; i < t; i++) {
            String result = solve(inputs[i]);
            System.out.println(result);
        }
    }

    // Функция для решения задачи
    static String solve(int n) {
        if (n < 24) {
            return "NO";
        }

        for (int a = 2; a * a * a <= n; a++) {
            if (n % a == 0) {
                for (int b = a + 1; b * b <= n / a; b++) {
                    if (n % b == 0) {
                        int c = n / (a * b);
                        if (c != a && c != b && a * b * c == n) {
                            return "YES\n" + a + " " + b + " " + c;
                        }
                    }
                }
            }
        }
        return "NO";
    }
}
