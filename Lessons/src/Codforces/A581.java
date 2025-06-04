import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class A581 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int l = scanner.nextInt();

        int[] res = new int[2];
        res[0] = r;
        res[1] = l;

        Arrays.sort(res);

        int countFirst = res[0];

        System.out.println(countFirst);

        if (res[0]+res[1] %2 != 0){
            int countSecond = (res[1]-res[0])/2;
            System.out.println(countSecond);
        }
        if (res[0]+res[1] %2 == 0){
            int countSecond = (res[1]-res[0]-1)/2;
            System.out.println(countSecond);
        }
    }
}
