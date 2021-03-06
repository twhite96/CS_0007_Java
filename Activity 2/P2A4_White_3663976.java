/* Tiffany White
Dice Rolling program, Rockymon, creating different methods to determine if the game is won, lost
or the user should roll again.
Date created: November 3, 2015
Date modified: November 5, 2015
*/

// Imports Random and Scanner classes
import java.util.Scanner;
import java.util.Random;

// Declares the class name
public class P2A4_White_3663976
{
  // This is the main method declaration
  public static void main(String[] args)
  {
    // This calls the runGame method
    runGame();
  }

  // Creates Scanner and Random objects
  public static Scanner keyboard = new Scanner(System.in);
  public static Random r = new Random();

  // Created a new method to be called to run the game
  public static void runGame(){

    // Declares a variable and calls the rollDice method
    int bigStartRoll = rollDice();

    //calls the print Result method and passes the reult of Big Start Roll as an argument
    printResult(bigStartRoll);
  }

  public static int rollDice(){
    int secondRoll = r.nextInt(6) + 1;
    int firstRoll = r.nextInt(6) + 1;
    return secondRoll + firstRoll;
  }


  public static void printResult(int rollValue){
    if (rollValue == 5 || rollValue == 10) {
      System.out.println("Your Big Start Roll Number: " + rollValue + "You've won Rockymon. Congrats!");
    } else if (rollValue == 2 || rollValue == 4 || rollValue == 11) {
      System.out.println("Your Big Start Roll Number: " + rollValue + "You lose.");
    } else if (rollValue != 5 || rollValue != 5 && rollValue == rollValue) {
      System.out.println("Your Big Start Roll Number: " + rollValue + "\n You've entered Match Number Mode.\nRoll again.");

      String again = "";

      do {
        rollValue = rollDice();
        System.out.println("Your result: " + rollValue + "Roll again.");
        again = keyboard.nextLine();
      } while (again.equals("") && rollValue != 5 || rollValue != 5 && rollValue == rollValue);

      if (rollValue == 5) {
        System.out.println("You lose.");
      }
    }
  }
}
