import java.util.Scanner;

public class A443 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String ss = s.toLowerCase();
        char [] arr = ss.toCharArray();
        int[] res = new int[26];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 97 && arr[i] <= 122){
                res[arr[i]-97] = 1;
            }
        }
        int count = 0;
        for (int i = 0; i < res.length; i++) {
            if (res[i] == 1){
                count++;
            }
        }
        System.out.println(count);
    }
}
