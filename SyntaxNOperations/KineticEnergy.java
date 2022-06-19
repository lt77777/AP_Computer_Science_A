
/**
 *An object’s momentum is its mass multiplied by its velocity. Write a program that expects an object’s mass (in kilograms) and velocity (in meters per second) as inputs and prints its momentum.
 * Create under SystaxNOperations!!! The kinetic energy of a moving object is given by the formula KE=(1/2)mv^2, where m is the object’s mass and v is its velocity. 
 * Modify the program momentum from above so that it prints the object’s kinetic energy as well as its momentum.
 * Larry Tsai
 * 23SEP2019
 */
import java.util.Scanner;
public class KineticEnergy
{public static void main () {
    Scanner scanny = new Scanner(System.in);
    System.out.println("Enter the object's mass in kilograms");
    double mass=scanny.nextDouble();
    System.out.println("Enter the object's velocity in meters per second");
    double velocity=scanny.nextDouble();
    double momentum = mass*velocity;
    double kinetic=(((double)1/2)*mass*(velocity*velocity));
    System.out.println("Your momentum is " + momentum + " kilogram meter per second");
    System.out.println("Your kinetic energy is " + kinetic + " joules");
    
    
    
}
}