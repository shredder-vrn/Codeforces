package Codforces;

import java.util.HashSet;  // Импорт класса для работы с множествами
import java.util.Scanner;  // Импорт класса для считывания ввода пользователя
import java.util.Set;      // Импорт класса для работы с множествами

public class A236_AYoungManAndAGirl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Создаем объект Scanner для считывания ввода с клавиатуры
        String username = scanner.next();          // Считываем строку (имя пользователя) с клавиатуры и сохраняем в переменной username

        Set<Character> uniqueChars = new HashSet<>();  // Создаем множество для хранения уникальных символов

        // Проходим по каждому символу в имени пользователя и добавляем его в множество uniqueChars
        for (char c : username.toCharArray()) {
            uniqueChars.add(c);
        }

        // Проверяем, является ли количество уникальных символов четным или нечетным
        if (uniqueChars.size() % 2 == 0) {
            System.out.println("CHAT WITH HER!");  // Если четное, выводим "IGNORE HIM!" (пользователь мужского пола)
        } else {
            System.out.println("IGNORE HIM!");  // Если нечетное, выводим "CHAT WITH HER!" (пользователь женского пола)
        }
    }
}