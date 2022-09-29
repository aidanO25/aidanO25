package Module4;

public class problem4 
{
    public static void main(String[] args)
    {
        // Getting a random point no more than 5
        double x = Math.random() * 5;
        double y = Math.random() * 5;

        // a2 + b2 = c2 to figure out distance
        double dis = (x * x) + (y * y);

        // Output
        System.out.print("The point is (" + x + ", " + y + ") ");
        System.out.println("and it's distance to the center is " + Math.sqrt(dis));

    }
}
