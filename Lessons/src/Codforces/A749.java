import java.util.Scanner;

public class A749 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 2;
        int b = 3;
        int countA = 0;
        int countB = 0;
        if (n%2 == 1){
            n = n-b;
            countB++;
        }
        countA = n/2;

        System.out.println(countA+countB);
        for (int i = 0; i < countA; i++) {
            System.out.print(2 + " ");
        }
        for (int i = 0; i < countB; i++) {
            System.out.println(3);
        }
    }
}
