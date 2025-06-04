import java.util.Scanner;

public class A1475 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            long num = scanner.nextLong();
            if (num%2==1){
                System.out.println("Yes");
            } else {
                while (num%2 == 0){
                    num = num/2;
                }
                if (num == 1){
                    System.out.println("No");
                } else {
                    System.out.println("Yes");
                }
            }
        }
    }
}
