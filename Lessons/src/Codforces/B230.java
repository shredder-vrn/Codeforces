import java.util.Scanner;

public class B230 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean check = true;

        for (int i = 0; i < n; i++) {

        }
        for (int i = 0; i < n; i++) {
            Long num = scanner.nextLong();
            int count = 1;
            for (int j = 1; j <= num; j++) {
                if(num % j == 0){
                    num = num/j;
                    count++;
                    if (count > 3){
                        check = false;
                        break;
                    }
                    if (j >= num){
                        count--;
                        break;
                    }
                }
            }
            if (count < 3){
                check = false;
            }

            if (check){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            check = true;
        }
    }
}
