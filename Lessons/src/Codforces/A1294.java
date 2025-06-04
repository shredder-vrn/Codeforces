import java.util.Scanner;

public class A1294 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int n = scanner.nextInt();
            int max = Math.max(a, Math.max(b, c));
            int min = Math.min(a, Math.min(b, c));
            int middle = a+b+c-max-min;
            int first = max-min;
            int second = max - middle;
            if (first+second <= n && (n-first-second)%3 == 0){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }
}
