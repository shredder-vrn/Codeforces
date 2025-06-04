import java.util.Arrays;
import java.util.Scanner;

public class B1360 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in);
        int t  = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int [] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = scanner.nextInt();
            }
            Arrays.sort(arr);
            int min = arr[1]-arr[0];
            for (int j = 2; j < arr.length; j++) {
                min = Math.min(min, arr[j]-arr[j-1]);
            }
            System.out.println(min);
        }
    }
}
