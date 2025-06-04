import java.util.Scanner;

public class A705 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            if (i%2 == 0 && i != n-1){
                System.out.print("I hate that ");
            } else if (i%2 == 0 && i == n-1) {
                System.out.print("I hate it ");
            }else if (i%2 == 1 && i != n-1) {
                System.out.print("I love that ");
            }else {
                System.out.print("I love it ");
            }
        }
    }
}
