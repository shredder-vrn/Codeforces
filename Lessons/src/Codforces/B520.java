import java.util.Scanner;

public class B520 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int firstRes = Integer.MAX_VALUE;

        int firstN = n;
        while (firstN < m){
            firstN = firstN*2;
            firstRes++;
        }
        firstRes = firstRes + (firstN-m);

        System.out.println();
    }
}
