package Codforces;

import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong(); // Ширина площади
        long m = scanner.nextLong(); // Длина площади
        long a = scanner.nextLong(); // Размер одной плиты

        long totalTiles = calculateMinimumTiles(n, m, a);

        System.out.println(totalTiles);
    }

    // Метод для вычисления минимального количества плит
    private static long calculateMinimumTiles(long n, long m, long a) {
        long widthTiles = (n + a - 1) / a; // Округляем вверх
        long lengthTiles = (m + a - 1) / a; // Округляем вверх
        return widthTiles * lengthTiles;
    }
}