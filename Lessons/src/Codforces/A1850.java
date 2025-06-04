import java.util.Scanner;

public class A1850 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            if (Math.max(a+b, Math.max(a+c, b+c))>=10){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
