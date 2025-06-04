import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int S = scanner.nextInt();
        int N = scanner.nextInt();

        int[] weights = new int[N];

        for (int i = 0; i < N; i++) {
            weights[i] = scanner.nextInt();
        }

        boolean[] possibleWeights = new boolean[S + 1];
        possibleWeights[0] = true;

        for (int weight : weights) {
            for (int j = S - weight; j >= 0; j--) {
                if (possibleWeights[j]) {
                    possibleWeights[j + weight] = true;
                }
            }
        }

        int maxWeight = 0;
        for (int i = S; i >= 0; i--) {
            if (possibleWeights[i]) {
                maxWeight = i;
                break;
            }
        }

        System.out.println(maxWeight);
    }
}