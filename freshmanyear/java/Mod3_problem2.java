package Module4;
import java.util.Scanner;

public class problem2 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Getting inputs
        System.out.print("Enter a numerator: ");
        int n = input.nextInt();
        System.out.print("Enter a denominator: ");
        int d = input.nextInt();

        // Checking if the fraction is proper or improper and returns the correct output
        if(n % d != 0)
        {
            System.out.println(n + " / " + d + " is a proper fraction");
        }
        else
        {
            System.out.println(n + " / " + d + " is an improper fraction and it can be reduced to " + n / d);
        }
    }
}
