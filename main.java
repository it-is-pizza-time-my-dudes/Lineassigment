
public class main {
    Point p1 = new Point(3,4);
    Point p2 = new Point(10,6.5);

    Line firstLine= new Line(2, -5,30); // 2x-5y = 30
    Line secondLine = new Line(1.5, p1); // the line with slope 1.5 that passes through p1
    Line thirdLine = new Line(p1, p2); // the line that passes through p1 and p2.
    // if p1 and p2 have the same coordinates, make the Line horizontal.
    Line fourthLine = new Line(1.5, 27); // y = 1.5x + 27
    Line fifthLine = new Line(1,0,6); // x = 6 (vertical line)
    boolean b = firstLine.isParallel(secondLine); // returns false
    System.out.println(b);
    Point p3 = firstLine.intersects(secondLine); // returns a point with x =-5 and y = 8
    System.out.println("(" + p3.getX() + ", " + p3.getY() + ")" ); // prints (-5.0,-8.0)
    boolean b2 = secondLine.isParallel(fourthLine); // returns true
    System.out.println(b2);
    Point p4 = secondLine.intersects(fourthLine); //returns null because the Lines don't intersect. null is a keyword in java.
    String s = fourthLine.toString();
    System.out.println(s);
    Line sixthLine = new Line(1.500000001, 26);
    boolean b3 = fourthLine.isParallel(sixthLine);
    Line tooDifferent = new Line(1.5000001, 26);
    System.out.println(sixthLine.isParallel(tooDifferent)); // prints false
}
