import java.util.HashMap;
import java.util.Scanner;

public class A228 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < 4; i++) {
            int key = scanner.nextInt();
            map.put(key, map.getOrDefault(key, 0)+1);
        }

        int count = 4 - map.size();
        System.out.println(count);
    }
}
