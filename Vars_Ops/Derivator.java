
/**
 * Find the derivative of a single variable  
 * 
 * Larry Tsai 
 * 11SEP2019
 */
import java.util.Scanner;
public class Derivator
{
      public static void main() {
      Scanner myObj1 = new Scanner(System.in);
      System.out.println("Enter coefficient of X");          
          double coefficient = myObj1.nextDouble();
      Scanner myObj2 = new Scanner(System.in);
      System.out.println("Enter power of X"); 
       double power = myObj2.nextDouble();
      double coefficientanswer = coefficient*power;
      double poweranswer = power-1;
      System.out.println("Answer");
      System.out.print(coefficientanswer);
      System.out.print("X^");
      System.out.print(poweranswer);
    }
}
          