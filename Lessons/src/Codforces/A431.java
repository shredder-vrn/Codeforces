import java.util.Scanner;

public class A431 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int a3 = scanner.nextInt();
        int a4 = scanner.nextInt();
        scanner.nextLine();

        String string = scanner.nextLine();

        char[] arr = string.toCharArray();

        int res = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '1'){
                res += a1;
            } else if (arr[i] == '2'){
                res += a2;
            } else if(arr[i] == '3'){
                res += a3;
            } else {
                res += a4;
            }
        }

        System.out.println(res);

    }
}
