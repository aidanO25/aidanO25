package Module5;
import java.util.Scanner;

public class problem4 
{
    public static void main(String[] args)
    {
        System.out.println(Math.sqrt(31));
        // defines scanner
        Scanner input = new Scanner(System.in);

        // gets user inputs
        System.out.print("Enter a positive integer: ");
        int n = input.nextInt();

        // calculates the square root in simplest form

        // creates a temporarty integer
        int t;
        int sqrt = n / 2;
        // repeates until the sqrt is found
        do
        {
            t = sqrt;
            sqrt = (t + (n / t)) / 2;
        }
        // outputs
        while((t - sqrt) != 0);
        System.out.println("sqrt(" + n + ") is (" + sqrt + ")");
    }
}
