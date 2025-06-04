import java.util.Locale;
import java.util.Scanner;

public class A1703 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            arr[i] = s.toLowerCase();
            if (arr[i].equals("yes")){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
