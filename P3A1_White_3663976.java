/* Tiffany White
Rainbow Explosion, is a text-based game that is in the vein of hangman
This activity will introduce the player to the game and store any guesses
Date created: November 19, 2015
Date modified: December 9, 2015
*/

// Imports APIs
import java.util.Scanner;
import java.io.*;

// Class definition
public class P3A1_White_3663976
{	
	// Main method
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		// Welcome message
		System.out.println("Welcome to Rainbow Explosion.You're going to guess a letter. If you guess a correct letter, you win." +
		"If you guess wrong, you get a color tick. If you guess wrong 6 times, the color bomb explodes and you lose.");
		
		// Prompt for input
		System.out.println("Enter a letter.");
		
		// Gets a char from the user as input
		char letter = keyboard.next().charAt(0);
		
		// Runs guessLetter1 method		
		guessLetter1("cat", letter);
	}
	
	// guessLetter1 method	
	public static char guessLetter1(String word, char letter1)
	{	Scanner keyboard = new Scanner(System.in);
		word = "cat";
		word.indexOf(letter1);
		if (letter1 == 'c' || letter1 == 'a' || letter1 == 't') {
		System.out.println("You guessed a correct letter. You win! The secret word is\n cat. Press enter to quit.");
		} else {
		System.out.println("You guessed a letter wrong. You get a red tick."
		+ "_ _ _" + "Game over. Please press enter to quit.");
		}
		
		String quit = "";
		quit = keyboard.nextLine();
		
		return letter1;
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
