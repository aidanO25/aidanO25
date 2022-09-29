// This program prompts the user to enter the index of the array, then displays
// the corresponding element value. If the specified index is out of bounds,
// the message, "out of bounds" is displayed
package Module10;
// imports
import java.util.*;

public class problem1
{
  public static void main(String[] args)
  {
    // defining Scanner
    Scanner input = new Scanner(System.in);
    // creating a list to hold 100 random ints
    int[] list = new int[100];
    // using a loop to add 100 random integers to it (0 - 100)
    int min = 0;
    int max = 100;
    for(int i = 0; i < 100; i++)
    {
      list[i] = (int)Math.round(Math.random() * (max - min + 1) + min);
    }
    // asking the user to enter a number which will return the corresponding int
    System.out.print("Enter a specified index: ");
    int num = input.nextInt();
    // making sure the number is less than 100 but if it is, out of bounds is
    // printed
    try
    {
      System.out.println(list[num]);
    }
    catch(ArrayIndexOutOfBoundsException ex)
    {
      System.out.println("Out of bounds");
    }
  }
}
