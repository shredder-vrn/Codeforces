import java.util.Scanner;

public class A379 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < a; i++) {
            count++;
            if (count%b == 0){
                a++;
            }
        }
        System.out.println(count);
    }
}
