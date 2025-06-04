import java.util.Scanner;

public class A270 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            double n = 2.0 / (1 - (double) a / 180);
            if (Math.abs(n - Math.round(n)) < 1e-9) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
