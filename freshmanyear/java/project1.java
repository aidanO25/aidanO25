package Projects;

// importing scanner
import java.util.Scanner;

public class project1 
{
    public static void main(String[] args)
    {
        // defining scanner 
        Scanner input = new Scanner(System.in);

        // askng for user input
        System.out.print("Enter two integers separated by a space, both between -1000 and 1000: ");
        int a = input.nextInt();
        int b = input.nextInt();

        // calculating to find S2
        double c = (2 * b) - a;

        // outputing the missing value 
        System.out.println(c);
    }
}
