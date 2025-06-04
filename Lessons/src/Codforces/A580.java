import java.util.Scanner;

public class A580 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];

        int count = 1;
        int countMax = count;

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 1; i < n; i++) {
            if (arr[i] >= arr[i-1]){
                count++;
                countMax = Math.max(countMax, count);
            } else {
                count = 1;
            }
        }

        System.out.println(countMax);

    }
}
