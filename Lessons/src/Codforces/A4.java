package Codforces;

import java.util.Scanner;

public class A4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Считываем вес арбуза
        int w = scanner.nextInt();

        // Проверяем, можно ли поделить арбуз так, чтобы обе части имели четный вес
        if (w >= 4 && (w % 2 == 0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
