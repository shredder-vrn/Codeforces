import java.util.Scanner;

public class B1367 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();

            int countN2 = 0;
            int countN1 = 0;

            int countReplace = 0;

            int firstNum = 0;

            for (int j = 0; j < n; j++) {
                int num = scanner.nextInt();
                firstNum = num;
                if (num%2 == 0 && j%2 == 0){
                    countN2++;
                }
                if (num%2 == 0 && j%2 == 1){
                    countReplace++;
                    countN2++;
                }
                if (num%2 == 1 && j%2 == 0){
                    countReplace++;
                    countN1++;
                }
                if (num%2 == 1 && j%2 == 1){
                    countN1++;
                }
            }
            if (n > 1){
                if (n%2 == 0){
                    if (countN1==countN2 || countReplace==0){
                        System.out.println(countReplace/2);
                    }else{
                        System.out.println(-1);
                    }
                }
                if (n%2 == 1){
                    if (Math.max(countN1, countN2) - Math.min(countN1, countN2) == 1 || countReplace==0){
                        if (countReplace%2 == 0) {
                            System.out.println(countReplace/2);
                        } else {
                            System.out.println(-1);
                        }

                    }else{
                        System.out.println(-1);
                    }
                }
            } else {
                if (firstNum%2 == 0){
                    System.out.println(0);
                } else {
                    System.out.println(-1);
                }
            }


        }
    }
}
