import java.util.Scanner;

public class A703 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (a>b){
                count++;
            } else if (a<b){
                count--;
            }
        }
        if (count>0){
            System.out.println("Mishka");
        } else if (count<0){
            System.out.println("Chris");
        } else {
            System.out.println("Friendship is magic!^^");
        }
    }
}
