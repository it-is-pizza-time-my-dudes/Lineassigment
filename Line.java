/*
@Author Justin Houston
@Version 0.0.1
the line class hold info that a line can have and all methods
related to it
 */
import java.lang.Math;
public class Line {
    // class variables
    private double slope;
    private double yintercept;
    private Point point;
    private double yfactor;
    private double xfactor;

    // constructors
    public Line(double x_factor, double y_factor, double y_intercept) {
        yfactor = y_factor;
        xfactor = x_factor;
        yintercept = y_intercept / yfactor;
        slope = yfactor / xfactor;
        point = new Point(1, slope);
    }

    public Line(double Slope, Point Point) {
        slope = Slope;
        point = Point;
        yintercept = point.getY() - (point.getX() * slope);
        yfactor = 1;
        xfactor = slope;
    }

    public Line(double Slope, double y_intercept) {
        slope = Slope;
        yintercept = y_intercept;
        point = new Point(1, yintercept + slope);
        yfactor = 1;
        xfactor = slope;
    }

    public Line(Point point1, Point point2) {
        point = point1;
        if (point1 == point2) {
            slope = 0;
        } else {
            slope = (point2.getY() - point1.getY() / (point2.getX() - point1.getY()));
        }
        yintercept = point.getY() - (point.getX() * slope);
        yfactor = 1;
        xfactor = slope;
    }

    // to string method returns a string of the equation in y=mx+b form
    public String toString() {
        String equation = (-xfactor + "x + " + yfactor + "y = " + yintercept);
        return equation;
    }

    // isParallel finds if two lines are parallel
    public boolean isParallel(Line line) {
        if (slope - line.slope < 0.0000001||slope - line.slope > -0.00000001) {
            return true;
        } else {
            return false;
        }
    }

    public Point intersects(Line line) {
        Line holder = new Line(slope, yintercept);
        double x;
        double y;
        if (slope - line.slope < 0.0000001||slope-line.slope>-0.0000001) {
            return null;
        } else {
            if (line.slope > 0) {
                holder.slope = slope - line.slope;
                if (yintercept > 0) {
                    holder.yintercept = line.yintercept - yintercept;
                } else if (yintercept < 0) {
                    holder.yintercept = line.yintercept + yintercept;
                }
            } else if (line.slope < 0) {
                holder.slope = slope + line.slope;
                if (yintercept > 0) {
                    holder.yintercept = line.yintercept - yintercept;
                } else if (yintercept < 0) {
                    holder.yintercept = line.yintercept + yintercept;
                }
            }
            holder.yintercept = holder.yintercept / holder.slope;
            x = holder.yintercept;
            y = line.slope * x + line.yintercept;

        }
        Point interception = new Point(x, y);
        return interception;
    }
}
