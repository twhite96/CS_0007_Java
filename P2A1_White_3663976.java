/* Tiffany White
Dice Rolling program
Date created: October 13, 2015
Date modified: October 29, 2015
*/
import java.util.Scanner;

public class P2A1_White_3663976
{
	public static void main(String[] args)
	{
    Scanner keyboard = new Scanner(System.in);
    System.out.println("What is your name?");

    String name = keyboard.nextLine();

    System.out.println("Hello, " + name + ".");

    System.out.println("My name is Tiffany, and the game you're playing is called Rockymon.\nYou get one Big Start Roll. If you roll a 5 or 10, you win.\nIf you roll a 2,4, or 11, you lose. If you roll any other number, the big start roll becomes the \"match roll\".\nYou continue to play until one of two things happens: you roll a 5 and you lose or: you roll the match number again and you win.");

	}
}
