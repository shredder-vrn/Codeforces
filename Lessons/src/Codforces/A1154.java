import java.util.Arrays;
import java.util.Scanner;

public class A1154 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[4];

        for (int i = 0; i < arr.length; i++) {
            int x = scanner.nextInt();
            arr[i] = x;
        }

        Arrays.sort(arr);

        for (int i = 0; i < arr.length-1; i++) {
            System.out.println(arr[3] - arr[i]);
        }
    }
}
