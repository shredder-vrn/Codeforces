package Task3;

public class ThirdLine {
    public double b;
    public double k;

    public ThirdLine(double b, double k)
    {
        this.b = b;
        this.k = k;
    }

    public boolean isPointAboveThirdLine(double x, double y)
    {
        return x > k * y + b;
    }
}
