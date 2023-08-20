public class Exercise01_11 {
    public static void main(String[] args) {
        int days_per_year = 365;
        int hours_per_day = 24;
        int minutes_per_hour = 60;
        int seconds_per_minute = 60;
        int seconds_per_year = seconds_per_minute * minutes_per_hour * hours_per_day * days_per_year;

        double birth_per_year = seconds_per_year / 7.0;
        double deaths_per_year = seconds_per_year / 13.0;
        double immigration_per_year = seconds_per_year / 45.0;

        double population = 312032486;

        for (int counter = 1; counter < 6 ; counter++) {
            population = population + birth_per_year - deaths_per_year + immigration_per_year;
            if (counter == 1) {
                System.out.println("Population after " + counter + " year: " + population);
            } else {
                System.out.println("Population after " + counter + " years: " + population);
            }
        }
    }
}
