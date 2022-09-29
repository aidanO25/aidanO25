package Module3;
import java.util.Scanner;

public class problem3 
{
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the friction force in Newtons: ");
        double fricF = input.nextDouble();

        System.out.print("Enter the object's mass in kg: ");
        double m = input.nextDouble();

        System.out.print("Enter the object's acceleration in m/s^2: ");
        double a = input.nextDouble();
        
        double u = (fricF - m * a) / (m * 9.8);

        System.out.println("The coefficient for friction is: " + u);
        
    }    
}
