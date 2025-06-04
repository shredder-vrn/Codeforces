package Codforces;

import java.util.Scanner;

public class A118_ExerciseOnStrings {
    public static void main(String[] args) {
        // Создаем объект Scanner для считывания ввода с клавиатуры
        Scanner scanner = new Scanner(System.in);
        // Считываем входную строку с клавиатуры и сохраняем её в переменной input
        String input = scanner.nextLine();
        // Вызываем функцию processString для обработки строки
        String result = processString(input);
        // Выводим результат на экран
        System.out.println(result);
    }

    // Функция для обработки входной строки
    public static String processString(String input) {
        // Создаем объект StringBuilder для построения результирующей строки
        StringBuilder output = new StringBuilder();
        // Строка, содержащая гласные буквы
        String vowels = "AEIOUYaeiouy";

        // Проходим по каждому символу входной строки
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            // Проверяем, является ли текущий символ гласной буквой
            if (vowels.indexOf(currentChar) == -1) {
                // Если текущий символ - согласная буква, добавляем точку перед ней
                output.append('.');
                // Преобразуем согласную букву в строчный регистр и добавляем к результату
                output.append(Character.toLowerCase(currentChar));
            }
        }

        // Преобразуем объект StringBuilder в строку и возвращаем результат
        return output.toString();
    }
}
