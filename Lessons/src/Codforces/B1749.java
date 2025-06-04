import java.util.Arrays;
import java.util.Scanner;

public class B1749 {
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
            boolean check = true;
            for (int j = 1; j < arr.length; j++) {
                if (arr[j]>arr[j-1]){

                } else {
                    check = false;
                    break;
                }
            }
            if (check){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }
}
