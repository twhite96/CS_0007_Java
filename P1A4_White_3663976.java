/* Author name: Tiffany White
This is a budget calculator
Created date: September 22, 2015
*/

import java.util.Scanner;

public class P1A4_White_3663976
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
	  System.out.print("Enter your hourly rate.");
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
