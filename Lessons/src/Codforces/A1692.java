import java.util.Scanner;

public class A1692 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();
            int count = 0;
            if (b>a){
                count++;
            }
            if (c>a){
                count++;
            }
            if (d>a){
                count++;
            }
            System.out.println(count);
        }
    }
}
