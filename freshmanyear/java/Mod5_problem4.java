package Module6;
// importing scanner
import java.util.Scanner;

public class problem4 
{
    public static void main(String[] args)
    {
        // defining the scanner
        Scanner input = new Scanner(System.in);

        // getting user input
        System.out.print("Enter total seconds: ");
        int sec = input.nextInt();

        // calling and printing the method
        System.out.println(format(sec));

    }
    // creating a new method
    public static String format(long seconds)
    {
        int newSec = (int)seconds;
        int hour = newSec/3600;
        int min = (newSec % 3600) / 60;
        int sec = (newSec % 3600) % 60;

        String time = "";

        // checking if a 0 is needed in front of a number
        if(hour < 10)
        {
            time = "0" +hour + ":" + min + ":" + sec;
        }
        else if(min < 10)
        {
            time = hour + ":" + "0" + min + ":" + sec;
        }
        else if(sec < 10)
        {
            time = hour + ":" + min + ":" + "0" + sec;
        }
        return time;
    }
}
