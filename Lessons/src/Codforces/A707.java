import java.util.Scanner;

public class A707 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();
        boolean check = true;
        for (int i = 0; i < n; i++) {
            if (check){
                String string = scanner.nextLine();
                String[] arrString = string.split(" ");
                for (int k = 0; k < arrString.length; k++) {
                    if (arrString[k].equals("C")||arrString[k].equals("M")||arrString[k].equals("Y")){
                        check = false;
                        break;
                    }
                }
            } else {
                break;
            }
        }
        if (check){
            System.out.println("#Black&White");
        } else {
            System.out.println("#Color");
        }
    }
}
