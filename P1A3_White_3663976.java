/* Author name: Tiffany White
This is a budget calculator
Created date: September 15, 2015
Last modified date: September 23, 2015
*/


// This line imports the Scanner class to the document
import java.util.Scanner;

public class P1A3_White_3663976
{
	public static void main(String[] args)
	{
		// This line declares a scanner variable that will be used to get user input
		Scanner keyboard = new Scanner(System.in);

		// This line will print text to the screen
		System.out.print("What is your name?");

		// This line will get user input and then go to the next line
		String name = keyboard.nextLine();

		/* This line will print out the text from the user input stored in the scanner
		keybaord variable and the text within the parentheses
		*/
		System.out.print("Welcome to Budget Calculator by Tiffany White, " + name +
		". \nIt will calculate your income and expenses.");
	}
}
