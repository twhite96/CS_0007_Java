/* Author name: Tiffany White
This is a budget calculator
Created date: September 22, 2015
Last modified date: September 23, 2015
*/


import java.util.Scanner;

public class P1A5_White_3663976
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

		double grossPay = (regularHoursWorked + overtimeHoursWorked) * hourlyRate;
		System.out.printf("Your gross pay is %.2f\n", grossPay);

		double deductions = (rent + elecBill + waterBill + sewBill + gasBill
		+ foodBudget + entertainment + carExpenses);

		double rentPercentage, elecBillPercentage, waterBillPercentage, sewBillPercentage,
		gasBillPercentage, foodBudgetPercentage, entertainmentPercentage, carExpensesPercentage;

		rentPercentage = (rent * 100) / grossPay;
    System.out.printf("%.2f percent of your gross pay goes to rent.\n", rentPercentage);

    elecBillPercentage = (elecBill * 100) / grossPay;
		System.out.printf("%.2f percent of your gross pay goes to your electric bill.\n", elecBillPercentage);

		waterBillPercentage = (waterBill * 100) / grossPay;
		System.out.printf("%.2f percent of your gross pay goes to your water bill.\n", waterBillPercentage);

		sewBillPercentage = (sewBill * 100) / grossPay;
		System.out.printf("%.2f percent of your gross pay goes to your sewage bill.\n", sewBillPercentage);

		gasBillPercentage = (gasBill * 100) / grossPay;
		System.out.printf("%.2f percent of your gross pay goes to your gas bill.\n", gasBillPercentage);

		foodBudgetPercentage = (foodBudget * 100) / grossPay;
		System.out.printf("%.2f percent of your gross pay goes to your food budget.\n", foodBudgetPercentage);

		entertainmentPercentage = (entertainment * 100) / grossPay;
		System.out.printf("%.2f percent of your gross pay goes to entertainment.\n", entertainmentPercentage);

		carExpensesPercentage = (carExpenses * 100) / grossPay;
		System.out.printf("%.2f percent of your gross pay goes to your car.\n", carExpensesPercentage);
  }
}
