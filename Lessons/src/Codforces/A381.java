import java.util.Scanner;

public class A381 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            arr[i] = num;
        }

        int left = 0;
        int right = n-1;

        int firstSum = 0;
        int secondSum = 0;
        for (int i = 0; i < n; i++) {
            if (i%2 == 0){
                if (arr[left] >= arr[right]){
                    firstSum += arr[left];
                    left++;
                } else {
                    firstSum += arr[right];
                    right--;
                }
            } else {
                if (arr[left] >= arr[right]){
                    secondSum += arr[left];
                    left++;
                } else {
                    secondSum += arr[right];
                    right--;
                }
            }
        }
        System.out.println(firstSum);
        System.out.println(secondSum);
    }
}
