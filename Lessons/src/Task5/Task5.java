package Task5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите высоту (h): ");
        int h = scanner.nextInt();

        System.out.print("Введите ширину (w): ");
        int w = scanner.nextInt();

        printFigure(h, w);
    }
    public static void printFigure(int h, int w) {
        if (w % 2 != 0 || w < 2 || h < 2) {
            System.out.println("Неверные параметры.");
            return;
        }

        // Верхняя граница
        System.out.print("+");
        for (int i = 0; i < w - 2; i++) {
            System.out.print("-");
        }
        System.out.println("+");

        // Центральная часть
        int rowsPerGroup = 1; // Строки в каждой группе
        int upGroup = 0;
        int groupCounter = 0; // Счетчик групп
        boolean isLeftAligned = true; // Флаг для определения положения звезд

        int totalStars = (w - 2); // Общее количество звезд в строке

        for (int i = 0; i < h - 2; i++) {
            if (w == 2) {
                System.out.println("||");
            } else {
                System.out.print("|");
                for (int j = 0; j < w - 2; j++) {
                    if (isLeftAligned && j < totalStars / 2) {
                        System.out.print("*");
                    } else if (!isLeftAligned && j >= totalStars / 2) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println("|");
            }
            groupCounter++;

            // Меняем положение звезд после каждой группы строк и увеличиваем число строк после каждой группы
            if (groupCounter >= rowsPerGroup) {
                isLeftAligned = !isLeftAligned; // Инвертируем флаг положения
                groupCounter = 0; // Сбрасываем счетчик группы
                upGroup ++; // Задаём границу, переступая которую, число строк в группе увеличивается
                if (upGroup != 0 && upGroup % 2 ==0) {
                    rowsPerGroup ++; // Увеличиваем число строк внутри каждой следующей группы
                }
            }
        }

        // Нижняя граница
        System.out.print("+");
        for (int i = 0; i < w - 2; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}