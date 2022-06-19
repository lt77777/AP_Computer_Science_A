
/**
 * Find the integral of a single variable
 * 
 * Larry Tsai 
 * 11SEP2019
 */
import java.util.Scanner;
public class Integrater
{
      public static void main() {
      Scanner myObj1 = new Scanner(System.in);
      System.out.println("Enter coefficient of X");          
          double coefficient = myObj1.nextDouble();
      Scanner myObj2 = new Scanner(System.in);
      System.out.println("Enter power of X"); 
       double power = myObj2.nextDouble();
       Scanner myObj3 = new Scanner(System.in);
      System.out.println("Enter X value of known point"); 
       double x = myObj3.nextDouble();
       Scanner myObj4 = new Scanner(System.in);
       System.out.println("Enter Y value of known point"); 
       double y = myObj4.nextDouble();
      double coefficientanswer = coefficient/++power;
      double poweranswer = power+1;
      System.out.println("Answer");
      System.out.print(coefficientanswer);
      System.out.print("X^");
      System.out.print(poweranswer);
      System.out.print("+(");
      double constant = (y-((Math.pow(x,poweranswer))*coefficientanswer));
      System.out.print(constant);
      System.out.print(")");
    }
}
      