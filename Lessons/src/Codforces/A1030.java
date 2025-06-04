import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A1030 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i ++){
            int number = scanner.nextInt();
            list.add(number);
        }
        System.out.println(s(n, list));
    }

    public static String s (int n, List<Integer> list) {
        String res;
        for (int i = 0; i < n; i++) {
            if (list.get(i) == 1){
                res = "HARD";
                return res;
            }
        }
        res = "EASY";
        return res;
    }
}
