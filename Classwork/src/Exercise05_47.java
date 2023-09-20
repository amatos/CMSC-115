import java.util.Scanner;

/*
    A.Matos
    Week 5 Project 6

    (Business: check ISBN-13)
    ISBN-13 is a new standard for identifying books. It uses 13 digits d1d2d3d4d5d6d7d8d9d10d11d12d13. The last
    digit d13 is a checksum, which is calculated from the other digits using the following formula:
    10 - (d1 + 3d2 + d3 + 3d4 + d5 + 3d6 + d7 + 3d8 + d9 + 3d10 + d11 + 3d12) % 10

    If the checksum is 10, replace it with 0. Your program should read the input as a string.
    Display “invalid input” if the input is incorrect.
 */
public class Exercise05_47 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[] isbn = new char[13];
        int counter;
        int checksum = 0;

        System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
        String providedValue = input.nextLine();

        if (providedValue.length() != 12) {
            System.out.println(providedValue + " is an invalid input");
            System.exit(1);
        } else {
            isbn = providedValue.toCharArray();
        }

        for (counter = 0; counter < 12; counter++) {
            if (!Character.isDigit(isbn[counter])) {
                System.out.println(providedValue + " is an invalid input");
                break;
            }
            switch (counter) {
                case 0:
                case 2:
                case 4:
                case 6:
                case 8:
                case 10:
                    checksum += Character.getNumericValue(isbn[counter]);
                    break;
                case 1:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                    checksum += 3 * Character.getNumericValue(isbn[counter]);
                    break;
            }
        }
        checksum = 10 - (checksum % 10);
        if (checksum == 10) {
            checksum = 0;
        }

        System.out.println("The ISBN-13 number is " + providedValue + checksum);
    }
}
