import java.util.Scanner;

public class A1328 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int count = 0;
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (a%b != 0){
                int res = b-a%b;
                System.out.println(res);
            } else {
                int res = 0;
                System.out.println(res);
            }
        }
    }
}
