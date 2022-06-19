
/**
 *An object’s momentum is its mass multiplied by its velocity. Write a program that expects an object’s mass (in kilograms) and velocity (in meters per second) as inputs and prints its momentum.
 * 
 * Larry Tsai
 * 13SEP2019
 */
import java.util.Scanner;
public class Momentum
{public static void main () {
    Scanner scanny = new Scanner(System.in);
    System.out.println("Enter the object's mass in kilograms");
    double mass=scanny.nextDouble();
    System.out.println("Enter the object's velocity in meters per second");
    double velocity=scanny.nextDouble();
    double momentum = mass*velocity;
    System.out.println("Your momentum is " + momentum + " kilogram meter per second");
    
    
    
    
}
}