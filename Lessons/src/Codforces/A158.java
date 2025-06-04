package Codforces;

import java.util.Scanner;

public class A158 {
    // Метод для вычисления количества участников, выходящих в следующий раунд
    public static int countNextRoundParticipants(int[] scores, int k) {
        int thresholdScore = scores[k - 1];
        int count = 0;
        for (int score : scores) {
            if (score >= thresholdScore && score > 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Считываем n и k
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        // Считываем баллы участников
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = scanner.nextInt();
        }

        // Вызываем метод для вычисления количества участников
        int result = countNextRoundParticipants(scores, k);

        // Выводим результат
        System.out.println(result);
    }
}