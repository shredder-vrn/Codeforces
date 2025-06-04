import java.util.Scanner;

public class A1624 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                int num = scanner.nextInt();
                max = Math.max(max, num);
                min = Math.min(min, num);
            }
            System.out.println(max-min);
        }
    }
}
