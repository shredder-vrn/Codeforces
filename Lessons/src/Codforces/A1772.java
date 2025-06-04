import java.util.Scanner;

public class A1772 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < t; i++) {
            String string = scanner.nextLine();
            char[] arr = string.toCharArray();
            int res = arr[0] + arr[2] - 96;
            System.out.println(res);
        }
    }
}
