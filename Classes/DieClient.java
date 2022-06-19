
/**
 * - Create a class called Die. It has 1 method, roll( ), which receives 1 parameter. 
 * This parameter is the number of sides the die has. 
 * In the method, roll the die, and return (***but don’t display***) the result. 
 * Next, create a client, DieClient, that asks how many sides the die has, then rolls the die once (by calling the method) and displays the result.
- Create a second client called BoxCars. 
It rolls a pair of 6-sided dice 36000 times (do this by using, but not changing at all, the Die class). 
Display all the rolls, and count how many times “boxcars” (a pair of 6’s) occurs.
 *
 * Lawrence Tsai
 * 18NOV2019
 */
import java.util.Scanner;
public class DieClient
{ public static void main(){

    
    Scanner scanny=new Scanner(System.in);
    System.out.println("How many sides?");
    int Sides=scanny.nextInt();
    Die die1=new Die(Sides);
   int x=die1.roll(Sides,1);
 
    System.out.println(x);
}
}