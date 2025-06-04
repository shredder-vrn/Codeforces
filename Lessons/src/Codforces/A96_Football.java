package Codforces;

import java.util.Scanner;

public class A96_Football {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Считываем строку, представляющую последовательность игроков
        String players = scanner.nextLine();

        // Инициализируем счетчик, который будет отслеживать действия подряд
        int count = 1;

        // Инициализируем переменную для отслеживания максимального значения счетчика
        int maxCount = 1;

        // Проходим по строке, начиная со второго элемента (индекс 1)
        for (int i = 1; i < players.length(); i++) {
            // Проверяем, является ли текущий игрок таким же, как предыдущий
            if (players.charAt(i) == players.charAt(i - 1)) {
                // Если да, увеличиваем счетчик
                count++;
            } else {
                // Если нет, сбрасываем счетчик до 1, так как началась новая последовательность
                count = 1;
            }

            // Обновляем максимальное значение счетчика, если текущее значение больше
            if (count > maxCount) {
                maxCount = count;
            }
        }

        // Проверяем, достиг ли максимальный счетчик значения 7 или более
        if (maxCount >= 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
