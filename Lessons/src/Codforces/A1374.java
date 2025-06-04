import java.util.Scanner;

public class A1374 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int n = scanner.nextInt();

            int num = n%x;
            int num2 = n/x;

            if (y == num && num2 != 0){
                System.out.println(num2*x+y);
            } else if (x > n && y == 0){
                System.out.println(0);
            } else {
                if ((num2)*x+y <= n){
                    System.out.println((num2)*x+y);
                } else {
                    System.out.println((num2-1)*x+y);
                }

            }
        }
    }
}
