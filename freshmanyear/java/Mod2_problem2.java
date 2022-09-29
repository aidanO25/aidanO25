package Module3;
import java.util.Scanner;

public class problem2 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the ball travel time in seconds: ");
        double travelT = input.nextDouble();

        double d = 0 * travelT + 9.8 * (travelT * travelT) / 2;

        System.out.print("The height of teh building is: " + d);
    
    }
}
