/* Tiffany White
Dice Rolling program, Rockymon, rolling the Big Start Roll and considering if the user needs to
take further action
Date created: October 31, 2015
Modified date: November 3, 2015
*/

// Imports Random and Scanner classes
import java.util.Random;
import java.util.Scanner;

// Declares the class name
public class P2A3_White_3663976
{
  // This is the main method declaration
  public static void main(String[] args)
  {
    // Creates Scanner and Random objects
    Scanner keyboard = new Scanner(System.in);
    Random r = new Random();

    // Declares and initializes variables for rolls and calls the random method
    int secondRoll = r.nextInt(6) + 1;
    int firstRoll = r.nextInt(6) + 1;
    int bigStartRoll = secondRoll + firstRoll;

    // Prints result of Big Start Roll to screen
    System.out.println("Your Big Start Roll result: " + bigStartRoll);

    // Determines in Big Start Roll is a 5 or 10
    if (bigStartRoll == 5 || bigStartRoll == 10) {

      // Prints out the user has won
      System.out.println("You've won Rockymon. Congrats!");
    } else {

      // Otherwise it prints out user may need to do something else.
      System.out.println("You may need to take further action.");
    }
  }
}
