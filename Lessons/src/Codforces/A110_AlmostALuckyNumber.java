package Codforces;  // Пакет, в котором находится класс

import java.util.Scanner;  // Импорт класса Scanner из пакета java.util

public class A110_AlmostALuckyNumber {  // Объявление класса
    public static void main(String[] args) {  // Точка входа в программу
        Scanner scanner = new Scanner(System.in);  // Создание объекта Scanner для ввода
        String number = scanner.nextLine();  // Считывание строки из консоли

        int count = 0;  // Инициализация счетчика

        for (int i = 0; i < number.length(); i++) {  // Цикл по символам в строке
            char symbol = number.charAt(i);  // Получение символа по индексу
            if (symbol == '4' || symbol == '7') {  // Проверка на цифры 4 или 7
                count++;  // Увеличение счетчика, если символ - 4 или 7
            }
        }

        if ((count == 4 || count == 7)) {  // Проверка на почти счастливое число
            System.out.println("YES");  // Вывод "YES", если условие выполнено
        } else {
            System.out.println("NO");  // Вывод "NO", если условие не выполнено
        }
    }
}