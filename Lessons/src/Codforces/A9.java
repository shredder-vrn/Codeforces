import java.util.Scanner;

public class A9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Y = scanner.nextInt();
        int W = scanner.nextInt();

        int count = 6 - Math.max(Y, W)+1;
        if (count == 1){
            System.out.println("1/6");
        } else if (count == 2){
            System.out.println("1/3");
        } else if (count == 3){
            System.out.println("1/2");
        } else if (count == 4){
            System.out.println("2/3");
        } else if (count == 5){
            System.out.println("5/6");
        } else if (count == 6){
            System.out.println("1/1");
        } else {
            System.out.println("0/1");
        }
    }
}
