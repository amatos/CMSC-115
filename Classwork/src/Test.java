
import java.util.Scanner;
public class Test {
/*

This application has two methods:
1) A method to take user integer input and convert it to the lower-case ASCII character representation
stored in a single dimensional array.
2) A method that prints both lower and upper-case character represenatations using values stored
in a multi-dimensional array.

*/


 public static void main(String[] args) {

  // Single Dimensional Array
  String[] fruits = {"Apple", "Banana", "Cherry", "Date", "Elderberry"}; // initializing a single-dimensional array

  System.out.println("Single Dimensional Array:");
  for(String fruit: fruits) {
   System.out.println(fruit); // printing the elements of the single-dimensional array
  }


  // Multi Dimensional Array
  // A two-dimensional array (3x3 Matrix) for storing integer values
  int[][] matrix = {
          {1, 2, 3},
          {4, 5, 6},
          {7, 8, 9}
  }; // initializing a two-dimensional array

  System.out.println("Multi Dimensional Array (Matrix):");
  for(int i = 0; i < matrix.length; i++) { // iterating over rows
   for(int j = 0; j < matrix[i].length; j++) { // iterating over columns
    System.out.print(matrix[i][j] + " "); // printing elements of the two-dimensional array
   }
   System.out.println(); // changing the line after printing each row
  }
 }

 }
