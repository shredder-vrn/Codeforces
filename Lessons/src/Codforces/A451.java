import java.util.Scanner;

public class A451 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        String firstRes = "Malvika";
        String secondRes = "Akshat";

        int minCountStep = Math.min(n, m);

        if (minCountStep%2 == 0){
            System.out.println(firstRes);
        } else {
            System.out.println(secondRes);
        }
    }
}
