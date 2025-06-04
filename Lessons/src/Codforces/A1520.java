import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A1520 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            scanner.nextLine();
            String string = scanner.nextLine();
            char[] arr = string.toCharArray();
            List<String> list = new ArrayList<>();
            list.add(String.valueOf(arr[0]));
            for (int j = 1; j < arr.length; j++) {
                if(arr[j-1] != arr[j]){
                    list.add(String.valueOf(arr[j]));
                }
            }
            boolean check = true;
            boolean check2 = true;
            for (int j = 0; j < list.size()-1; j++) {
                if (check2) {
                    for (int k = 1; k < list.size(); k++) {
                        if (k>j){
                            if (list.get(j).equals(list.get(k))) {
                                System.out.println("NO");
                                check = false;
                                check2 = false;
                                break;
                            }
                        }else{
                            k = j;
                        }
                    }
                } else {
                    break;
                }
            }
            if (check){
                System.out.println("YES");
            }
        }
    }
}
