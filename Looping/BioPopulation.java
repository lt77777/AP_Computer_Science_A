
/**
 * A local biologist needs a program to predict population growth. 
 * The inputs would be the initial number of organisms, the rate of growth (a real number greater than 0),
 * the number of hours it takes to achieve this rate, and a number of hours during which the population grows. 
 * For example, one might start with a population of 500 organisms, a growth rate of 2, and a growth period to achieve this rate of 6 hours.
 * Assuming that none of the organisms die, this would imply that the population would double in size every 6 hours. 
 * Thus, after allowing 6 hours for growth, we would have 1000 organisms, and after 12 hours, we would have 2000 organisms. 
 * Write a program that takes these inputs and displays a prediction of the total population. Use a LOOP not the formula.
 *
 *Larry Tsai
 * 14OCT2019
 */
import java.util.Scanner;
public class BioPopulation
{
    public static void main(){

        Scanner scanny=new Scanner(System.in);
        System.out.println("What is the initial number of organisms?");
        int initial=scanny.nextInt();
        System.out.println("What is the rate of growth(real number greater than 0)?");
        double rate=scanny.nextDouble();
        System.out.println("How many hours until this rate is achieved?");
        int hours1=scanny.nextInt();
        System.out.println("How many hours is the population growing?");
        int hours2=scanny.nextInt();

        double population=0;
        for(double i = 1; i<=hours2/hours1; i+=hours1){
            population=initial*rate*hours2/hours1;

        }


        
        

        System.out.println("There is now " + population + " organisms!");
    }
}

