import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A160 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(count(n, scanner));
    }
    public static int count (int n, Scanner scanner){
        int count = 0;
        int sum = 0;
        int sumMe = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int val = scanner.nextInt();
            list.add(val);
        }
        int num = 0;
        int [] sort = new int[list.size()];
        for (int i = 0; i < sort.length; i++){
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j)<min){
                    min = list.get(j);
                }
                if (list.get(j) == min){
                    num = j;
                }
            }
            list.remove(num);
            sort[i] = min;
        }
        int number = 0;
        int nunber = sort.length-1;
        for (int i = 0; i < sort.length; i++) {
            if (sumMe <= sum+sort[number]){
                sumMe += sort[nunber];
                count++;
                nunber--;
            } else {
                sum += sort[number];
                number++;
            }
        }
        return count;
    }
}
