// This program promts the usre to enter a binary number as a string and
// displays its decimal equivalent. If the method throws an exception,
// "Not a binary number" is displayed
package Module10;
// imports
import java.util.*;

public class problem2
{
  public static void main(String[] args)
  {
    // defining scanner and getting user inputs
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a binary number to get its decimal value: ");
    String binary = input.nextLine();
    System.out.println(bin2Dec(binary));
  }
  // creating a method to turn the binary string into a deimal number
  public static int bin2Dec(String binaryString) throws NumberFormatException
  {
    // using the check method to make sure the string entered is binary
    if (!check(binaryString))
    {
      throw new NumberFormatException(binaryString + " is not a binary number.");
    }
    int power = 0;
    int decimal = 0;
    for (int i = binaryString.length() - 1; i >= 0; i--)
    {
      if(binaryString.charAt(i) == '1')
      {
        decimal += Math.pow(2, power);
      }
      power++;
    }
    return decimal;
  }
  // creating a method to check if the binary string entered is a real binary #
  public static boolean check(String binaryString)
  {
    for (char ch : binaryString.toCharArray())
    {
      if (ch != '1' && ch != '0')
      {
        return false;
      }
    }
    return true;
  }
}
