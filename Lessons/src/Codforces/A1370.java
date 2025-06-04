import java.util.Arrays;
import java.util.Scanner;

public class A1370 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int min = Integer.MAX_VALUE;
        int[] arr = new int[t];
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            min = Math.min(min, n);
            arr[i] = n;
        }
        int res = 1;

        Arrays.sort(arr);
        for (int i = min; i >= 1; i--) {
            boolean check = true;
            for (int k = t-1; k >= 0; k--) {
                if (min%i == 0 && arr[k]%i == 0){
                    res = i;
                } else {
                    check = false;
                }
            }
            if (check){
                System.out.println(res);
                break;
            }
        }





    }
}
