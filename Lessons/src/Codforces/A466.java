import java.util.Scanner;

public class A466 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        long costSeasonTicket = b/m;

        int countS = n%m;
        int countA = n/m;

        if (a <= costSeasonTicket){
            System.out.println(a*n);
        } else if (costSeasonTicket < a && a*countS <= b) {
            System.out.println(b*countA + a*countS);
        } else if (costSeasonTicket < a && b < a* countS){
            System.out.println(b*countA + b);
        }
    }
}
