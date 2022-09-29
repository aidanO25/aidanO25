// This program prompts the user to enter a, b, c, d for a matrix and displays
// it's inverse matrix
package Module7;
// imports
import java.util.*;

public class problem4
{
  public static void main(String[] args)
  {
    // defining scanner and getting user inputs
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a, b, c, d: ");
    // getting user input and putting it into a 2d array
    int count = 1;
    // creating a 2d array to hold the inputs
    double[][] array = new double[2][2];

    for(int i = 0; i < 2; i++)
    {
      for(int x = 0; x < 2; x++)
      {
        if(count == 2 || count == 3)
        {
          double a = input.nextDouble();
          array[i][x] = a / -10;
          count++;
        }
        else
        {
          double a = input.nextDouble();
          array[i][x] = a / 10;
          count++;
        }
      }
    }
    // math to figure out inverse matrix
    double x1 = ((array[0][0] * 10) * array[1][1]) + ((array[0][1] * -10) * (array[1][0]));
    double x2 = ((array[0][0] * 10) * array[1][0]) + ((array[1][0] * -10) * (array[0][0]));
    double x3 = ((array[1][0] * -10) * array[1][1]) + ((array[1][1] * 10) * (array[1][0]));
    double x4 = ((array[1][0] * -10) * array[0][1]) + ((array[1][1] * 10) * (array[0][0]));

    // checking if there is an inverse matix or not
    if(Math.round(x1) == 1 && Math.round(x2) == 0 && Math.round(x3) == 0 && Math.round(x4) == 1)
    {
      System.out.println("Inverse matrix found: ");
      System.out.println(Arrays.deepToString(array));
    }
    else
    {
      System.out.println("No inverse matrix");
    }
  }
}
