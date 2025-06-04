import java.util.Arrays;
import java.util.Scanner;

public class A1512 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            int[] arr = new int[num];
            int[] res = new int[num];
            for (int j = 0; j < num; j++) {
                int numScanner = scanner.nextInt();
                arr[j] = numScanner;
                res[j] = numScanner;
            }
            int check;
            Arrays.sort(arr);
            if (arr[0] == arr[1]){
                check = arr[arr.length-1];
            } else {
                check = arr[0];
            }
            for (int j = 0; j < num; j++) {
                if (res[j] == check){
                    System.out.println(j+1);
                    break;
                }
            }
        }
    }
}
