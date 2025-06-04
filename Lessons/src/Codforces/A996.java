import java.util.Scanner;

public class A996 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        char[] arr = s.toCharArray();
        int[] arrInt = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arrInt[i] = (int)arr[i] - 48;
        }

        int count = 0;
        int count2 = 0;
        int count3 = Integer.parseInt(s);

        if (arrInt[arrInt.length-1] >= 5){
            count++;
            count += arrInt[arrInt.length-1]%5;
        } else if (arrInt[arrInt.length-1] < 5){
            count += arrInt[arrInt.length-1];
        }
        if (arrInt.length > 1){
            if (arrInt[arrInt.length-2]>=2){
                count2 += arrInt[arrInt.length-2]/2;
                count2 += arrInt[arrInt.length-2]%2;
            } else if (arrInt[arrInt.length-2] < 2){
                count2 += arrInt[arrInt.length-2]%2;
            }
        }


        count3 = count3 - (count3%100);
        count3 = count3/100;

        System.out.println(count + count2 + count3);
    }
}
