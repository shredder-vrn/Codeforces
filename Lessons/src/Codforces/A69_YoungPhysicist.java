package Codforces;

import java.util.Scanner;

public class A69_YoungPhysicist {
    public static void main(String[] args) {
        // Создаем объект Scanner для ввода данных с клавиатуры
        Scanner scanner = new Scanner(System.in);

        // Считываем количество векторов сил
        int n = scanner.nextInt();

        // Инициализируем суммы координат
        int sumX = 0;
        int sumY = 0;
        int sumZ = 0;

        // Считываем координаты каждого вектора силы и добавляем их к суммам
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();

            sumX = sumX + x;
            sumY = sumY + y;
            sumZ = sumZ + z;
        }

        // Проверяем, является ли сумма координат нулевым вектором
        if (sumX == 0 && sumY == 0 && sumZ == 0) {
            // Если сумма равна нулю, выводим "YES"
            System.out.println("YES");
        } else {
            // Иначе выводим "NO"
            System.out.println("NO");
        }
    }
}
