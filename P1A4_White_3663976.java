/* Author name: Tiffany White
This is a budget calculator
Created date: September 22, 2015
Last modified date: September 24, 2015
*/

// This line imports the Scanner
import java.util.Scanner;

// This declares the public class
public class P1A4_White_3663976
{
	public static void main(String[] args)
	{
		// This line declares adds the Scanner class
		Scanner keyboard = new Scanner(System.in);

		// This line prints out text to the screen
	  System.out.print("Enter your hourly rate.");

		// lines like these get user input from the keyboard and make them a double primitive data type
		double hourlyRate = keyboard.nextDouble();

		System.out.print("Enter your reguar hours worked.");
		int regularHoursWorked = keyboard.nextInt();

		System.out.print("Enter your overtime hours worked.");
		double overtimeHoursWorked = keyboard.nextDouble();

		// Clears keyboard buffer
		keyboard.nextLine();


		System.out.print("Enter your rent.");
		double rent = keyboard.nextDouble();

		System.out.print("Enter your electric bill amount.");
		double elecBill = keyboard.nextDouble();

		System.out.print("Enter the amount of your water bill.");
		double waterBill = keyboard.nextDouble();

		// Clears keyboard buffer
		keyboard.nextLine();


		System.out.print("Enter the amount of your sewage bill.");
		double sewBill = keyboard.nextDouble();

		System.out.print("Enter the amount of your gas bill.");
		double gasBill = keyboard.nextDouble();

		System.out.print("Enter the amount of your food budget.");
		double foodBudget = keyboard.nextDouble();

		// Clears keyboard buffer
		keyboard.nextLine();


		System.out.print("Enter the amount of your entertainment expenses.");
		double entertainment = keyboard.nextDouble();

		System.out.print("Enter the amount of your car expenses.");
		double carExpenses = keyboard.nextDouble();

		// Clears keyboard buffer
		keyboard.nextLine();

	}
}
