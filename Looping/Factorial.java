
/**
 * Run the code below with inputs of 5, 10 and 20. 
 * Notice that the number for the last output is large but negative. 
 * Place an output statement in the loop so that you can view the value of count and number on each pass. Can you explain what the problem is?
 * 
 * 
 * Now change the type of product from int to long, 
 * recompile the program, and run it again with the same inputs. 
 * Explain what happens in a comment at the end of your program. 
 * How large does the input have to be before you encounter the same problem again? (see code below, and yes you can copy and paste)


}
}
 * Larry Tsai
 * 22OCT2019
 */
import java.util.Scanner;

public class Factorial
{
public static void main()
{
Scanner reader = new Scanner(System.in);
System.out.print("Enter a number greater than 0: ");
int number = reader.nextInt();
long product = 1;
int count = 1;
while(count<= number)
{
product = product * count;
System.out.println(product);
System.out.println("count: "+count);
System.out.println("number: "+number);
count++;
}
System.out.println("The factorial of " + number + " is " + product + ".");
}
}
//There is a max amount of bits for the numbers for an int but long allows for larger numbers. Once the number exceeds the max, it will turn negative. Past an input of 20, the problem occurs again. 