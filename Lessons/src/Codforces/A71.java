package Codforces;

import java.util.Scanner;

public class A71 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Читаем количество слов
        int n = scanner.nextInt();
        scanner.nextLine(); // Читаем перевод строки

        // Создаем массив для хранения результатов
        String[] results = new String[n];

        // Обрабатываем каждое слово
        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine().trim(); // Считываем слово и удаляем лишние пробелы

            // Если слово слишком длинное, заменяем его аббревиатурой
            if (word.length() > 10) {
                String abbreviation = word.charAt(0) + String.valueOf(word.length() - 2) + word.charAt(word.length() - 1);
                results[i] = abbreviation;
            } else {
                results[i] = word; // Если слово не слишком длинное, добавляем его без изменений
            }
        }

        // Выводим результат
        for (String result : results) {
            System.out.println(result);
        }
    }
}
