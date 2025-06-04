import java.util.Scanner;

public class B158 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int countOne = 0;
        int countTwo = 0;
        int countThree = 0;
        int countFour = 0;
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num == 1){
                countOne++;
            } else if (num == 2) {
                countTwo++;
            } else if (num == 3) {
                countThree++;
            } else if (num == 4) {
                countFour++;
            }
        }
        int res = 0;
        res += countFour;
        res += countThree;
        countOne-=countThree;
        if (countOne<0){
            countOne=0;
        }
        int countTwoOst = countTwo%2;
        res+=countTwo/2;
        if(countTwoOst!= 0){
            countOne+=2;
        }
        if (countOne%4 != 0){
            res+=countOne/4;
            res++;
        } else {
            res+=countOne/4;
        }
        System.out.println(res);
    }
}
