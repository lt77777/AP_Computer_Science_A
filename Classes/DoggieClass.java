
/**
 * Create a Doggie class with private instance variables name, breed, color and weight. 
 * This class must have two constructors, one called public Doggie(), 
 * that takes no arguments but sets all instance variables to “some default.”
 * (you pick) and a second(public Doggie(String name, String breed, String color, double weight)) that sets each variable. 
 * All instance variables should be accessible outside of the Doggie class. Make several methods(you choose be creative) 
 * that modify each of the given instance variables. (Example methods: run, eat, runAway, mutate) 
 * Then create a DoggieClient class that instantiates several dogs and uses the methods to set instance variables. 
 * Finally display each dog with its name, breed, color and weight. Demonstrate each of your methods.
 *
 * Lawrence Tsai
 * 14NOV2019
 */
public class DoggieClass
{
   private String name;
  
   private String breed;
   private String color;
   private double weight;
   
   public DoggieClass()
   {
      String name=("Rover");
      String breed=("German Shepherd");
      String color=("Black");
      double weight=30;
   
}
public DoggieClass(String name, String breed, String color, double weight)
{
    this.name=name;
    this.breed=breed;
    this.color=color;
    this.weight=weight;
    
    
}

public double run(double run)
{
  weight-=run;
  return weight;
}
public double eat(double eat)
{
  weight+=eat;
  return weight;
}
public double vomit(double vomit)
{
  weight-=vomit;
  return weight;
}
 public void mutate(String mut)
    {
        color=color+ "-" + mut; 
    }
public String toString()
    {
        return "Name:" + name + 
        "\nColor:" + color +
        "\nBreed:" + breed+
        "\nWeight:" + weight;

    }
}
    