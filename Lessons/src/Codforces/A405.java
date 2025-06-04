import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class A405 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        scanner.nextLine();

        String s = scanner.nextLine();

        ArrayList<Integer> list = new ArrayList<>();

        String [] r = s.split(" ");

        for (int i = 0; i < r.length; i++) {
            list.add(Integer.parseInt(r[i]));
        }

        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
