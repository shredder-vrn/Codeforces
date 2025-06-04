import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class A469 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String numOne = scanner.nextLine();
        String numTwo = scanner.nextLine();
        String s = numOne + " " + numTwo;

        String[] ss = s.split(" ");

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < ss.length; i++) {
            list.add(Integer.parseInt(ss[i]));
        }

        Collections.sort(list);

        for (int i = 0; i < ss.length; i++) {
            if (i < list.size()-1){
                if (list.get(i) == list.get(i+1)){
                    list.remove(i+1);
                    i--;
                };
            }
        }
        if (list.get(0) == 0){
            list.remove(0);
        }
        if (list.size() >= n && list.get(list.size()-1) == n && n != 3 && n != 6) {
            System.out.println("I become the guy.");
        } else  {
            System.out.println("Oh, my keyboard!");
        }

        /*if (list.get(list.size()-1) < n){
            System.out.println("Oh, my keyboard!");
        } else {
            System.out.println("I become the guy.");
        }*/
    }
}
