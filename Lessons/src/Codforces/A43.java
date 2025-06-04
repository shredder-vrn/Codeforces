import java.util.Scanner;

public class A43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        int count1 = 1;
        int count2 = 0;

        String[] arrString = new String[n];

        for (int i = 0; i < n; i++) {
            String s1 = scanner.nextLine();
            arrString[i] = s1;
        }

        String name1 = arrString[0];
        String name2 = "";

        for (int i = 1; i < arrString.length; i++) {
            if (arrString[i].equals(arrString[0])){
                count1++;
            } else {
                count2++;
                name2 = arrString[i];
            }
        }

        if (count1>count2){
            System.out.println(name1);
        } else {
            System.out.println(name2);
        }
    }
}
