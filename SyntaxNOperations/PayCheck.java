
/**
 *An employee’s total weekly pay equals the hourly wage multiplied by the total number of regular hours plus any overtime pay. 
 *Overtime pay equals the total overtime hours multiplied by 1.5 times the hourly wage.
 *Write a program that takes as inputs the hourly wage, total regular hours, and total overtime hours and displays an employee’s total weekly pay. The output should be displayed in a nice way. Use appropriate Data types for each variable.
 * 
 * Modify (PayCheck) so that it prompts the user for the regular and overtime hours of each of five working days.
 * Lawrence Tsai 
 * 23SEP2019
 */
import java.util.Scanner;
public class PayCheck
{
    public static void main (){
        Scanner scanny = new Scanner(System.in);
    System.out.println("Enter your hourly wage");
    double wage=scanny.nextDouble();
    System.out.println("Enter your total regular hours for Monday");
    double mon=scanny.nextDouble();
    System.out.println("Enter your total overtime hours for Monday");
    double mon2=scanny.nextDouble();
    System.out.println("Enter your total regular hours for Tuesday");
    double tue=scanny.nextDouble();
    System.out.println("Enter your total overtime hours for Tuesday");
    double tue2=scanny.nextDouble();
    System.out.println("Enter your total regular hours for Wednesday");
    double wed=scanny.nextDouble();
    System.out.println("Enter your total overtime hours for Wednesday");
    double wed2=scanny.nextDouble();
    System.out.println("Enter your total regular hours for Thursday");
    double thur=scanny.nextDouble();
    System.out.println("Enter your total overtime hours for Thursday");
    double thur2=scanny.nextDouble();
    System.out.println("Enter your total regular hours for Friday");
    double fri=scanny.nextDouble();
    System.out.println("Enter your total overtime hours for Friday");
    double fri2=scanny.nextDouble();
    double pay=(wage)*(mon+tue+wed+thur+fri+((double)3/2)*(mon2+tue2+wed2+thur2+fri2));
    System.out.println("Your weekly pay is "+ pay + " dollars");
        
        
    }
}