
/**
 * Save under Project called SyntaxNOperations. 
 * Write a program that takes the radius of a sphere (a double) as input and outputs the sphere’s diameter, circumference, surface area, and volume.
 * 
 * Lawrence Tsai
 * 23SEP2019
 */

   import java.util.Scanner;
public class Sphere
{
    
public static void main (){
    
    Scanner scanny=new Scanner(System.in);
    System.out.println("What is the radius of the sphere in meters?");
    double e=scanny.nextDouble();
    double a=(2*e);
    double b=(2*Math.PI*e);
    double c=(4*Math.PI*e*e);
    double d=(((double) 4/3)*Math.PI*(e*e*e));
    System.out.println("Your sphere has a diameter of "+ a + " meters");
     System.out.println("Your sphere has a circumference of "+ b + " meters");
      System.out.println("Your sphere has a surface area of "+ c + " square meters");
       System.out.println("Your sphere has a volume of "+ d + " cube meters");
}
}