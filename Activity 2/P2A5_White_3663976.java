/* Tiffany White
Dice Rolling program, Rockymon. This gives the user the opportunity to let the computer play
or if the user wants to play as well, and how many times the computer will roll.
Date created: November 3, 2015
Date modified: November 4, 2015
*/


import java.util.Scanner;

public class P2A5_White_3663976
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Press 1 for the computer to play. Press 2 for user play.");
    int x = keyboard.nextInt();


    if (x == 1) {
      P2A4_White_3663976.main(args);
    }

    if (x == 2) {
      System.out.println("Enter number of times you want the computer to roll.");
      int n = keyboard.nextInt();
      for(int i = 0; i<n; i++) {}

        String again = "";

        do {
          System.out.println("Play again?");
          again = keyboard.nextLine();
        } while (again.equals("y"));
      }
    }
  }
