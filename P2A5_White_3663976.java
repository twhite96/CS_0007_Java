import java.util.Scanner;

public class P2A5_White_3663976
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in)

    System.out.println("Press 1 for the computer to play. Press to for user play.");
    int x = keyboard.nextInt();

    if (x == 1) {
      System.out.println("Enter number of times you want the computer to roll.");
      int n = keyboard.nextInt();
      for(int i = 0; i<n; i++)
    }

    String again = "";

    do {
      System.out.println("Play again?");
      again = keyboard.nextLine();
    } while (again.equals("y"))
  }
}
