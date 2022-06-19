/**
 * 
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
 * 
 * 
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Client
{
    public static void main()
       {
           Scanner scanny=new Scanner(System.in);
           // for(int e=1; e<2; e--)
           // {
               
           // System.out.println("Enter a positive number to(-1 to end)");
           // int w=scanny.nextInt();
           // if(w==-1)
           // { break;}
           // int x=Factorial.factorial(w);
          // System.out.println(w+"! is " + x);
        // }
        
        System.out.println("How long is your list of integers?");
        int e=scanny.nextInt();
        ArrayList x=new ArrayList();
        for(int i=0;i<e;i++)
        {
            System.out.println("Enter an integer");
            x.add(scanny.nextInt());
            
        }
        int r=(EvenCount.EvenCount(e-1,x,0));
        System.out.println("There are " + r + " even numbers in your list of integers");
        
        // System.out.println("What line of Pascal's Triangle would you like?");
        // int s=scanny.nextInt()-1;
        // Pascal.print (Pascal.Pascal(s));
        
    }
}