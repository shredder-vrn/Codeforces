import java.util.Scanner;

public class A1433 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int x = scanner.nextInt();
            int len;
            int num;
            int full = 1+2+3+4;
            if (x < 10){
                num = x;
                len = 1;
            } else if (x < 100){
                num = x%10;
                len = 2;
            } else if (x < 1000){
                num = x%10;
                len = 3;
            } else {
                num = x%10;
                len = 4;
            }

            int res = (num-1)*full + sum(len);

            System.out.println(res);
        }
    }
    public static int sum (int len){
        int res = 1;
        for (int i = 1; i < len; i++) {
            res = res + (i + 1);
        }
        return res;
    }
}
