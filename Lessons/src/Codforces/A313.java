import java.util.Scanner;

public class A313 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        char[] arr = string.toCharArray();
        boolean check = true;
        int num;
        if (arr.length == 0){
        }
        else if (arr.length == 2 && arr[0] == '-'){
            System.out.println(0);
        }
        else if (arr.length >= 3 && arr[0] == '-'){
            num = Math.max(arr[arr.length-1], arr[arr.length-2]);
            String res = "";
            for (int i = 0; i < arr.length; i++) {
                if (i<arr.length-2){
                    res = res+arr[i];
                } else if (i == arr.length-2 && (arr[i] != num || arr[i] == arr[i+1]) && check) {
                    res = res+arr[i];
                    check = false;
                } else if (i == arr.length-1 && arr[i] != num && check) {
                    res = res+arr[i];
                    check = false;
                }

            }
            if (res.equals("-0")){
                res = "0";
            }
            System.out.println(res);
        }
        else if (arr.length >= 1){
            System.out.println(string);
        }
    }
}
