import java.util.Scanner;

public class A500 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int place = scanner.nextInt();
        int[] arr = new int[n-1];

        for (int i = 0; i < arr.length; i++) {
            int num = scanner.nextInt();
            arr[i] = num;
        }

        int[] res = new int[n+1_000];

        res[0] = 1;

        int count;
        int placeRes = 1;
        for (int i = 0; i < res.length; i++) {
            if (i < arr.length){
                if (res[i] == 1){
                    res[i + arr[i]] = 1;
                    count = i+1;
                    placeRes = i + arr[i]+1;
                    if (i + arr[i]+1>=place){
                        if (count == place || placeRes == place){
                            System.out.println("YES");
                        } else {
                            System.out.println("NO");
                        }
                        break;
                    }else{
                        i = i + arr[i]-1;
                    }
                }
            } else {
                break;
            }

        }
    }
}