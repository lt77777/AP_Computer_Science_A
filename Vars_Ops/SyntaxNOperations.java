
/**
 * Please make a new Project called SyntaxNOperations. The surface area of a cube can be known if we know the length of an edge. 
 * Write a program that takes the length of an edge(an integer) as input and prints the cube’s surface area as output.
 * 
 * Save under Project called SyntaxNOperations.
 * Write a program that takes the radius of a sphere (a double) as input and outputs the sphere’s diameter, circumference, surface area, and volume.
 * 
 * Lawrence Tsai
 *23SEP2019
 */
import java.util.Scanner;
public class SyntaxNOperations
{
    
public static void main (){
    
    Scanner scanny=new Scanner(System.in);
    System.out.println("What is the length of the edge of the cube in meters?");
    double edge=scanny.nextDouble();
    double surfacearea=6*(edge*edge);
    System.out.println("Your cube has a surface area of "+surfacearea+ " square meters");
}
}

    