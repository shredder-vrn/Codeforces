package Codforces;

import java.util.HashMap;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        HashMap<String, Integer> db = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String query = scanner.next();
            if (db.getOrDefault(query, -1) == -1) {
                db.put(query, 0);
                System.out.println("OK");
            } else {
                do {
                    db.put(query, db.get(query) + 1);
                } while (db.getOrDefault(query + db.getOrDefault(query, 0), -1) != -1);
                System.out.println(query + db.get(query));
            }
        }
    }
}
