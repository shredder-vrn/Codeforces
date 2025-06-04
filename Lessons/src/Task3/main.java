package Task3;

import java.util.Scanner;

public class main {
    public static final FirstLine firstLine = new FirstLine(3, 0.5);
    public static final SecondLine secondLine = new SecondLine(0, 0);
    public static final ThirdLine thirdLine = new ThirdLine(-2, 0);
    public static final FirstHorizontalParabola firstHorizontalParabola = new FirstHorizontalParabola(-1, -1, -0.5);
    public static final SecondHorizontalParabola secondHorizontalParabola = new SecondHorizontalParabola(-5, 2, 1 / 9D);
    public static final Rectangle rectangle = new Rectangle(-2, 2, 2, 8);

    public static void main(String[] args) {
        checkInputPoint();
    }
    public static void checkInputPoint() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите x: ");
        double x = scanner.nextDouble();
        System.out.print("Введите y: ");
        double y = scanner.nextDouble();
        checkPoint(x, y);
    }
    public static void checkPoint(double x, double y) {
        System.out.println(getColor(x, y));
    }
    public static SimpleColor getColor(double x, double y) {
        if (firstHorizontalParabola.isPointAboveFirstParabola(x, y)) {
            if (secondHorizontalParabola.isPointAboveSecondParabola(x, y)) {
                if (firstLine.isPointAboveFirstLine(x, y)) {
                    return SimpleColor.GREEN;
                }
                if (!firstLine.isPointAboveFirstLine(x, y)){
                    if (rectangle.isPointInRectangle(x, y)){
                        return SimpleColor.WHITE;
                    }
                }
                return SimpleColor.ORANGE;
            }
            if (rectangle.isPointInRectangle(x, y)){
                if (secondHorizontalParabola.isPointAboveSecondParabola(x, y)){
                    return SimpleColor.WHITE;
                }
                return SimpleColor.ORANGE;
            }
        }
        if (firstLine.isPointAboveFirstLine(x, y)){
            if (!firstHorizontalParabola.isPointAboveFirstParabola(x, y)){
                if (!secondHorizontalParabola.isPointAboveSecondParabola(x, y)){
                    return SimpleColor.GREEN;
                }
                return SimpleColor.BLUE;
            }
            return SimpleColor.BLUE;
        }
        if (!firstLine.isPointAboveFirstLine(x, y)){
            if (!firstHorizontalParabola.isPointAboveFirstParabola(x, y)) {
                if (secondHorizontalParabola.isPointAboveSecondParabola(x, y)) {
                    return SimpleColor.GRAY;
                }
                if (!secondHorizontalParabola.isPointAboveSecondParabola(x, y)) {
                    if (rectangle.isPointInRectangle(x, y)){
                        return SimpleColor.BLUE;
                    }
                    if (!rectangle.isPointInRectangle(x, y)){
                        return SimpleColor.WHITE;
                    }
                }
            }
            if (!rectangle.isPointInRectangle(x, y)){
                if (firstHorizontalParabola.isPointAboveFirstParabola(x, y)) {
                    if (!secondHorizontalParabola.isPointAboveSecondParabola(x, y)){
                        if (secondLine.isPointAboveSecondLine(x, y)){
                            if (thirdLine.isPointAboveThirdLine(x, y)){
                                return SimpleColor.BLUE;
                            }
                            if (!thirdLine.isPointAboveThirdLine(x, y)){
                                return SimpleColor.WHITE;
                            }
                        }
                        if (!secondLine.isPointAboveSecondLine(x, y)){
                            return SimpleColor.BLUE;
                        }
                    }
                }
            }
        }
        return SimpleColor.RED;
    }
}