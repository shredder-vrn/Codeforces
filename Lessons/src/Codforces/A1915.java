import java.util.Scanner;

public class A1915 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            if (a==b){
                System.out.println(c);
            }
            if (a==c){
                System.out.println(b);
            }
            if (c== b){
                System.out.println(a);
            }
        }
    }
}
