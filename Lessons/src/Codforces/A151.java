import java.util.Map;
import java.util.Scanner;

public class A151 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int l = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int p = scanner.nextInt();
        int nl = scanner.nextInt();
        int np = scanner.nextInt();

        int countGas = k * l;
        int countGasT = countGas / nl;
        int countDC = d * c;
        int countPNP = p / np;

        int res = Math.min(countGasT, Math.min(countDC, countPNP))/n;
        System.out.println(res);



    }
}
