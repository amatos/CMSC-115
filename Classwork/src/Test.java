public class Test {
 public static void main(String[] args) {

  /* The purpose of this program is to demonstrate the difference between pass-by-value and pass-by-reference when
   * implementing methods in Java. This program will generate a random number, call the passByValue method with 1 argument.
   * When the method is complete the value for the argument will be unchanged - therefore it is a pass-by-value.
   */
  System.out.println("Pass By Value Output: ");
  double example = Math.round(Math.random() * 10); //The next 2 lines of code will generate a random number and display it for the user (NDA)
  System.out.println("The current value of example is " + example);

  /**Here we will call the passByValue method, when the method is complete it will display the value of example 1 (NDA)*/
  System.out.println("The value of example is still " + (passByValue(example)));	/**Notice that even though example is used in the method,the
   original value is unchanged once the method terminates. (NDA)*/
  System.out.println(" ");
  System.out.println("Pass By Reference Output: "); //Display the output difference start line
  System.out.println("The current value of example is " + example);

  //Here we will call the passByReference method, when the method is complete it will return the new value to the argument example.
  System.out.println("The current value of example is " + (passByReference(example))); /**Notice that when the method terminates the new value
   used in the example is now the current value (NDA)*/
 }
 //In the next 7 lines of code demonstrate the what a pass by value is
 //Define the method signature to return 1 argument
 public static double passByValue(double example) {

  double newExample = (example + 5); //Add 5 to what ever number is generated
  System.out.println("The new value of example is " + newExample); //Display the new value

  return example; /**example was not given a new value therefore the return will be null as an argument (NDA)*/
 }
 //In the next 7 lines of code demonstrate the what a pass by value is
 //Define the method signature to return 1 argument
 static double passByReference(double example) {

  double newExample = (example + 5); //Add 5 to what ever number is generated
  System.out.println("The new value of example is " + newExample); //Display the new value

  return newExample; /**In this case example was given a new value therefore the return will be the generated number * 5 (NDA)*/
 }
}
