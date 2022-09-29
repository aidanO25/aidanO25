package Module3;
import java.util.Scanner;

public class problem1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        double radius = input.nextDouble();
        System.out.println("The diameter is: " + radius * 2);
        System.out.println("The area is: " + Math.PI * (radius * radius));

    }
}
