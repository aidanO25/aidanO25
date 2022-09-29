package Module5;
import java.util.Scanner;

public class problem3 
{
    public static void main(String[] args)
    {
        // defines scanner
        Scanner input = new Scanner(System.in);

        // asks the user to enter a genome
        System.out.print("Enter a genome: ");
        String g = input.nextLine();

        // defines count which is to store the gene if found and a boolean is used to check
        // if a gene has been found
        int count = 0;
        boolean found = false;

        // traversing through the string
        for(int i = 0; i < g.length() -2; i++)
        {
            // breaks apart the string into segments of 3
            String sub = g.substring(i, i+3);
            
            // checks if 'ATG' is found and if so it stores the position
            if(sub.equals("ATG"))
            {
                count = i + 3;
                found = true;
            }
            // checks to see if a key word is there to stop storing the placement
            else if(((sub.equals("TAG")) || (sub.equals("TAA")) || (sub.equals("TGA"))) &&(count != 0))
            {
                // defines a new string which includes the placement of the stored values
                String list = g.substring(count, i);
                if(g.length() % 3 == 0)
                {
                    // outputs
                    System.out.println("Gene found: " + list);
                    count = 0;
                }
            }
        }
        // if no gene has been found it outputs a different message
        if(found == false)
        {
            System.out.println("No gene found");
        }
    }
}
