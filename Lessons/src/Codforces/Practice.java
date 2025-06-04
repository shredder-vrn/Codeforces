package Codforces;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        int maxCount = 0;

        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            count = count - x + y;
            maxCount = Math.max(maxCount, count);
        }
        System.out.println(maxCount);
    }
}