import java.util.Scanner;

public class C1352 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int count = n-1;
            int countN = k/count;
            int countM;
            if (k%count != 0){
                countM = k/count;
            } else {
                countM = k/count-1;
            }

            int ost = k%count;
            int res;
            if (k < n){
                res = k;
                System.out.println(res);
            } else {
                res = count*countN + countM + ost;
                System.out.println(res);
            }
        }
    }
}
