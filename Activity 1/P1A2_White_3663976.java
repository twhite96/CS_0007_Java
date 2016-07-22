/* Author name: Tiffany White
This is a budget calculator
Created date: September 8, 2015
Last modified date: September 22, 2015
*/

public class P1A2_White_3663976
{
	public static void main(String[] args)
	{
		// This line declares int variables
		int hourlyRate, regularHoursWorked, overtimeHoursWorked, rent, elecBill, waterBill, sewBill, gasBill, foodBudget, entertainment, carExpenses;

		// This line declares a double variable and adds a decimal value
		double overtime = 30.5;

		// These lines add values to the declared int variables above
		hourlyRate = 30;
		regularHoursWorked = 80;
		overtimeHoursWorked = 10;
		rent = 800;
		elecBill = 10;
		waterBill = 15;
		sewBill = 6;
		gasBill = 10;
		foodBudget = 235;
		entertainment = 100;
		carExpenses = 200;

		/* This line prints out the values in the declared variables to the screen,
		adding a new line after each entry
		*/

		System.out.println("hourlyRate = " + hourlyRate + "\n" +
			"overtime = " + overtime + "\n" + "regularHoursWorked = " + regularHoursWorked + "\n" +
			"overtimeHoursWorked = " + overtimeHoursWorked + "\n" +
			"rent = " + rent + "\n" +
			"elecBill = " + elecBill + "\n" +
			"waterBill = " + waterBill + "\n" +
			"sewBill = " + sewBill + "\n" +
			"gasBill = " + gasBill + "\n" +
			"foodBudget = " + foodBudget + "\n" +
			"entertainment =" + entertainment + "\n" +
			"carExpenses = " + carExpenses + "\n");
	}
}
