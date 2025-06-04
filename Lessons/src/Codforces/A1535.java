import java.util.Scanner;

public class A1535 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int s1 = scanner.nextInt();
            int s2 = scanner.nextInt();
            int s3 = scanner.nextInt();
            int s4 = scanner.nextInt();
            int max1 = Math.max(s1, s2);
            int min1 = Math.min(s1, s2);
            int max2 = Math.max(s3, s4);
            int min2 = Math.min(s3, s4);
            if (min1 > max2 || min2 > max1) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
