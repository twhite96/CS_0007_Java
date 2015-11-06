/* Tiffany White
Dice Rolling program, Rockymon, rolling the Big Start Roll and considering if the user needs to
take further action
Date created: October 31, 2015
Modified date: November 3, 2015
*/

import java.util.Random;
import java.util.Scanner;

public class P2A3_White_3663976
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in)
    Random r = new Random();

    int secondRoll = r.nextInt(6) + 1;
    int firstRoll = r.nextInt(6) + 1;
    int bigStartRoll secondRoll + firstRoll;

    System.out.println("Your Big Start Roll result: " + bigStartRoll);
    if (bigStartRoll == 5 || 10) {
      System.out.println("You've won Rockymon. Congrats!");
    } else {
      System.out.println("You may need to take further action.";)
    }
  }
}
