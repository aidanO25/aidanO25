package Module6;
import java.util.Scanner;

public class problem1 
{
    public static void main(String[] args)
    {
        // defining scanner
        Scanner input = new Scanner(System.in);

        // gettin guser input
        System.out.print("Enter an integer to compute the multiplication of the digits: ");
        int a = input.nextInt();

        // calling and printing the method
        System.out.println(multiplyDigits(a));

    }    
    // creating a new method
    public static int multiplyDigits(long n)
    {
        // converting to an int
        int x = (int)n;

        // using a while-loop to extract the numbers
        int total = 1;
        while(x != 0)
        {
            total = total * (x % 10);
            x = x / 10;
        }
        // returning the sum of the digits
        return total;
    }
}
