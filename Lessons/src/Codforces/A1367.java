import java.util.Scanner;

public class A1367 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            String string = scanner.nextLine();
            char[] arr = string.toCharArray();
            String res = "";
            for (int j = 0; j < arr.length; j++) {
                if (j%2 == 1){

                } else {
                    res = res + arr[j];
                }
                if (j == arr.length-1){
                    res = res + arr[j];
                }
            }
            System.out.println(res);
        }
    }
}
