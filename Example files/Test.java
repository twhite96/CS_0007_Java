import java.util.Scanner;
import java.io.*;
import java.util.Random;

public class Test
{
	public static void main(String[] args) throws IOException
	{
		Scanner keyboard = new Scanner(System.in);
		PrintWriter outputFile = new PrintWriter("P3A2_White_3663976.txt");
		
		outputFile.println("cat");
		outputFile.println("dog");
		outputFile.println("mom");
		outputFile.println("car");
		outputFile.println("dad");
		
		File myFile = new File("P3A2_White_3663976.txt");
		
		String numberLines = countLines("P3A2_White_3663976.txt");
		Random rand = new Random();
		
		
		outputFile.close();
	}
}