/* Tiffany White
Dice Rolling program, an introduction to Rockymon and instructions
Date created: October 13, 2015
Date modified: October 29, 2015
*/

// Imports Scanner class
import java.util.Scanner;

// Declares the class name
public class P2A1_White_3663976
{
	// This is the main method declaration
	public static void main(String[] args)
	{
		// Creates a new Scanner object
    Scanner keyboard = new Scanner(System.in);

		// Prints out text to the console. Asks for the user's name
		System.out.println("What is your name?");

		// Receives input from the user calling the nextLine method from the Scanner object
    String name = keyboard.nextLine();

		// Prints user's name to screen
    System.out.println("Hello, " + name + ".");

		// Gives description of game, Rockymon
    System.out.println("My name is Tiffany, and the game you're playing is called Rockymon.\nYou get one Big Start Roll. If you roll a 5 or 10, you win.\nIf you roll a 2,4, or 11, you lose. If you roll any other number, the big start roll becomes the \"match roll\".\nYou continue to play until one of two things happens: you roll a 5 and you lose or: you roll the match number again and you win.");

	}
}
