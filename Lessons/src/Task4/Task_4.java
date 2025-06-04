package Task4;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = getInput(scanner);

        int tribonacciNext = findNextTribonacci(n);
        System.out.println("Наименьшее число трибонначи, большее или равное " + n + " это " + tribonacciNext);
    }

    public static int getInput(Scanner scanner) {
        System.out.println("Введите число n: ");
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            System.out.println("Ошибка! Пожалуйста, введите целое число.");
            scanner.next(); // Очистка ввода
            return getInput(scanner); // Рекурсивный вызов для повторного ввода
        }
    }

    public static int findNextTribonacci(int n) {
        int tribonacci1 = 0;
        int tribonacci2 = 0;
        int tribonacci3 = 1;
        int tribonacciNext = 0;

        while (tribonacciNext < n) {
            tribonacciNext = tribonacci1 + tribonacci2 + tribonacci3;
            tribonacci1 = tribonacci2;
            tribonacci2 = tribonacci3;
            tribonacci3 = tribonacciNext;
        }

        return tribonacciNext;
    }
}
