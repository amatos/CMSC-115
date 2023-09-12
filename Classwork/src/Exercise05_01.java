import java.util.Scanner;

/*
    A.Matos
    Week 5 Project 1

    (Count positive and negative numbers and compute the average of numbers)
    Write a program that reads an unspecified number of integers, determines how many positive and negative values
    have been read, and computes the total and average of the input values (not counting zeros). Your program ends
    with the input 0. Display the average as a floating-point number.
 */
public class Exercise05_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String providedValue;
        int counter = 0;
        int positive = 0;
        int negative = 0;
        int total = 0;
        double average;

        System.out.print("Enter an integer, the input ends if it is 0: ");
        providedValue = input.nextLine();

        // In case the user did not enter a terminator value (0), we will continue to prompt for input until they do,
        // OR, until they hit Integer.MAX_VALUE.  If they hit Integer.MAX_VALUE, we will terminate input for them.
        // This is to prevent an infinite loop, and to prevent a crash if they enter too many numbers.
        // Counter is used track the number of inputs already entered.  We assume an initial value of the
        // length of (providedValue / 2) + 1, since we use spaces as delimiters.
        counter = (int) (providedValue.length() / 2) + 1;
        while (!providedValue.contains("0")) {
            System.out.print("No terminator (0) was provided.  Continue entering input: ");
            providedValue += input.nextLine();
            counter++;
            if (counter == Integer.MAX_VALUE) {
                System.out.println("You have reached the maximum number of inputs.  Terminating input for you.");
                providedValue += " 0";
            }
        }

        // Iterate through providedValue to split the string into numbers based on a separator of " ".
        // We first check if the value of s is a digit.  If not, we break out of the loop.  If 0 was
        // entered as the only input, we break out of the loop.

        for (String s : providedValue.split(" ")) {
            if (!isNumeric(s)) {
                break;
            }

            if (Integer.parseInt(s) == 0) {
                break;
            }
            if (Integer.parseInt(s) > 0) {
                positive++;
            }
            if (Integer.parseInt(s) < 0) {
                negative++;
            }
            total += Integer.parseInt(s);
        }

        average = (double) total / (positive + negative);

        System.out.println("The number of positives is " + positive);
        System.out.println("The number of negatives is " + negative);
        System.out.println("The total is " + total);

        // Special case for the average.  If only a 0 is entered, we will get a NaN value for average.  If that
        // is the case, we print a message saying that only the terminator was entered, and we can't calculate
        // an average.  Otherwise, we print the average.
        if (Double.isNaN(average)) {
            System.out.println("No numbers are entered except 0");
        } else {
            System.out.println("The average is " + average);
        }

        input.close();
    }

    private static boolean isNumeric(String s) {
        // Check to see if a string is numeric.  If it is, it returns true.  Otherwise, it returns false.
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
