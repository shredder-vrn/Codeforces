package Codforces;

import java.util.Scanner;

public class A231 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Считываем количество задач
        int n = scanner.nextInt();

        // Считываем информацию о задачах и определяем, сколько задач они будут реализовывать
        int count = 0;
        for (int i = 0; i < n; i++) {
            int petyaOpinion = scanner.nextInt();
            int vasyaOpinion = scanner.nextInt();
            int tonyOpinion = scanner.nextInt();

            // Проверяем, сколько из друзей уверены в решении задачи
            int confidentFriends = petyaOpinion + vasyaOpinion + tonyOpinion;

            // Если как минимум двое уверены, добавляем задачу к числу, которые они будут реализовывать
            if (confidentFriends >= 2) {
                count++;
            }
        }

        // Выводим количество задач, которые будут реализовывать
        System.out.println(count);
    }
}
