package Codforces;

import java.util.Scanner;

public class A977_IncorrectSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Считываем входные данные: исходное число n и количество вычитаний k
        long n = scanner.nextLong();
        int k = scanner.nextInt();

        // Вызываем функцию для вычитания единицы k раз и сохраняем результат
        long result = subtractOneKTimes(n, k);

        // Выводим результат на экран
        System.out.println(result);
    }

    public static long subtractOneKTimes(long n, int k) {
        // Инициализируем переменную result значением n
        long result = n;

        // Запускаем цикл для выполнения k итераций
        for (int i = 0; i < k; i++) {
            // Проверяем последнюю цифру числа result
            if (result % 10 != 0) {
                // Если последняя цифра не равна нулю, уменьшаем число на единицу
                result--;
            } else {
                // Если последняя цифра равна нулю, удаляем её, разделив число на 10
                result /= 10;
            }
        }

        // Возвращаем результат после выполнения k вычитаний
        return result;
    }
}
