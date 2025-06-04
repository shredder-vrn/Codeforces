import java.util.Scanner;
import java.util.function.LongBinaryOperator;

public class A61 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numOne = scanner.nextLine();
        String numTwo = scanner.nextLine();

        char [] arrOne = numOne.toCharArray();
        char [] arrTwo = numTwo.toCharArray();
        int [] res =  new int [arrTwo.length];
        for (int i = 0; i < arrTwo.length; i++) {
            if (arrOne[i] != arrTwo[i]){
                res[i] = 1;
            } else {
                res[i] = 0;
            }
            System.out.print(res[i]);
        }

    }
}
