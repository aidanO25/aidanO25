package Projects;
import java.util.*;

public class project3
{
  public static void main(String[] args)
  {
    // defining scanner and getting user input
    Scanner input = new Scanner(System.in);
    // creating a count to keep track of the # of houses created
    int count = 1;
    while (true)
    {
      System.out.println("Enter the length and width for the fun-house: ");
      // width and length
      int l = input.nextInt();
      int w = input.nextInt();
      // output only if the length and width are greater than or equal to 5 and
      // less than or equal to 20
      if(w >= 5 && w <= 20 && l >= 5 && l <=20)
      {
        System.out.println("HOUSE " + count);
        house(l,w);
        count++;
      }
      else
      {
        System.out.println("The length and width must be above 4 and less than 21");
      }
    }
  }
  public static void house(int l, int w)
  {
    // creating two random numbers which will be used to mark the entrance to
    // the house
    int wEnter = (int) (Math.random() * w) - 1;
    int lEnter = (int) (Math.random() * l) - 1;
    // creating a temp to decide if the '*' is on one side or the other
    int temp = (int)(Math.random() * 2);
    // making sure the entrence is not in any corner or in the middle and if import junit.framework.TestCase;
    // is, a change is made
    if(wEnter > 0 && wEnter < w)
    {
      if(temp == 0)
      {
        lEnter = 0;
      }
      else
      {
        lEnter = l - 1;
      }
    }
    else
    {
      if(lEnter > 0 || lEnter < l)
      {
        if(temp == 0)
        {
          wEnter = 0;
        }
        else
        {
          wEnter = w - 1;
        }
      }
      else if(lEnter == 0)
      {
        lEnter ++;
      }
      else
      {
        lEnter = l - 1;
      }
    }
    // creating two random numbers which will be used to mark the exit of the
    // house
    int wExit = (int) (Math.random() * w) - 1;
    int lExit = (int) (Math.random() * l) - 1;
    // creating a temp to decide if the '*' is on one side or the other
    int temp2 = (int)(Math.random() * 2);
    // making sure the entrence is not in any corner or in the middle and if import junit.framework.TestCase;
    // is, a change is made
    if(wExit > 0 && wExit < w)
    {
      if(temp2 == 0)
      {
        lExit = 0;
      }
      else
      {
        lExit = l - 1;
      }
    }
    else
    {
      if(lExit > 0 || lExit < l)
      {
        if(temp2 == 0)
        {
          wExit = 0;
        }
        else
        {
          wExit = w - 1;
        }
      }
      else if(lExit == 0)
      {
        lExit ++;
      }
      else
      {
        lExit = l - 1;
      }
    }
    // creating a 2d array to hold the width and length and then printing it
    Character[][] house = new Character[w][l];
    // creating the house
    for(int i = 0; i < w; i++)
    {
      for(int x = 0; x < l; x++)
      {
        if(i == 0 || x == 0  || i == w - 1 || x == l - 1)
        {
          house[i][x] = 'x';
        }
        else
        {
          house[i][x] = '.';
        }
      }
    }
    // creating the entrence
    house[wEnter][lEnter] = '*';
    // creating the exit
    house[wExit][lExit] = '&';
    // outputting the house
    for(int i = 0; i < house.length; i++)
    {
      for(int x = 0; x < house[i].length; x++)
      {
        System.out.print(house[i][x] + " ");
      }
      System.out.println();
    }
  }
}
