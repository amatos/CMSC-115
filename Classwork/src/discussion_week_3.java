import java.util.Scanner;

/*
    A.Matos
    Week 3 discussion:
    Demonstrate nested if statements, multi-if statements, and switch-case statements.
 */
public class discussion_week_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the current temperature in F
        System.out.print("Please enter the temperature in F: ");
        float tempF = input.nextFloat();
        float tempC = new discussion_week_3().convertCelsius(tempF);
        System.out.println("In Celsius, the temperature is " + String.format("%.2f", tempC));

        // Nested if example
        System.out.println("Using nested if:");
        if (tempC <= 0) {
            System.out.println("This is freezing cold.  Wear a parka.");
        } else {
            if ((tempC > 0) && (tempC <= 10)) {
                System.out.println("This is cold.  Bring a coat or jacket.");
            } else {
                if ((tempC > 10) && (tempC <= 20)) {
                    System.out.println("This is comfortably cool.  Bright a light jacket.");
                } else {
                    if ((tempC > 20) && (tempC <= 30)) {
                        System.out.println("This is comfortably warm.  T-shirt weather for sure.");
                    } else {
                        if ((tempC > 30) && (tempC <= 40)) {
                            System.out.println("This is hot weather.  Are you sure you want to go outside?");
                        } else {
                            if ((tempC > 40) && (tempC <= 50)) {
                                System.out.println("This is dangerously hot.  You should stay inside.");
                            } else {
                                if ((tempC > 50) && (tempC < 100)) {
                                    System.out.println("This is deadly hot.");
                                } else {
                                    if (tempC >= 100) {
                                        System.out.println("This is boiling.  You have died.");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        // Multi-way if example
        // More compact than nested-ifs
        System.out.println("Using Mutli-way if:");
        if (tempC <= 0) {
            System.out.println("This is freezing cold.  Wear a parka.");
        } else if ((tempC > 0) && (tempC <= 10)) {
            System.out.println("This is cold.  Bring a coat or jacket.");
        } else if ((tempC > 10) && (tempC <= 20)) {
            System.out.println("This is comfortably cool.  Bright a light jacket.");
        } else if ((tempC > 20) && (tempC <= 30)) {
            System.out.println("This is comfortably warm.  T-shirt weather for sure.");
        } else if ((tempC > 30) && (tempC <= 40)) {
            System.out.println("This is hot weather.  Are you sure you want to go outside?");
        } else if ((tempC > 40) && (tempC <= 50)) {
            System.out.println("This is dangerously hot.  You should stay inside.");
        } else if ((tempC > 50) && (tempC < 100)) {
            System.out.println("This is deadly hot.");
        } else if (tempC >= 100) {
            System.out.println("This is boiling.  You have died.");
        }

        // Switch example
        System.out.println("Using switch:");
        // To make this a simple switch statement, we take tempC, cast it to an int, and divide by 10.
        // Since we don't care about the digit in the one's place, only the range in 10s degree Celsius
        // In the default, we'll handle cases of <= 0 degrees C or >= 100 degrees C.
        switch ((int) tempC / 10) {
            case 0:
                System.out.println("This is cold.  Bring a coat or jacket.");
                break;
            case 1:
                System.out.println("This is comfortably cool.  Bright a light jacket.");
                break;
            case 2:
                System.out.println("This is comfortably warm.  T-shirt weather for sure.");
                break;
            case 3:
                System.out.println("This is hot weather.  Are you sure you want to go outside?");
                break;
            case 4:
                System.out.println("This is dangerously hot.  You should stay inside.");
                break;
            case 5: case 6: case 7: case 8: case 9: case 10:
                System.out.println("This is deadly hot.");
                break;
            default:
                // Handle the two one-off cases of tempC <= 0C or >=100C
                if (tempC <= 0) {
                    System.out.println("This is freezing cold.  Wear a parka.");
                } else if (tempC >= 100) {
                    System.out.println("This is boiling.  You have died.");
                }
                break;

        }

        input.close();


    }

    public float convertCelsius ( float f){
        float celcius = (((f - 32) * 5) / 9);
        return celcius;
    }
}
