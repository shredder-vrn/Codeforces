import java.util.Scanner;

public class B1399 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            long countC = 0;
            int n = scanner.nextInt();
            long[] arr1 = new long[n];
            long min1 = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                arr1[j] = scanner.nextLong();
                min1 = Math.min(arr1[j], min1);
            }
            long[] arr2 = new long[n];
            long min2 = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                arr2[j] = scanner.nextLong();
                min2 = Math.min(min2, arr2[j]);
            }
            for (int j = 0; j < n; j++) {
                countC += Math.max(arr1[j]-min1, arr2[j]-min2);
            }
            System.out.println(countC);

        }
    }
}
