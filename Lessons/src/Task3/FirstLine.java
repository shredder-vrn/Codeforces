package Task3;

public class FirstLine {
    public double b;
    public double k;

    public FirstLine(double b, double k)
    {
        this.b = b;
        this.k = k;
    }

    public boolean isPointAboveFirstLine(double x, double y)
    {
        return y > k * x + b;
    }
}
