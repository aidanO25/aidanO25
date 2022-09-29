package Projects;
// imports
import java.util.*;
// using teh decimal format to round
import java.text.DecimalFormat;

public class project5
{
  public static void main(String[] args)
  {
    // defining the scanner
    Scanner input = new Scanner(System.in);

    // getting user input
    System.out.println("Enter the first complex number: ");
    double oneA = input.nextDouble();
    double oneB = input.nextDouble();

    System.out.println("Enter the econd complex number: ");
    double twoA = input.nextDouble();
    double twoB = input.nextDouble();

    // creating a separate Complex for each input
    Complex a = new Complex(oneA, oneB);
    Complex b = new Complex(twoA, twoB);

    //printing the answers using the addition, subtraction, multiplication,
    // and division methods from the complex class

    // addition
    System.out.println("(" + oneA + " + " + oneB + "i) + (" +
    twoA + " + " + twoB + "i) = " +
    new Complex(oneA, oneB).add(new Complex(twoA, twoB)));
    // subtracton
    System.out.println("(" + oneA + " + " + oneB + "i) - (" +
    twoA + " + " + twoB + "i) = " +
    new Complex(oneA, oneB).subtract(new Complex(twoA, twoB)));
    // multiplication
    System.out.println("(" + oneA + " + " + oneB + "i) * (" +
    twoA + " + " + twoB + "i) = " +
    new Complex(oneA, oneB).multiply(new Complex(twoA, twoB)));
    // divide
    System.out.println("(" + oneA + " + " + oneB + "i) / (" +
    twoA + " + " + twoB + "i) = " +
    new Complex(oneA, oneB).divide(new Complex(twoA, twoB)));
    // using the abs method
    System.out.println("|" + oneA + " + " + oneB + "i| = " +
    new Complex(oneA, oneB).abs());

  }
}
// creating the complex class
public class Complex
{
  private double a;
  private double b;

  public Complex(double a, double b)
  {
    this.a = a;
    this.b = b;
  }

  public Complex(double a)
  {
    this(a, 0);
  }

  public Complex()
  {
    this(0);
  }

  // addition method
  public Complex add(Complex complex)
  {
    return new Complex((a + complex.a), (b + complex.b));
  }

  // subtraction method
  public Complex subtract(Complex complex)
  {
    return new Complex((a - complex.a), (b - complex.b));
  }

  // multiplication method
  public Complex multiply(Complex complex)
  {
    return new Complex((a * complex.a - b * complex.b),
    (b * complex.a + a * complex.b));
  }

  // division method
  public Complex divide(Complex complex)
  {
    return new Complex((a * complex.a + b * complex.b) /
    ((Math.pow(complex.a, 2) + Math.pow(complex.b, 2))),
    (b * complex.a - a * complex.b) / ((Math.pow(complex.a, 2) +
    Math.pow(complex.b, 2))));
  }

  // abs method
  public double abs()
  {
    return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
  }

  public double getRealPat()
  {
    return a;
  }

  public double getImaginaryPart()
  {
    return b;
  }

  // toString method which will be used when printing a new Complex
  @Override
  public String toString()
  {
    if(b == 0)
    {
      return a + "";
    }
    DecimalFormat df = new DecimalFormat("#.####");
    return df.format(a) + " + " + df.format(b) + "i";


  }
}
