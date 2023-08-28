import java.util.Scanner;

public class Exercise02_05 {
    public static void main( String[ ] args ) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the subtotal and a gratuity rate: ");
        String providedValue = input.nextLine();

        int counter = 0;
        int intSubtotal = 0;
        int intGratuity = 0;
        for (String s : providedValue.split(" ")) {
            if (counter == 0) {
                intSubtotal = Integer.parseInt(s);
            } else if (counter == 1) {
                intGratuity = Integer.parseInt(s);
            }
            counter++;

        }

        double gratuity = (double) intSubtotal * (double) intGratuity / 100;
        double total = (double) intSubtotal + gratuity;

        System.out.println("The gratuitity is $" + gratuity + " and the total is $" + total);

    }
}
