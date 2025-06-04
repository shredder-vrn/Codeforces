import java.util.Arrays;
import java.util.Scanner;

public class B34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);

        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        int res = 0;
        for (int i = 0; i < m; i++){
            if (arr[arr.length-1-i]<0){
                res +=arr[arr.length-1 - i];
            }
        }
        System.out.println(Math.abs(res));
    }
}
