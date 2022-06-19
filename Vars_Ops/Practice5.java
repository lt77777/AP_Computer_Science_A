
/**
 * Convert money amounts into coin denomination
 * 
 * Larry Tsai 
 * 10SEP2019
 */
import java.util.Scanner;
public class Practice5
{
      public static void main() {
      Scanner myObj = new Scanner(System.in);
      System.out.println("Enter amount in cents");          
          int money = myObj.nextInt();
          
      int quarters = money/25;
      int leftoverA = money%25;
      int dimes = leftoverA/10;
      int leftoverB = leftoverA%10;
      int nickels = leftoverB/5;
      int leftoverC = leftoverB%5;
      int pennies = leftoverC/1;
      System.out.print("number of quarters ");
      System.out.println(quarters);
      System.out.print("number of dimes ");
      System.out.println(dimes);
      System.out.print("number of nickels ");
      System.out.println(nickels);
      System.out.print("number of pennies ");
      System.out.println(pennies);
    }
}
      