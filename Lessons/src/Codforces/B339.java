import java.util.Scanner;

public class B339 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] arr = new int[m];

        for (int i = 0; i < m; i++) {
            arr[i] = scanner.nextInt();
        }

        long sum = arr[0]-1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i-1]){

            } else if (arr[i] < arr[i-1]){
                sum += (n-arr[i-1] + arr[i]);
            } else if (arr[i] > arr[i]-1){
                sum += (arr[i]-arr[i-1]);

            }
        }

        System.out.println(sum);

    }
}
