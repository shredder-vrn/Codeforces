import java.util.Scanner;

public class A122 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(s(s));
    }

    public static String s (String s){
        String res;
        char [] c = s.toCharArray();
        if ((Integer.parseInt(s) % 4) == 0 || Integer.parseInt(s)%7 == 0 || Integer.parseInt(s)%47 == 0||Integer.parseInt(s)%74 == 0||Integer.parseInt(s)%447 == 0||Integer.parseInt(s)%477 == 0){
            return "YES";
        } else {
            for (int i = 0; i < c.length; i++){
                if (c[i] != '4' && c[i] != '7'){
                    res = "NO";
                    return res;
                }
            }
            res = "YES";
            return res;
        }
    }
}
