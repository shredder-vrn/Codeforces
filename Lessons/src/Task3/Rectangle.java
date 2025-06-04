package Task3;

public class Rectangle {
    public double x0;
    public double y0;
    public double width;
    public double height;

    public Rectangle(double x, double y, double width, double height) {
        this.x0 = x;
        this.y0 = y;
        this.width = width;
        this.height = height;
    }

    public boolean isPointInRectangle(double x, double y) {
        return x >= x0 && x <= x0 + width && y <= y0 && y >= y0 - height;
    }
}