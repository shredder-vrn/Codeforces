import java.util.Arrays;
import java.util.Scanner;

public class B1472 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = scanner.nextInt();
            }
            Arrays.sort(arr);
            int sumR = 0;
            int sumL = 0;
            int l=0;
            int r=arr.length-1;
            for (int j = 0; j < arr.length; j++){
                if (sumL+arr[l]<=sumR){
                    sumL = sumL + arr[r];
                    r--;
                } else {
                    sumR = sumR + arr[r];
                    r--;
                }
            }
            if (sumR == sumL){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
