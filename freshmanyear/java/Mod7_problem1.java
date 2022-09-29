// This program promts the user to enter values for a, b, and c and displays
// the result based on the discriminant
package Module8;
import java.util.*;

public class problem1
{
  public static void main(String[] args)
  {
    // defining scanner and getting inputs
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the value of a, b and c: ");
    double a = input.nextDouble();
    double b = input.nextDouble();
    double c = input.nextDouble();

    // using the class to create an object
    QuadraticEquation math = new QuadraticEquation(a,b,c);
    double discriminant = math.getDiscriminant();

    //Displaying the roots
    if(discriminant > 0)
    {
      System.out.println("The roots are " + math.getRoot1() + " and " + math.getRoot2());
    }
    else if(discriminant == 0)
    {
      System.out.println("The root is " + math.getRoot1());
    }
    else
    {
      System.out.println("The equation has no roots");
    }
  }
}

// creating a new class
class QuadraticEquation
{
  private double a, b, c;

  public QuadraticEquation(double a, double b, double c)
  {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  // getter methods
  public double getA()
  {
    return a;
  }
  public double getB()
  {
    return b;
  }
  public double getC()
  {
    return c;
  }

  // get discriminant method
  public double getDiscriminant()
  {
    return Math.pow(b,2) - 4 * a * c;
  }

  // root methods
  public double getRoot1()
  {
    return (-b + Math.sqrt(getDiscriminant())) / (2.0 * a);
  }
  public double getRoot2()
  {
    return (-b - Math.sqrt(getDiscriminant())) / (2.0 * a);
  }
}
