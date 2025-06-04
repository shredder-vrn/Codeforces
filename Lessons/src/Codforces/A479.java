import java.util.Scanner;

public class A479 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int sum = a+b+c;
        int sp = a+b*c;
        int ssp = (a+b)*c;
        int ps = a*b+c;
        int pss = a*(b+c);
        int ppp = a*b*c;

        int res =  Math.max(sum, Math.max(sp, Math.max(ssp, Math.max(ps, Math.max(pss, ppp)))));
        System.out.println(res);

    }
}
