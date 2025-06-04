import java.util.Scanner;

public class Codeforces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int test = 0; test < t; test++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int l = scanner.nextInt();

            int result = countUniqueKValues(a, b, l);
            System.out.println(result);
        }
    }

    public static int countUniqueKValues(int a, int b, int l) {
        int result = 0;
        for (int k = 1; k * k <= l; k++) {
            if (l % k == 0) {
                int m = l / k;
                if (l % (k * m) == 0 && gcd(k, m) % a == 0 && lcm(k, m) % b != 0) {
                    result++;
                }
            }
        }
        return result * 2;
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static int lcm(int a, int b) {
        return a / gcd(a, b) * b;
    }
}
