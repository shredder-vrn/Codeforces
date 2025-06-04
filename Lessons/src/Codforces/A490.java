import java.util.Scanner;

public class A490 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int[] indexOne = new int[n];
        int count1 = 0;
        int[] indexTwo = new int[n];
        int count2 = 0;
        int[] indexThree = new int[n];
        int count3 = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] == 1){
                indexOne[count1] = i;
                count1++;
            }
            if (arr[i] == 2){
                indexTwo[count2] = i;
                count2++;
            }
            if (arr[i] == 3){
                indexThree[count3] = i;
                count3++;
            }
        }
        int countRes = Math.min(count1, Math.min(count2, count3));
        System.out.println(countRes);
        for (int i = 0; i < countRes; i++) {
            System.out.print(indexOne[i]+1+" ");
            System.out.print(indexTwo[i]+1+" ");
            System.out.println(indexThree[i]+1+" ");
        }
    }
}
