/* Tiffany White
Rainbow Explosion, is a text-based game that is in the vein of hangman
This activity will introduce the player to the game and store any guesses
Date created: November 19, 2015
Date modified: December 9, 2015
*/

// This imports class apis into the program
import java.util.Scanner;
import java.io.*;

// This is a class declaration
public class P3A2_White_3663976
{	
	// Main method
	public static void main(String[] args) throws IOException
	{
		Scanner keyboard = new Scanner(System.in);
		PrintWriter outputFile = new PrintWriter("P3A2_White_3663976.txt");
		
		// These are the words that were supposed to be printed to the text file if it had compiled
		outputFile.println("cat");
		outputFile.println("dog");
		outputFile.println("mom");
		outputFile.println("car");
		outputFile.println("dad");
		
		// This was to read the words from the file but I am pretty sure I should have used readLine()
		File myFile = new File("P3A2_White_3663976.txt");
		
		// Closes the text file
		outputFile.close();
		
		// Welcome message
		System.out.println("Welcome to Rainbow Explosion.You're going to guess a letter. If you guess a correct letter, you win." +
		"If you guess wrong, you get a color tick. If you guess wrong 6 times, the color bomb explodes and you lose.");
		
		// Prompt for input
		System.out.println("Enter a letter.");
		
		// Get a letter as input
		char letter = keyboard.next().charAt(0);
		
		// runs guessLetter1 method		
		guessLetter1(word, letter);
	}
	
	// guessLetter1 method declaration	
	public static char guessLetter1(String word[], char letter1)
	{	Scanner keyboard = new Scanner(System.in);
		
		word = new String[5]; 
		
		word[0].charAt(0);
		
		for (int i = 0; i < word.length(); i++) {
		if (word[i] != null) {
			System.out.println("You guesses a correct letter!")

		}
		char guessAgain = '';
		do {
			Scanner keyboard = new Scanner(System.in);
			guessAgain = keyboard.next.charAt(0);
		} while (guessAgain != 'c' && guessAgain != 't' && guessAgain != 'a' &&  guessAgain != 'm' && guessAgain != 'd' &&
		guessAgain != 'g' && guessAgain != 'r' && guessAgain != 'o');
		
		return letter1;
		}
	}
}

	







//Use System.out.println to print out welcome message, player instructions, and a placeholder for the secret word to the console.
//Use a string to print out blank underscores to the screen to represent the secret word the player is trying to guess
//Secret Word: JavaScript

//Player must guess letter to see if letter is in secret word.
//Use Scanner class and Scanner oject to get input
//If player guesses a correct letter, underscores and correct letter need printed to screen
//Can use two print line statements to print underscores and word on new lines
//Player has won that round

//If letter is not in secret word, the letter guessed plus blank underscores and correctly
//Incorrect guesses get a tick
//Player can only accumulate 6 ticks or he loses game and bomb goes off
//Each incorrect guess gets a color that is printed to the screen using System.out.println, based on how many ticks the player gets
//Player wins by guessing the word. Print to the console when the player wins and the secret word
