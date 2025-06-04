import java.util.Arrays;
import java.util.Scanner;

public class B1873 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = scanner.nextInt();
            }
            Arrays.sort(arr);
            arr[0] ++;
            int sum = 1;
            for (int j = 0; j < arr.length; j++) {
                sum = sum * arr[j];
            }
            System.out.println(sum);
        }
    }
}
