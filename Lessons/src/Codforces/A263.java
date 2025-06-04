package Codforces;

import java.util.Scanner;

public class A263 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Чтение входных данных и поиск положения единицы
        int targetRow = 0;
        int targetColumn = 0;
        for (int i = 0; i < 5; i++) {
            String row = scanner.nextLine();
            String[] elements = row.split(" ");
            for (int j = 0; j < 5; j++) {
                int element = Integer.parseInt(elements[j]);
                if (element == 1) {
                    targetRow = i;
                    targetColumn = j;
                }
            }
        }

        // Рассчитываем минимальное количество действий с учетом движения только вертикально или горизонтально
        int verticalMoves = Math.abs(targetRow - 2);
        int gorizontalMoves = Math.abs(targetColumn-2);


        // Выводим результат
        System.out.println(verticalMoves + gorizontalMoves);
    }
}