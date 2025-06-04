import java.util.Scanner;

public class A467 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int n = scanner.nextInt();
scanner.nextLine();
System.out.println(c(n, scanner));
}
public static int c (int n, Scanner scanner){
int count = 0;
for (int i = 0; i < n; i++) {
String rooms = scanner.nextLine();
String [] res = rooms.split(" ");
if (Integer.parseInt(res[0]) <= Integer.parseInt(res[1])-2) {
count++;
}
}
return count;
}
}
