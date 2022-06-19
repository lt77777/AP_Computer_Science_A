
/**
 * Write a program that takes as input a number of kilometers and prints the corresponding number of nautical miles. You may rely on the following items of information:
1. A kilometer represents 1/10000 of the distance between the North Pole and the equator.
2. There are 90 degrees, containing 60 minutes of arc each, between the North Pole and the equator.
3. A nautical mile is 1 minute of an arc.
 * 
 * Lawrence Tsai
 * 16SEP2019
 */
import java.util.Scanner;
public class Nautical_Mile
{
    public static void main() {
         Scanner scanny = new Scanner(System.in);
         System.out.println("Enter number of kilometers");
         double Kilometer = scanny.nextDouble();
         double NauticalMile = Kilometer*0.54;
         System.out.println("That is " + NauticalMile + " Nautical Miles!");
    }
}
    