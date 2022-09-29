package Module6;
// importing scanner
import java.util.Scanner;

public class problem3 
{
    public static void main(String[] args)
    {
        // defining scanner
        Scanner input = new Scanner(System.in);

        // getting user input
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        // calling the method
        System.out.print("The new string is: ");
        title(str);

    }
    // creating a new method
    public static void title(String s)
    {
        // creating and turning the string into an arrary
        char [] list = s.toCharArray();
        // boolean value to check if there is a space or not
        boolean space = true;
        // itterating over the string to get first letter capital
        for(int i = 0; i < s.length(); i++)
        {
            if(Character.isLetter(list[i]))
            {
                if(space)
                {
                    list[i] = Character.toUpperCase(list[i]);
                    space = false;
                }
            }
            else
            {
                space = true;
            }
        }
        s = String.valueOf(list);
        System.out.println(list);
    }
}