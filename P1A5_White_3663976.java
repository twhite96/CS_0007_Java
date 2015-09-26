/* Author name: Tiffany White
This is a budget calculator
Created date: September 22, 2015
Last modified date: September 24, 2015
*/

// This line imports the Scanner class to the document
import java.util.Scanner;

public class P1A5_White_3663976
{
	public static void main(String[] args)
	{
		// This line declares a scanner variable that will be used to get user input
		Scanner keyboard = new Scanner(System.in);

		// This line prints text to the screen
		System.out.println("Welcome to Budget Calculator by Tiffany White. It will calculate your income and expenses.");

		// The lines like these print instructions to the screen and then get user input
    System.out.print("Enter your name.");
		String name = keyboard.nextLine();

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

		// This line calculates the user's gross pay
		double grossPay = (regularHoursWorked + overtimeHoursWorked) * hourlyRate;

		//This format string prints out the reults of the grossPay calculation and returns a new line
		System.out.printf("Your gross pay is $" + "%.2f\n", grossPay);

		// This line calculates expenses/deductions
		double deductions = (rent + elecBill + waterBill + sewBill + gasBill
		+ foodBudget + entertainment + carExpenses);

		// This line declares variables in the double primitive data type
		double rentPercentage, elecBillPercentage, waterBillPercentage, sewBillPercentage,
		gasBillPercentage, foodBudgetPercentage, entertainmentPercentage, carExpensesPercentage;

		/* The following lines of code calculate the percentages of each deduction against
		the user's gross pay and prints out the results to the console, returning a new line
		*/
		rentPercentage = (rent * 100) / grossPay;
    System.out.printf("The amount of your gross pay that goes to rent is %.2f%%.\n", rentPercentage);

    elecBillPercentage = (elecBill * 100) / grossPay;
		System.out.printf("The amount of your gross pay that goes to your electric bill is %.2f%%.\n", elecBillPercentage);

		waterBillPercentage = (waterBill * 100) / grossPay;
		System.out.printf("The amount of your gross pay that goes to your water bill is %.2f%%.\n", waterBillPercentage);

		sewBillPercentage = (sewBill * 100) / grossPay;
		System.out.printf("The amount of your gross pay that goes to sewage is %.2f%%.\n", sewBillPercentage);

		gasBillPercentage = (gasBill * 100) / grossPay;
		System.out.printf("The amount of your gross pay that goes to gas is %.2f%%.\n", gasBillPercentage);

		foodBudgetPercentage = (foodBudget * 100) / grossPay;
		System.out.printf("The amount of your gross pay that goes to food is %.2f%%.\n", foodBudgetPercentage);

		entertainmentPercentage = (entertainment * 100) / grossPay;
		System.out.printf("The amount of your gross pay that goes to entertainment is %.2f%%.\n", entertainmentPercentage);

		carExpensesPercentage = (carExpenses * 100) / grossPay;
		System.out.printf("The amount of your gross pay that goes to your car is %.2f%%.\n", carExpensesPercentage);

		// This line calculates net pay after deductions are subtracted from the gross pay
    double netPay = (grossPay - deductions);

		// This format string prints out the net pay to the console and returns a new line
		System.out.printf("Your net pay after deductions is $" + "%.2f.\n", netPay);
  }
}
