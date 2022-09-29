package Module4;
import java.util.Scanner;

public class problem3 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the coordinates for two points: ");

        // Getting inputs
        double x1= input.nextDouble();
        double y1= input.nextDouble();
        double x2= input.nextDouble();
        double y2= input.nextDouble();

        // Calculating slope
        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - (m * x1);

        // outputs
        if(m == 1.0 || b == 0.0)
        {
            System.out.println("The line equation for two points: (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is y = x");
        }
        else
        {
            System.out.println("The line equation for two points: (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is y = " + m + "x - " + b);
        }
 

    }
}
