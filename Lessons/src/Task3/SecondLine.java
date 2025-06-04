package Task3;

public class SecondLine {
    public double b;
    public double k;

    public SecondLine(double b, double k)
    {
        this.b = b;
        this.k = k;
    }

    public boolean isPointAboveSecondLine(double x, double y)
    {
        return y > k * x + b;
    }
}
