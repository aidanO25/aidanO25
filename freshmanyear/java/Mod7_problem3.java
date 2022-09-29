// This program prompts the user to enter three points to create a triangle and
// the program will output what the center of the traingle is
package Module8;
import java.util.*;

public class problem3
{
  public static void main(String[] args)
  {
    // defining scanner and getting inputs
    Scanner input = new Scanner(System.in);
    System.out.println("Enter three points (x1, y1, x2, y2, x3, y3): ");
    // creating an array to hold the points once they are entered
    double[][] list = new double[3][2];
    // creating a count to change what x and y the user has to input
    int count = 1;
    // creating a loop for user input and to store the points into the array
    for(int i = 0; i < 3; i++)
    {
      System.out.println("Enter x" + count + " and y" + count);
      for(int x = 0; x < 2; x++)
      {
        list[i][x] = input.nextDouble();
      }
      count++;
    }
    // creating new points
    Point p1 = new Point(list[0][0], list[0][1]);
    Point p2 = new Point(list[1][0], list[1][1]);
    Point p3 = new Point(list[2][0], list[2][1]);
    // calling the method to print the result
    System.out.println("The center of the triangle is: " + getCenterPoint(p1, p2, p3));
  }
  public static Point getCenterPoint(Point p1, Point p2, Point p3)
  {
    double x = (p1.getX() + p2.getX() + p3.getX()) / 3;
    double y = (p1.getY() + p2.getY() + p3.getY() / 3);
    Point point = new Point(x, y);
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
