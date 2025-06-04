import java.util.Scanner;

public class B1676 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t  = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                arr[j] = scanner.nextInt();
                min = Math.min(arr[j], min);
            }
            int sum = 0;
            for (int j = 0; j < arr.length; j++) {
                sum = sum + arr[j]-min;
            }
            System.out.println(sum);
        }
    }
}
