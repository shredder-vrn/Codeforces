package Codforces;

import java.util.Scanner;

public class A266_StonesOnTheTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Считываем количество камней на столе
        int n = scanner.nextInt();
        scanner.nextLine();  // считываем перевод строки после числа

        // Считываем строку, представляющую цвета камней
        String colors = scanner.nextLine();

        // Переменная для подсчета минимального количества камней для удаления
        int stonesToRemove = 0;

        // Проходим по строке цветов камней
        for (int i = 1; i < n; i++) {
            // Проверяем, равны ли текущий камень и предыдущий
            if (colors.charAt(i) == colors.charAt(i - 1)) {
                // Если цвета одинаковы, увеличиваем счетчик
                stonesToRemove++;
            }
        }

        // Выводим минимальное количество камней для удаления
        System.out.println(stonesToRemove);
    }
}
