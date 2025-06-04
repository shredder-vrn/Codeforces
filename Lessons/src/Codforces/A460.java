import java.util.Scanner;

public class A460 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            count++;
            if (count%m == 0) {
                n++;
            }
        }
        System.out.println(n);
    }
}
