package Codforces;

import java.util.Scanner;

public class A59_Word {
    public static void main(String[] args) {
        // Создание объекта Scanner для чтения строки с клавиатуры
        Scanner scanner = new Scanner(System.in);
        // Чтение строки
        String s = scanner.nextLine();

        // Инициализация счетчиков для букв верхнего и нижнего регистра
        int uppercaseCount = 0;
        int lowercaseCount = 0;
        // Объявление строки для хранения результата
        String caseString;

        // Цикл для обхода каждого символа в строке
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            // Проверка, является ли символ буквой верхнего регистра
            if (Character.isUpperCase(currentChar)) {
                uppercaseCount++;
            } else {
                // Если символ не является буквой верхнего регистра, увеличиваем счетчик нижнего регистра
                lowercaseCount++;
            }
        }

        // Преобразование строки на основе количества букв верхнего и нижнего регистра
        if (uppercaseCount > lowercaseCount) {
            caseString = s.toUpperCase();
        } else {
            caseString = s.toLowerCase();
        }

        // Вывод результата
        System.out.println(caseString);
    }
}
