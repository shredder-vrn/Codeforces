import java.util.Scanner;

public class A131 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        char[] arr = s.toCharArray();

        boolean checkOne = true;
        boolean checkTwo = true;

        if (arr.length == 1 && arr[0] >= 65 && arr[0] <= 90){
            checkOne = false;
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[0] >= 97 && arr[0] <= 122 && arr[i] >= 65 && arr[i] <= 90){

            } else {
                checkOne = false;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 65 && arr[i] <= 90){

            } else {
                checkTwo = false;
            }
        }

        String ss = "";
        if (checkOne){
            ss += (char)(arr[0] - 32);
            for (int i = 1; i < arr.length; i++) {
                ss += (char)(arr[i]+32);
            }
            System.out.println(ss);
        }
        if (checkTwo){
            System.out.println(s.toLowerCase());
        }
        if (!checkOne && !checkTwo){
            System.out.println(s);
        }
    }
}
