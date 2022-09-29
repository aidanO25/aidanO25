package Module4;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class problem1 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, and c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double dis = Math.pow(Math.pow(b, 2) - (4 * a * c), 0.5);

        if(dis > 0)
        {
            double tot1 = ((b * (-1)) + Math.pow((Math.pow(b, 2) - 4 * a * c), 0.5)) / (2 * a);
            double tot2 = ((b * (-1)) + Math.pow((Math.pow(b, 2) - 4 * a * c), 0.5)) / (2 * a);
            System.out.println("The equation has two roots " + tot1 + " and " + tot2);
        }
        else if(dis == 0)
        {
            double tot = ((b * (-1)) + Math.pow((Math.pow(b, 2) - 4 * a * c), 0.5)) / (2 * a);
            System.out.println("The equation has one root " + tot);
        }
        else
        {
            System.out.println("The equation has no real roots");
        }

    }
}
