
/**
 * My First Program
 * 
 * Lawrence Tsai 
 * 09SEP2019
 */
public class Practice1
{
    public static void main()  //This is a comment on the main method//
    {
        System.out.print("I am Sam.");
        System.out.print(" Sam I am");
        System.out.print(" I do not like them,");
        System.out.println(" Sam-I-am.");
        System.out.print("I do not like green eggs and ham.");
      
        // Escape Sequences
        //     //       \"   \n    \t
        //    "Hello World"
       System.out.println("\"Hello World\"");
       System.out.println("http:\\\\www.crsd.org");
       System.out.println("Home\tAge\tShoe");
       System.out.println("5\t12\tYes");
       //   "15" with quotes is not the same as 15, it is a string not a quantity
       System.out.println("this is the string"+"15");
       System.out.println(15+5);
       System.out.println(15/3+2*4);
       System.out.println("this is the string "+"15");
       System.out.println("this is the integer "+15/3);
       System.out.println("15/4="+15/4);  //integer devided by an integer always results in an integer and rounded down
       System.out.println(15.0/4);   //double divided by integer results in a double
       System.out.println(14.00000000000000000000000000000000000000000000000000000000000/3);
       
       //Legal Names              Illegal Names
       // Argo                      1234
       //  d                        1d
       //MonkeyFace                 Fast Car
       //  large_Tree                class, system, main
       //goldenNugget               gold-Nugget
      
       int age; //  declare an int memory location for age
       age  =  45;   //  initialiize the variagble age is 45
       int height  =  67;
       int weight, size, hunger;
       int sum = 3+5+6+height+age;
    }
}
