// This program prompts the user to enter a string and delimiters and displays
// the substrings separated by a space
package Module9;
// imports
import java.util.*;

public class problem1
{
  public static void main(String[] args)
  {
    // defining scanner and getting usr intput for a string
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String text = input.nextLine();
    // getter the user to enter the delimiters such as ? or #
    System.out.print("Enter delimiters: ");
    String del = input.nextLine();
    // calling the method and printing the string separated by delimiters
    System.out.println(split(text, del));
  }
  // Creating a method to split a string into substrings using delimiters
  public static ArrayList<String> split(String s, String delimiters)
  {
    // Creating the list that will be output with substrings
    ArrayList<String> words = new ArrayList<>();
    // Truning the string of delimiters into individual characters and putting
    // them into an array to be able to check where in the string they are
    String[] dels = new String[delimiters.length()];
    for(int i = 0; i < delimiters.length(); i++)
    {
      String letter = String.valueOf(delimiters.charAt(i));
      dels[i] = letter;
    }
    // Traversing the string and if it finds a delimiter it pulls it out and
    // puts whatever was before it into the list

    // Creating count and tracker variables to keep track of what came before
    // a delimiter
    int count = 0;
    int tracker = 0;
    int g = 0;
    // for loop to itterate over each character in the string s
    for(int i = 0; i < s.length(); i++)
    {
      // Variable temp used to make sure the character doesnt match either
      // delimiter
      int temp = 0;
      String letter = String.valueOf(s.charAt(i));
      for(int x = 0; x < dels.length; x++)
      {
        if(!letter.equals(dels[x]))
        {
          temp++;
        }
        else
        {
          g = tracker + 1;
        }
      }
      // If a delimiter is found, every character before it is added into the
      // list
      tracker++;
      if(temp != dels.length)
      {
        words.add(s.substring(count, i));
        count = tracker;
      }
    }
    // The code below checks if there are any characters after the last
    // delimiter, if there are, they are added to the list and if not, nothing
    // is added
    String check = s.substring(g,s.length());
    if(!check.equals(""))
    {
      words.add(s.substring(g,s.length()));
    }
    // returning the list with substring and no delimiters
    return words;

  }

}
