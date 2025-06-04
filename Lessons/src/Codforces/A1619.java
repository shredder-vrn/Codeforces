import java.util.Scanner;

public class A1619 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < t; i++) {
            String string = scanner.nextLine();
            char [] arr = string.toCharArray();
            if (arr.length%2 == 1){
                System.out.println("NO");
            } else {
                int c = arr.length/2;
                boolean check = true;
                for (int j = 0; j < c; j++) {
                    if (arr[j] != arr[c+j]){
                        System.out.println("NO");
                        check = false;
                        break;
                    }
                }
                if (check){
                    System.out.println("YES");
                }
            }
        }
    }
}
