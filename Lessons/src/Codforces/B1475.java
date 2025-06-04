import java.util.Scanner;

public class B1475 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int num = scanner.nextInt();
            int count = num/2020;
            int ost = num%2020;
            if (ost <=count){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
