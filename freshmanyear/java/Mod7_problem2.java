// This program promts the user to enter 4 points and then retuns the
// point at which the two lines intersect
package Module8;
import java.util.*;

public class problem2
{
  public static void main(String[] args)
  {
    // defining scanner and getting inputs
    Scanner input = new Scanner(System.in);
    System.out.println("Enter four points");
    // creating an array to hold the points once they are entered
    double[][] list = new double[4][2];
    // creating a count to change what x and y the user has to input
    int count = 1;
    // creating a loop for user input and to store the points into the array
    for(int i = 0; i < 4; i++)
    {
      System.out.println("Enter x" + count + " and y" + count);
      for(int x = 0; x < 2; x++)
      {
        list[i][x] = input.nextDouble();
      }
      count++;
    }
    // creating new points
    Point a1 = new Point(list[0][0], list[0][1]);
    Point a2 = new Point(list[1][0], list[1][1]);
    Point b1 = new Point(list[2][0], list[2][1]);
    Point b2 = new Point(list[3][0], list[3][1]);

    // calling the method
    System.out.println(getCenterPoint(a1, a2, b1, b2));

  }
  // creating a new mehtod to calculate the center of the two points
  public static Point getCenterPoint(Point p1, Point p2, Point p3, Point p4)
  {
    // first line with points p1 and p2
    double a1 = p2.getY() - p1.getY();
    double b1 = p1.getX() - p2.getX();
    double c1 = a1 *(p1.getX()) + b1 * (p1.getY());

    // second line with points p3 and p4
    double a2 = p4.getY() - p3.getY();
    double b2 = p3.getX() - p4.getX();
    double c2 = a2 * (p3.getX()) + b2 * (p3.getY());

    // calculating the determinant
    double determinant = a1 * b2 - a2 * b1;
    // getting the x and y of the intersecting point to put into the new point
    double x = (b2 * c1 - b1 * c2) / determinant;
    double y = (a1 * c2 - a2 * c1) / determinant;
    // creating a new point
    Point point = new Point(x, y);
    // output
    if(determinant == 0)
    {
      System.out.println("The two lines are parallel");
    }
    else
    {
      System.out.print("The intersecting point is at: ");
    }
    return point;
  }
}

// Creating a new class
public class Point
{
  private double x;
  private double y;
  public Point(double x, double y)
  {
    this.x = x;
    this.y = y;
  }
  public double getX()
  {
    return x;
  }
  public double getY()
  {
    return y;
  }
  public String toString()
  {
    return "(" + x + ", " + y + ")";
  }
}
