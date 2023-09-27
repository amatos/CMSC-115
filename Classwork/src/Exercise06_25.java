import java.util.Scanner;

/*
A.Matos
Week 6 Project 4:

(Convert milliseconds to hours, minutes, and seconds)
Write a method that converts milliseconds to hours, minutes, and seconds using the following header:
public static String convertMillis(long millis)
The method returns a string as hours:minutes:seconds.
For example, convertMillis(5500) returns a string 0:0:5,
convertMillis(100000) returns a string 0:1:40
convertMillis(555550000) returns a string 154:19:10

Write a test program that prompts the user to enter a long integer for milliseconds and displays a string in
the format of hours:minutes:seconds.

Sample Run
Enter time in milliseconds: 555550000
154:19:10
Class Name: Exercise06_25
 */

public class Exercise06_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for a long integer for milliseconds
        System.out.print("Enter time in milliseconds: ");
        long milliseconds = input.nextLong();

        // Call convertFromMilliseconds() to get hh:mm:ss
        String timeHHMMSS = convertMillis(milliseconds);

        // Print the results
        System.out.println(timeHHMMSS);
    }

    public static String convertMillis(long millis) {
        // Convert the milliseconds to seconds by dividing by 1000
        long seconds = millis / 1000;

        // Convert the seconds to minutes by dividing by 60
        long minutes = seconds / 60;

        // Convert the minutes to hours by dividing by 60
        long hours = minutes / 60;

        // Get the remaining seconds
        seconds = seconds % 60;

        // Get the remaining minutes
        minutes = minutes % 60;

        // Return the hours, minutes, and seconds as a string
        // Yes, this is redundant -- I could just return hours + ":" + minutes + ":" + seconds, but I wanted to be
        // explicit.
        String hhmmss = hours + ":" + minutes + ":" + seconds;
        return hhmmss;
    }
}
