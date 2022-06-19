
/**
 * Create a Doggie class with private instance variables name, breed, color and weight. 
 * This class must have two constructors, one called public Doggie(), 
 * that takes no arguments but sets all instance variables to “some default.”(you pick) and a 
 * second(public Doggie(String name, String breed, String color, double weight)) that sets each variable. 
 * All instance variables should be accessible outside of the Doggie class. Make several methods(you choose be creative) 
 * that modify each of the given instance variables. (Example methods: run, eat, runAway, mutate) 
 * Then create a DoggieClient class that instantiates several dogs and uses the methods to set instance variables. 
 * Finally display each dog with its name, breed, color and weight. Demonstrate each of your methods.
 *
 * Lawrence Tsai
 * 14NOV2019
 */
import java.util.Scanner;
public class DoggieClient
{
    public static void main(){

        Scanner scanny=new Scanner(System.in);

        System.out.println("Doggie name?");
        String name=scanny.nextLine();
        System.out.println(name +"'s breed?");
        String breed=scanny.nextLine();
        System.out.println(name +"'s color?");
        String color=scanny.nextLine();
        System.out.println(name +"'s weight?");
        double weight=scanny.nextDouble();
        DoggieClass doggie=new DoggieClass(name,breed,color,weight); 
  System.out.println(doggie);
        System.out.println("How many pounds did " +name +" eat?");
        double eat=scanny.nextDouble();
        doggie.eat(eat);
          System.out.println(doggie);
        System.out.println("How many pounds did " +name +" run off?");
        double run=scanny.nextDouble();
        doggie.run(run);
          System.out.println(doggie);
        System.out.println("How many pounds did " +name +" vomit?");
        double vomit=scanny.nextDouble();
        doggie.vomit(vomit);
        System.out.println(doggie);
       String eheh=scanny.nextLine();
        System.out.println("What color will " +name +" mutate to?");
         String mut=scanny.nextLine();
        doggie.mutate(mut);
        System.out.println(doggie);
    }
}