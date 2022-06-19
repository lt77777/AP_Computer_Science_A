
/**
 * Use a for loop for each task:
a. Display the numbers 55 to 61
b. Display even numbers from 40 to 50
c. Display backwards numbers from 2 to -9
d. (first, test the previous loops…) Then, deliberately create an infinite for loop.
 * 
 * 
 *Lawrence Tsai
 *10OCT2019
 */
public class ForLoops
{
    public static void main (){
        for(int i = 55; i<62;i++)    
    {
            System.out.print(i + " ");
        }
System.out.print("\n");
for(int i = 40; i<51;i+=2)    
    {
            System.out.print(i + " ");
        }
System.out.print("\n");
for(int i = 2; i>-10;i--)    
    {
            System.out.print(i + " ");
        }
System.out.print("\n");
for(int i = 2; i>1;i++)    
    {
            System.out.print(i + " ");
        }
System.out.print("\n");
}
}