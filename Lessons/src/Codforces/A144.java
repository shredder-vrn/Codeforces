import java.util.Scanner;

public class A144 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int k = scanner.nextInt();
            arr[i] = k;
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int maxI = Integer.MAX_VALUE;
        int minI = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= min){
                min = Math.min(min, arr[i]);
                minI = i;
            }
            if (arr[i] > max){
                max = Math.max(max, arr[i]);
                maxI = i;
            }
        }
        if (maxI>minI){
            System.out.println(maxI+(n-1-minI)-1);
        }else{
            System.out.println(maxI+(n-1-minI));
        }
    }
}
