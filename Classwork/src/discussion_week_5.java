import java.util.Objects;
import java.util.Scanner;

public class discussion_week_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter=0;
        int cumulativeTotal=0;
        double average=0.0;
        String providedValue;

        System.out.println("Please enter a series of integers to average, one per line.");
        System.out.println("Enter . on an empty line to terminate.");

        System.out.print("Next input --> ");
        providedValue = input.nextLine();

        /*
        Demonstration of pre-loop check.
        We want to go through this loop if, and only if, providedValue is not the terminator, ".".  In order to do this,
        we first check what providedValue is, and only proceed if it's not the terminator.
            - Check if providedValue is the terminator, ".".  If not, increment counter and prompt for input again.
            - We check providedValue first because if it IS an integer, we'll perform the calculation and prompt
              for the next value.
            - Add providedValue to the cumulativeTotal, calculate and print the average.
            - Then re-prompt for the next value.
        */
        // Null safe check for providedValue
        while (!Objects.equals(providedValue, ".")) {
            // Check if providedValue is an integer.  If not, prompt for input again.
            if (!isInteger(providedValue)) {
                System.out.println("Invalid input.  Please enter an integer, or . to terminate.");
                System.out.print("Next input --> ");
                providedValue = input.nextLine();
                continue;
            }
            counter++;
            cumulativeTotal += Integer.parseInt(providedValue);
            average = (double) cumulativeTotal / counter;
            System.out.println("The average of the numbers entered is " + average);
            System.out.print("Next input --> ");
            providedValue = input.nextLine();
        }

        System.out.println("A total of " + counter + " numbers were entered, averaging " + average + ".");

        /*
        Demonstration of post-loop check
        From the previous section, we know that both counter and average contain values.  We want to divide average
        by the number of values entered, so we can safely assume that we can do at least the first pass of this
        calculation based on the default values (0 for average, and 0 for counter).
            - Set numberOfValues to counter.
            - Take the average calculated in the previous section and divide it by 2
            - Decrement counter.
            - Repeat until counter is 0 (technically, while counter > 0).
            - Once counter has reached 0, exit the loop, and then print out the resulting number
        */
        int numberOfValues = counter;
        do {
            average = average / 2;
            counter--;
        } while (counter > 0);
        System.out.println("Which is the same as adding " + average + " " + numberOfValues + " times.");
    }

    private static boolean isInteger(String s) {
        // Check if s is an integer.  If not, return false.
        // Null safe check for s
        if (s == null) {
            return false;
        }
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
