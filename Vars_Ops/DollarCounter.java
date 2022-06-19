
/**
 * Convert money amounts into dollar denomination
 * 
 * Larry Tsai 
 * 11SEP2019
 */
import java.util.Scanner;
public class DollarCounter
{
      public static void main() {
      Scanner myObj = new Scanner(System.in);
      System.out.println("Enter amount in dollars");          
          int money = myObj.nextInt();
          
      int quarters = money/20;
      int leftoverA = money%20;
      int dimes = leftoverA/10;
      int leftoverB = leftoverA%10;
      int nickels = leftoverB/5;
      int leftoverC = leftoverB%5;
      int pennies = leftoverC/1;
      System.out.print("number of 20s ");
      System.out.println(quarters);
      System.out.print("number of 10s ");
      System.out.println(dimes);
      System.out.print("number of 5s ");
      System.out.println(nickels);
      System.out.print("number of 1s ");
      System.out.println(pennies);
    }
}
      