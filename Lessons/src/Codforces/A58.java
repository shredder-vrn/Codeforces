import java.util.Scanner;

public class A58 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        System.out.println(string(s));
    }

    public static String string (String s) {
        String res = "";
        char [] arr = s.toCharArray();
        int h = 0;
        int e = 0;
        int l = 0;
        int l2 = 0;
        for (char c : arr) {
            if (h == 0 && c == 'h') {
                h++;
            } else if (h > 0 && c == 'e'&& e == 0) {
                e++;
            } else if (e > 0 && c == 'l' && l == 0){
                l++;
            } else if (l > 0 && c == 'l' && l2 == 0) {
                l2++;
            } else if (l2 > 0 && c == 'o' ) {
                res = "YES";
                return res;
            }
        }
        res = "NO";
        return res;
    }
}
