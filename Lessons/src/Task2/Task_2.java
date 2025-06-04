package Task2;

import java.util.Scanner;

public class Task_2
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите букву первой клетки");
        String a1 = scan.nextLine();
        char s1 = a1.charAt(0);
        int x1 = ((int) s1) - 96;
        System.out.println("Введите букву последней клетки");
        String a2 = scan.nextLine();
        char s2 = a2.charAt(0);
        int x2 = ((int) s2) - 96;

        System.out.println("Введите номер первой клетки:");
        int y1 = scan.nextInt();
        System.out.println("Введите номер последней клетки:");
        int y2 = scan.nextInt();

        if (x1 > 0 && x1 < 9 && x2 > 0 && x2 < 9 && y1 > 0 && y1 < 9 && y2 > 0 && y2 < 9)
        {
            if(x1 == x2 && (y2 - y1) == 1)
            {
                System.out.println("Пешка");
            }
            if((x1 == x2 && y1 != y2) || (x1 != x2 && y1 == y2))
            {
                System.out.println("Ладья");
            }
            if(Math.abs(x1 - x2) == Math.abs(y1 - y2))
            {
                System.out.println("Слон");
            }
            if(((x1 == x2 && y1 != y2) || (x1 != x2 && y1 == y2)) || (Math.abs(x1 - x2) == Math.abs(y1 - y2)))
            {
                System.out.println("Ферзь");
            }
            if(((Math.abs(x1 - x2) == Math.abs(y1 - y2)) && Math.abs(y1-y2) == 1) || (((x1 == x2 && y1 != y2) || (x1 != x2 && y1 == y2)) && Math.abs(y1-y2) == 1) || (((x1 == x2 && y1 != y2) || (x1 != x2 && y1 == y2)) && Math.abs(x1-x2) == 1))
            {
                System.out.println("Король");
            }
            if((Math.abs(x1 - x2) == 1 && Math.abs(y1 - y2) == 2) || (Math.abs(x1 - x2) == 2 && Math.abs(y1 - y2) == 1))
            {
                System.out.println("Конь");
            }
            else
            {
                System.out.println("Если поле пустое, значит такую фигуру пока не придумали...");
            }
        }
    }
}