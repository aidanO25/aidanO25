// This program generates 100 random integers between 0 and 9 and displays the
// count for each number
package Module7;
// imports
import java.util.Random;

public class problem1
{
  public static void main(String[] args)
  {
    // creating an aray to hold numbers 1 through 9
    int[] array = new int[]{1,2,3,4,5,6,7,8,9};

    // creating a loop to create 100 random numbers
    for(int i = 0; i < 100; i++)
    {
      // creating a new random int each time the loop restarts
      Random rand = new Random();
      int num = rand.nextInt(9) + 1;

      // prints the original random num along with it's index in the array by
      // using the method created below
      System.out.println("Random number: " + num + " Index in array: " + findIndex(array, num));
    }
  }
  // creating a method to find the random number's spot in the array
  public static int findIndex(int array[], int spot)
  {
    // creating a count to keep track of the spot the random num is
    int count = 0;
    int len = array.length;
    while(count < len)
    {
      // checks whether or not the number is in position 'x' and if not it will
      // go to the next number
      if(array[count] == spot)
      {
        return count;
      }
      else
      {
        count++;
      }
    }
    return -1;
  }
}
