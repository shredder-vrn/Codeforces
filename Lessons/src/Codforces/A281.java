package Codforces;

import java.util.Scanner;

public class A281 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        // Проверяем, что слово не пустое
        if (!word.isEmpty()) {
            // Преобразуем первую букву в верхний регистр и оставляем остальные буквы неизменными
            String capitalizedWord = word.substring(0, 1).toUpperCase() + word.substring(1);
            System.out.println(capitalizedWord);
        }
    }
}
