/*

This program accepts two values: a char (F, M) for gender and an int for height in inches.
Once the values have been input and stored they are compared to metrics to determine what the person's
height percentile range is for their gender. Once their placing is determined a message is presented
to them showing where they "stand" compared to other people in the United States.

Here is the reference data used to perform the comparisons:
         Percentile Male Height Female Height
         1% 5'1"  61     4'8" 56
         10% 5'5" 65     5'0" 60
         25% 5'7" 67     5'1" 61
         50% 5'9" 69     5'3" 63
         75% 5'11" 71	   5'5" 65
         90% 6'0"	72     5'6" 66
         99% 6'3"	75     5'9" 69

Source of data: https://dqydj.com/height-percentile-calculator-for-men-and-women/

Nested Ifs: 
Longer due to way you must close each of the statements, and without an IDE it's very easy to loose track
of the closing braces. Even with an IDE, I ran into a couple issues.

Multi-way Ifs:
More compact and less prone to "loosing" end braces. This is my preffered way of handling logic.

Switch statement:
Due to me checking for multiple cases, the logic to check was a bit longer, and I added an If statement
to handle edge cases, but it was still much easier to follow than the Nested If statements.
The only other caveat is that the breaks are a pain to type. There is a "modern" way of handling Switch statements,
but the example given for the course was using the older method so that's what I included.

Here is a link to the "modern" way of expressing Switch statements in Java. This is what I'll use for futher Switch
statements.
https://www.wearedevelopers.com/magazine/modern-java-switch-expressions

Note: Due to the scope of this assignement, I have decided not to add input checking for gender.

*/

import java.util.Scanner;

@SuppressWarnings("ConstantValue")
public class doodle {

    public static void main(String[] args) {

        //int[] i = {3, 4, 3, 2};
        //char[] c = new char[4]{'a', 'b', 'c', 'd'};

        //char[] c = new char();
        //int i = new int(30);

        double d[] = new double[30];




    }


}
