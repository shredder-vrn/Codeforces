import java.util.List;
import java.util.Scanner;

public class A208 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        String[] ss = s.split("WUB");

        int count = 0;

        for (int i = 0; i < ss.length; i++) {
            if (ss[i] != ""){
                count++;
            }
        }
        int num = 0;
        String[] res = new String[count];
        for (int i = 0; i < ss.length; i++) {
            if (ss[i] != ""){
                num++;
                res[num-1] = ss[i];
                System.out.print(res[num-1] + " ");
            }

        }
    }
}
