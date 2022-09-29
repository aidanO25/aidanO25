package Module5;
import java.util.Scanner;

public class problem1 
{
    public static void main(String[] args)
    {
        // brings in the scanner
        Scanner input = new Scanner(System.in);

        // gets user inputs
        System.out.print("Enter the number of sides: ");
        double n = input.nextDouble();
        System.out.print("Enter teh side: ");
        double s = input.nextDouble();

        // finds the area
        double area = n * Math.pow(s, 2) / (4 * Math.tan(Math.PI / n));

        // outputs
        System.out.println("The area of the polygon is " + area);
    }
}
