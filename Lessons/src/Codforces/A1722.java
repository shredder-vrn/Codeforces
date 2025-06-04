import java.util.Arrays;
import java.util.Scanner;

public class A1722 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int t =  scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int num = scanner.nextInt();
            scanner.nextLine();
            String string = scanner.nextLine();
            char[] arr = string.toCharArray();
            Arrays.sort(arr);
            String res = "";
            for (int j = 0; j < arr.length; j++) {
                res = res + arr[j];
            }
            if (res.equals("Timru")){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
