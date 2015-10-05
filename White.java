import java.util.Scanner;
import java.io.*;

public class White
{
	public static void main(String[] args) throws IOException
	{
		// Gets the PrintWriter and Scanner classes
		PrintWriter file = new PrintWriter("names.txt");
		Scanner keyboard = new Scanner(System.in);
		String friendName = "";
		// Gets data and writes it to a file
		for (int i = 1; i <= 3; i++)
		{
			//Gets name of friend
			System.out.print("Enter the name of friend number " + i + ": ");
			friendName = keyboard.nextLine();
			file.println(friendName);
			System.out.println(friendName);
		}

		FileWriter fw = new FileWriter("names.txt", true);
		PrintWriter pw = new PrintWriter(fw);
		for (int i = 4; i <= 6; i++)
		{
			//Gets name of friend
			System.out.print("Enter the name of friend number " + i + ": ");
			friendName = keyboard.nextLine();
			file.println(friendName);
			System.out.println(friendName);

		}

		file.close();
	}
}
