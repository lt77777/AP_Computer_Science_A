
/**
 * Fish Client
 *
 * make fish
 * 
 * Larry Tsai
 * 29OCT2019
 */
public class FishClient
{
   public static void main()
   {
       Fish myFish=new Fish();
       System.out.println(myFish);
       Fish joe=new Fish("Joe","Green",25,50);
        System.out.println(joe);
        joe.eat(10);
        System.out.println("Joe eats");
        System.out.println(joe);
        joe.swim("down",12);
        System.out.println("Joe swims down");
        System.out.println(joe);
    }
}