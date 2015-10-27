// Imports the JOptionPane dialogue box
import javax.swing.JOptionPane;

public class White
{
	public static void main(String[] args)
	{
		// Display message to the user
	 input	= JOptionPane.showMessageDialog(msg);
		msg = "Welcome to my sum program.";
	}
}

public class White_2
{
  public static int showSum(int num1, int num2);
	{
	// Get input via dialog box
  String number1 = JOptionPane.showInputDialog("Enter a number.");
	// Stores input from user using parsing
	int num1 = Integer.parseInt(number1);

	// Get input via dialog box
	String number2 = JOptionPane.showInputDialog("Enter another number.");
	//Stores input from user using parsing
	int num2 = Integer.parseInt(number2);

	// Adds input together
	int sum;
	sum = num1 + num2;

	// Shows user sum of input using dialog box
	String message = JOptionPane.showMessageDialog("The sum of the numbers you chose is " + sum);
	}
}
