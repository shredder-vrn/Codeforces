package Codforces;

import java.util.Scanner;

import java.util.Arrays;

public class A339 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Вводим сумму через сканнер
        String s = scanner.nextLine();

        // Разделяем входную строку на слагаемые
        String[] summands = s.split("\\+");

        // Преобразуем слагаемые в числа
        int[] numbers = new int[summands.length];
        for (int i = 0; i < summands.length; i++) {
            numbers[i] = Integer.parseInt(summands[i]);
        }

        // Сортируем слагаемые по возрастанию
        Arrays.sort(numbers);

        // Формируем новую сумму в виде строки
        StringBuilder newSum = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            newSum.append(numbers[i]);
            if (i < numbers.length - 1) {
                newSum.append("+");
            }
        }

        // Выводим новую сумму
        System.out.println(newSum.toString());

        // Закрываем сканнер
        scanner.close();
    }
}
