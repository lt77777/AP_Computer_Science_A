
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
public class BoxCars
{ public static void main(){
   int count=0;
    for(int i=1; i<36000; i++){
 
    Die die2=new Die(6);
 int x=die2.roll(6,36000);
   Die die3=new Die(6);
 int y=die3.roll(6,36000);
 
    System.out.println(x + " " + y);
    if(x+y==12){
        count++;
    }
  
  
    
}
 System.out.println("Number of boxcars:" + count); 
}
}