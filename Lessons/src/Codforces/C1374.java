import java.util.Scanner;

public class C1374 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            scanner.nextLine();
            String string = scanner.nextLine();
            char[] arrString = string.toCharArray();
            int countClose = 0;
            for (int j = 0; j < arrString.length/2; j++) {
                if (arrString[j] == ')'){
                    countClose++;
                }
            }
            System.out.println(countClose);
        }
    }
}
