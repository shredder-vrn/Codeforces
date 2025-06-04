package Codforces;

import java.util.Scanner;

public class A546_SoldiersAndBananas {
    public static void main(String[] args) {
        // Создание объекта Scanner для считывания ввода
        Scanner scanner = new Scanner(System.in);

        // Считывание стоимости первого банана (k), доступных долларов (n) и количества бананов (w)
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        int w = scanner.nextInt();

        // Инициализация переменных для долга, стоимости последнего банана и общей стоимости
        int debt = 0;
        int lastBananaCost = k * w;
        int totalCost = (k + lastBananaCost) * w / 2;

        // Проверка, нужно ли солдату одолжить деньги
        if (totalCost > n) {
            // Вычисление долга как разницы между общей стоимостью и доступными деньгами
            debt = totalCost - n;
        } else {
            // Если денег достаточно, долг остается равным нулю
            debt = 0;
        }

        // Вывод долга солдата
        System.out.println(debt);
    }
}
