/* Author name: Tiffany White
This is a budget calculator
Created date: September 15, 2015
Last modified date: September 15, 2015
*/

import java.util.Scanner;

public class P1A3_White_3663976
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("What is your name?");
		String name = keyboard.nextLine();
		System.out.print("Welcome to Budget Calculator by Tiffany White, " + name +
		". \nIt will calculate your income and expenses.");
	}
}
