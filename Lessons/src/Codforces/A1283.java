import java.util.Scanner;

public class A1283 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int h = scanner.nextInt();
            int m = scanner.nextInt();
            System.out.println(24*60-h*60-m);
        }
    }
}
