
/**
 * Refers to a single point on the Cartesian plane.
 * Do not change this code.
 *
 * @author R Jamieson
 */
public class Point
{
    private double x, y;

    /**
     * Constructor: create this Point with the given x and y values.
     */
    public Point(double xVal, double yVal)
    {
        x = xVal;
        y = yVal;
    }

    // access private variables
    public double getX()
    {
        return x;
    }
    public double getY()
    {
        return y;
    }
    
    // once a Point is made, it can't be changed.
    // if you want to change a Point, instead create a new Point
    // with the desired values.
}
