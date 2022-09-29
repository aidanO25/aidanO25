// This program accepts 10 numbers as inputs and outputs the number of distinct
// numbers in the input, if the nubmers are considered modulo 42
package Projects;
// importing scanner
import java.util.*;

public class project2
{
  public static void main(String[] args)
  {
    // defining scanner
    Scanner input = new Scanner(System.in);

    // creating a list to hold the numbers
    //ArrayList<Integer> nums = new ArrayList<Integer>();
    int[] array = new int[10];

    //getting user input
    System.out.println("Enter ten non-negative integers smaller than 1000: ");

    // creating a loop so the user can enter 10 integers rather
    // than creating 10 separate integers
    int count = 10;
    for(int i = 0; i < 10; i++)
    {
      array[i] = input.nextInt();
      if(array[i] == 1)
      {
        count++;
      }
    }

    // creating a loop to mod each int in the arrary and a count to keep track
    // of numbers that % 42
    for(int x = 0; x < 10; x++)
    {
      if(array[x] % 42 == 0 || array[x] % 42 == 1)
      {
        count --;
      }
    }
    if(count == 0)
    {
      System.out.println("Output: " + 1);
    }
    else
    {
      System.out.println("Output: " + count);
    }

  }
}
