import java.util.Scanner;

public class A133 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();

        char [] arr = string.toCharArray();

        boolean check = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'H' || arr[i] == 'Q' || arr[i] == '9'){
                System.out.println("YES");
                check = true;
                break;
            }
        }
        if (!check){
            System.out.println("NO");
        }

    }
}
