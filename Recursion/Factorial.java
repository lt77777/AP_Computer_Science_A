/**
 * Make a program that will accept an positive integer and return the factorial of that number
 * .Make a Factorial method recursively (receive one int parameter, return the factorial). 
 * Create a client to demonstrate it works correctly this client will demonstrate all of the recursion projects.
Ex.
Enter a positive number to end):(-1 5
5! is 120
Enter a positive number(-1 to end): 3
3! is 6
Enter a positive number(-1 to end): -1
Thank you have a nice day:)
 *
 * Larry Tsai
 * 06MAR2020
 */
import java.util.ArrayList;
public class Factorial
{
    public static int factorial(int x)
   {
       if(x == 1||x==0)
       {
      return 1;
    }
     else
     {
         int k=x * factorial(x - 1);
      return k;
       }
       
        }
        
    }