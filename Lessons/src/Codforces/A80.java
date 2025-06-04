import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A80 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        List<Integer> list = isSimpleNumber(100);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == n && list.get(i+1) == m){
                System.out.println("YES");
                break;
            } else  if (list.get(i) == n && list.get(i+1) != m){
                System.out.println("NO");
                break;
            }
        }
    }
    public static List<Integer> isSimpleNumber (int num){
        int[] arr = new int[num];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            arr[i] = i+1;
        }
        for (int i = 2; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (arr[j] % i == 0 && arr[j] != i) {
                    arr[j] = 0;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=0){
                list.add(i+1);
            }
        }
        return list;
    }
}
