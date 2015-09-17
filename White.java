import java.util.Scanner;

public class White
{
	public static void main(String[] args)
	{
  Scanner keyboard = new Scanner(System.in);

	System.out.print("Enter your first test score.");

  double firstScore = keyboard.nextDouble();

	System.out.print("Enter your second test score.");

	double secondScore = keyboard.nextDouble();

	System.out.print("Enter your third test score.");

	double thirdScore = keyboard.nextDouble();

	double totalScore = (firstScore + secondScore + thirdScore) / 3;

	System.out.printf("Your class average is %.2f\n", totalScore);
	}
}
