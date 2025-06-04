import java.util.Scanner;

public class A732 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int price = scanner.nextInt();
        int coin = scanner.nextInt();

        int sum = 0;

        boolean check = true;


        if (coin/price >= 1&&coin%price == 0) {
            check = false;
            System.out.println(coin/price);
        }
        if (check) {
            while ((sum + coin) % price != 0) {
                sum += 10;
                if (sum % price == 0) {
                    System.out.println(sum / price);
                    break;
                }
                if ((sum + coin) % price == 0) {
                    sum += coin;
                    System.out.println(sum / price);
                    break;
                }
            }
        }
    }
}
