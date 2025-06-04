import java.util.Scanner;

public class B363 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = scanner.nextInt();
        int minSum = Integer.MAX_VALUE;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            arr[i] = num;
        }
        int res=arr[0];
        boolean start = true;
        int sum = 0;
        int newSum = 0;

        if (start){
            for (int j = 0; j < count; j++) {
                sum += arr[j];
                minSum = sum;
                res = 0;
                newSum = sum;
            }
        }

        for (int i = 0; i < arr.length-count; i++) {
            newSum = newSum-arr[i]+arr[i+count];
            if (newSum < minSum){
                minSum = newSum;
                res = i+1;
            }
        }
        System.out.println(res+1);
    }
}
