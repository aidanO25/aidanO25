package Module3;
import java.util.Scanner;

public class problem4 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");
        int min = input.nextInt();
        int years = min / 1440 / 365;
        int days = min % 525600 / 1440;

        System.out.println(min + "minutes is approximately " + years + " years and " + days + " days");
    }    
}
