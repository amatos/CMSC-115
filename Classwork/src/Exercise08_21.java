/*
    A.Matos
    Chapter 8 Project 5:

    (Central city)
    Given a set of cities, the central city is the city that has the shortest total distance
    to all other cities.
    Write a program that prompts the user to enter the number of the cities and the locations
    of the cities (coordinates), and finds the central city and its total distance to all other cities.

    Sample Run
    Enter the number of cities: 5
    Enter the coordinates of the cities:  2.5 5  5.1 3  1 9  5.4 54  5.5 2.1
    The central city is at (2.5, 5.0)
    The total distance to all other cities is 60.81

    Class Name: Exercise08_21
*/

import java.util.Scanner;

public class Exercise08_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of cities: ");
        int numberOfCities = input.nextInt();
        System.out.print("Enter the coordinates of the cities: ");
        // We know that the user will enter 2 numbers per city, so we create a 2d array to contain the city
        // and coordinates.  We also create a 2d array to contain the distance between each city.
        double[][] cityLocation = new double[numberOfCities][2];
        double[][] cityDistance = new double[numberOfCities][numberOfCities];

        // Populate the cityLocation array with user input.
        for (int counter = 0; counter < numberOfCities; counter++) {
            cityLocation[counter][0] = input.nextDouble();
            cityLocation[counter][1] = input.nextDouble();
        }

        // Next we populate the cityDistance array with the distance between each city
        // Since we're on a 2d grid (no elevation), we can measure distance between each city using the formula
        // for calculating the hypotenuse of a right triangle, which is the square root of the sum of the squares of the
        // two sides of the triangle.  In this case, sqrt((x1 - x2)^2 + (y1 - y2)^2).
        for (int counter1 = 0; counter1 < numberOfCities; counter1++) {
            for (int counter2 = 0; counter2 < numberOfCities; counter2++) {
                cityDistance[counter1][counter2] = Math.sqrt(Math.pow(cityLocation[counter1][0] - cityLocation[counter2][0], 2) + Math.pow(cityLocation[counter1][1] - cityLocation[counter2][1], 2));
            }
        }

        // Now we find the central city by finding the city with the shortest total distance to all other cities
        // findCentralCity() returns the index of the central city, so we can get the X and Y coordinates of it
        // by using the index to access the cityLocation array.
        int centralCity = findCentralCity(cityDistance);
        double centralCityX = cityLocation[centralCity][0];
        double centralCityY = cityLocation[centralCity][1];

        // Now we calculate the total distance to all other cities by adding up the distances in cityDistance that
        // matches the index of centralCity.
        double totalDistance = 0;
        for (double distance : cityDistance[centralCity]) {
            totalDistance += distance;
        }

        // Lastly, we output the results.
        System.out.println("The central city is at (" + centralCityX + ", " + centralCityY + ")");
        System.out.println("The total distance to all other cities is " + String.format("%.2f", totalDistance));
    }

    private static int findCentralCity(double[][] cityDistance) {
        double[] totalDistance = new double[cityDistance.length];
        double minDistance = 0;
        int centralCity = 0;

        // First we calculate the total distance to all other cities for each city and store it in the totalDistance array.
        for (int counter1 = 0; counter1 < cityDistance.length; counter1++) {
            for (int counter2 = 0; counter2 < cityDistance.length; counter2++) {
                totalDistance[counter1] += cityDistance[counter1][counter2];
            }
        }

        // Assume that the first city is centralCity.
        minDistance = totalDistance[0];

        // Now we iterate through totalDistance to find the city with the shortest total distance to all other cities.
        // As we iterate through the array, we look for a distance that is smaller than minDistance.  If we find one,
        // then we set minDistance to that distance, and set centralCity to that city's index.
        // If we don't find a smaller distance, then the first city _was_ the centralCity after all.
        for (int counter = 0; counter < totalDistance.length; counter++) {
            if (totalDistance[counter] < minDistance) {
                minDistance = totalDistance[counter];
                centralCity = counter;
            }
        }

        // Return the index of centralCity.
        return centralCity;
    }
}
