package Module6;
import java.util.Scanner;

public class problem2
{
  public static void main(String[] args)
  {
    // defining scanner
    Scanner input = new Scanner(System.in);

    // getting user input
    System.out.print("Enter an integer: ");
    int a = input.nextInt();

    // calling the method
    System.out.println(decimalToBinary(a));
  }
  public static String decimalToBinary(int value)
  {
    System.out.print("The binary value is: ");
    String num = Integer.toString(value);
    while(value > 0)
    {
      if(value % 2 == 0)
      {
        value = value / 2;
        System.out.print(0);
      }
      else
      {
        value = value / 2;
        System.out.print(1);
      }
    }
    // just here so it can run
    return "";
  }
}
