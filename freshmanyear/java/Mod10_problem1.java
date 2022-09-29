// This program prompts the user to enter HH:MM:SS and gives its time, elapsed
// seconds and then compares other times
package Module11;
// imports
import java.util.*;

public class problem1
{

  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    // time 1
    System.out.print("Enter time1 (hour minute second): ");
    int hour = input.nextInt();
    int min = input.nextInt();
    int sec = input.nextInt();
    Time time1 = new Time(hour, min, sec);
    System.out.println(time1.toString());
    System.out.println("Elapsed seconds in time1: " + time1.getSeconds());

    // time 2
    System.out.print("Enter time2 (elapsed time): ");
    int elapsed = input.nextInt();
    Time time2 = new Time(elapsed);
    System.out.println(time2.toString());
    System.out.println("Elapsed seconds in time2: " + elapsed);

    // comparing time1 with time2
    System.out.println("time1.compareTo(time2)? " + (time1.getSeconds() - elapsed));

    // time 3 (clone of time 1)
    System.out.println("time3 is created as a clone of time1");
    Time time3 = time1;
    // comparing time1 to time3
    System.out.println("time1.compareTo(time3)? " + (time3.getSeconds() - time1.getSeconds()));

  }
}

// I tried to use the Comparable<T> interface but it was giving me an error
// message and I was unable to solve it so I improvised just by subtracting
// I also did watch the videos posted on Ilearn but i was still having issues
public class Time //implements Comparable<Time>
{
  public long hour;
  public long minute;
  public long second;

  public Time()
  {
    long totalSeconds = System.currentTimeMillis() / 1000;
    long totalMinutes = totalSeconds / 60;
    long totalHours = totalMinutes / 60;
    this.hour = totalHours % 24;
    this.minute = totalMinutes % 60;
    this.second = totalSeconds % 60;
  }

  public Time(long hour, long minute, long second)
  {
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }

  public Time(long elapseTime)
  {
    this.hour = (elapseTime % 86400) / 3600;
    this.minute = (elapseTime / 60) % 60;
    this.second = elapseTime % 60;
    long elapse = elapseTime;
  }

  public long getHour()
  {
    return hour;
  }

  public long getMinute()
  {
    return minute;
  }

  public long getSecond()
  {
    return second;
  }

  // gets the elapsed time
  public long getSeconds()
  {
    return (hour * 60 * 60) + (minute * 60) + second;
  }

  /*
  public int CompareTo(Time o)
  {

  }
  */

  public String toString()
  {
    // using an if statement to output a different result depending on what was
    // input
    if(getSeconds() == 0)
    {
      return getHour() + " hour " + getMinute() + " minutes " + getSecond() + " second";
    }
    else
    {
      return (getSeconds() % 86400) / 3600 + " hour " + getSeconds() / 60 % 60 + " minutes " + getSeconds() % 60 + " second";
    }
  }
}
