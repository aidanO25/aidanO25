// This program counts the occurrences of each digit in a string
// had to re-upload/commit because of errors I just found
package Module7;
// imports
import java.util.*;
public class test
{
  public static void main(String[] args)
  {
    // defining scanner and getting user input
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String s = input.nextLine();
    // output
    count(s);
  }
  public static int[] count(String s)
  {
    // creating a list of numbers 1 through 9 to compair
    Character[] list = {'1','2','3','4','5','6','7','8','9'};
    // creating a list of 9 to keep track of the number of time an int occurs
    int[] nums = new int[9];

    // creating a loop to not only check if a character is a number but to
    // compair to the list to eventually add it to nums
    for(int i = 0; i < s.length(); i++)
    {
      if(Character.isDigit(s.charAt(i)))
      {
        int count = 0;
        for(int x = 0; x < nums.length; x++)
        {
          if(s.charAt(i) == list[x])
          {
            nums[count] += 1;
            count++;
          }
          else
          {
            count++;
          }
        }
      }
    }

    // outputing only the numbers that were in the string along with the number of
    // times it occurs
    int place = 1;
    for(int j = 0; j < nums.length; j++)
    {
      if(nums[j] != 0)
      {
        System.out.println("Digit " + place + " occurs " + nums[j] + " times");
        place ++;
      }
    }

    return nums;
  }
}
