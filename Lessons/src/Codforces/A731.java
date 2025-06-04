import java.util.Scanner;

public class A731 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        char[] arr = string.toCharArray();
        int count = 0;
        if (Math.abs('a'-arr[0]) > 13){
            count = count + (26 - (arr[0]-'a'));
        } else  if (Math.abs('a'-arr[0]) <= 13 && arr[0]!='a'){
            count = count + (arr[0]-'a');
        }
        for (int i = 1; i < arr.length; i++) {
            int max = Math.max(arr[i], arr[i-1]);
            int min = Math.min(arr[i], arr[i-1]);
            if (Math.abs(max-min) > 13){
                count = count + (26 - (max - min));
            } else if (Math.abs(max-min) <= 13 && max-min!=0){
                count = count + (max-min);
            }
        }

        System.out.println(count);
    }
}
