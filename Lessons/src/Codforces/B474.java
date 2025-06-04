import java.util.Scanner;

public class B474 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < arr2.length; i++) {
            int count = 1;
            int sum = 0;
            arr2[i] = scanner.nextInt();
            boolean check = true;
            for (int j = 0; j < arr.length; j++) {
                sum += arr[j];
                if (arr2[i]>sum){
                    count++;
                } else {
                    System.out.println(count);
                    check = false;
                    break;
                }
            }
            if (check){
                count--;
                System.out.println(count);
            }
        }
    }
}
