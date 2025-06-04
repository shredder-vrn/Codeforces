package Codforces;

import java.util.Scanner;

public class A791_MishkaAndBigBrother {
    public static void main(String[] args) {
        // Создаем объект Scanner для считывания ввода с клавиатуры
        Scanner scanner = new Scanner(System.in);

        // Считываем два целых числа a и b с клавиатуры
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // Инициализируем переменную years (годы) нулем, это будет счетчиком для подсчета лет

        int years = 0;

        // Начинаем цикл, который будет выполняться, пока Мишка (a) не станет старше своего брата (b)
        for (int i = 0; a <= b; i++) {
            // Увеличиваем возраст Мишки на величину a (эффект утроения возраста)
            a = a + a + a;

            // Увеличиваем возраст брата на величину b (эффект удвоения возраста)
            b = b + b;

            // Увеличиваем счетчик years на 1, так как прошел один год
            years ++;
        }

        // После завершения цикла выводим количество лет, необходимых Мишке, чтобы стать старше своего брата
        System.out.println(years);
    }
}