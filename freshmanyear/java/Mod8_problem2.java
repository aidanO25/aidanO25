// This program packs objects of various weights into containers based off of
// their weight
package Module9;
//imports
import java.util.*;

public class problem2
{
  public static void main(String[] args)
  {
   // defining scanner and getting user input
   Scanner input = new Scanner(System.in);
   System.out.print("Enter the number of objects: ");
   int numberOfObjects = input.nextInt();
   // creating a list to hold the input object weights
   ArrayList<Integer> objects = new ArrayList<>();
   System.out.print("Enter the weights of the objects: ");
   // creating a for loop with a length of the # of objects and then adding them
   // to the list
   for (int i = 0; i < numberOfObjects; i++)
   {
     objects.add(input.nextInt());
   }
   // creating a container counter
   int container = 1;
   while(!objects.isEmpty())
   {
     System.out.println("Container " + container++ + " contains objects with weight " + getConteiner(objects, 10));
   }
  }
  // creating a method to add the objects with their weights to a container
  // only if they add up to 10 or are less than 10
  static String getConteiner(ArrayList<Integer> objects, int max)
  {
    String result = "";
    for (int i = 0; i < objects.size(); i++)
    {
     if(objects.get(i) <= max)
     {
       int tmp = objects.get(i);
       result += tmp + " ";
       objects.remove(i);
       return result + getConteiner(objects, max - tmp);
     }
    }
    return result;
  }
}
