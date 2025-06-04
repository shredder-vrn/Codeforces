import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Stream;

public class A520 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String s = scanner.nextLine();

        String lowerCase = s.toLowerCase();

        char [] arr = lowerCase.toCharArray();

        String res1 = "YES";
        String res2 = "NO";

        char[] arrRes = new char[26];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>=97 && arr[i]<= 122){
                arrRes[arr[i]-97] = arr[i];
            }
        }

        for (int i = 0; i < arrRes.length; i++) {
            if (arrRes[i] < 97){
                System.out.println(res2);
                break;
            } else if (i==arrRes.length-1 && arrRes[arrRes.length-1]>97) {
                System.out.println(res1);
            }
        }
    }
}
