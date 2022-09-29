// This program prompts the user to enter the year, gender, and name and then
// outputs the ranking of the name for the year
package Projects;
// imports
import java.util.*;
import java.io.*;

public class BabyName
{
  public static void main(String[] args)
  {
    // defining scanner and getting user input
    Scanner input = new Scanner(System.in);

    System.out.println();
    System.out.print("Enter the year (2000 - 2010): ");
    int year = input.nextInt();

    System.out.print("Enter the Gender: ");
    String gender = input.next();

    System.out.print("Enter the name: ");
    String name = input.next();

    // calling he method
    //System.out.println();
    System.out.println(findName(year, name, gender));

  }
  public static String findName(int year, String name, String gender)
  {
    // checking if the file exists
    File file = new File("babynameranking" + year + ".txt");
    if(!file.exists())
    {
        System.out.println("No record for that date");
    }
    // reading each line to find the name and to get its ranking
    try
    {
      // creating a check incase the name is not in the top 1000
      boolean check = false;
      Scanner read = new Scanner(file);
      // itterating over each line
      for(int i = 0; i < 1000; i++)
      {
        String line = read.nextLine();
        // using the user input for gender to check if the name is in the list
        if(gender.equalsIgnoreCase("M") && line.contains(name))
        {
          System.out.println(name + " is ranked #" + (i += 1) + " in year " + year);
          // making the check true because if found the name
          check = true;
          break;
        }
        else if(gender.equalsIgnoreCase("F") && line.contains(name))
        {
          System.out.println(name + " is ranked #" + (i += 1) + " in year " + year);
          check = true;
          break;
        }
      }
      // if the name was not found on the list the user is made aware of it
      if(check != true)
      {
        System.out.println("The name " + name + " is not ranked in year " + year);
      }
    }
    catch(IOException e)
    {
      e.printStackTrace();
    }
    return "";

  }
}
