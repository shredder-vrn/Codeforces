import java.util.Scanner;
import java.math.BigInteger;

public class A1360 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            BigInteger a = scanner.nextBigInteger();
            BigInteger b = scanner.nextBigInteger();

            BigInteger max = a.max(b);
            BigInteger min = a.min(b);

            BigInteger sideOfSquare = max.max(min.multiply(BigInteger.valueOf(2)));

            BigInteger result = sideOfSquare.multiply(sideOfSquare);
            System.out.println(result);
        }
    }
}
