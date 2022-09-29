package Module5;
import java.util.Scanner;

public class problem2 
{
    public static void main(String[] args)
    {
        // defines scanner
        Scanner input = new Scanner(System.in);

        // gets user inputs
        System.out.print("Enter the number of sides: ");
        double n = input.nextDouble();
        System.out.print("Enter the radius of the bounding circle: ");
        double r = input.nextDouble();

        // calculates the coordinates
        for(int i = 0; i < n; i++)
        {
            // if you wanted it rounded i could have just done Math.round(x) and the same for y
            // but i left it as it is because on the assignment sheet it wasn't rounded
            double x = r * java.lang.Math.cos(2.0 * java.lang.Math.PI / n * i);
            double y = r * java.lang.Math.sin(2.0 * java.lang.Math.PI / n * i);
            System.out.println("(" + x + ", " + y +")");
        }
        
    }    
}
