
/**
 * 

Ask the user how many enemies he or she has.
Then, using a while loop, ask the user how many cats each of those enemies owns. 
Finally, display the total number of cats, as well as how many of those cat amounts were odd, and how many were both greater than 70 and divisible by 7.

Lawrence Tsai
21OCT2019
 */
import java.util.Scanner;
public class Jimmy
{
    public static void main(){
        Scanner scanny=new Scanner (System.in);
        System.out.println("How many enemies do you have?");
        int enemy=scanny.nextInt();
        int a=1;
        int total=0;
        int odd=0;
        int condition=0;
        while(a<=enemy){
            System.out.println("How many cats does enemy " +a + " have?"); 
            int cat=scanny.nextInt();
            total+=cat;
            if (cat%2==1){
                odd++;
                 if (cat%7==0 && cat>70){
                condition++;
            }
            
            }
            a++;
        }
            System.out.println("The total number of cats owned by your enemies is "+total);
              System.out.println("The total number of odd cat amounts cats owned by your enemies is "+odd);
                System.out.println("The total number cat amounts greater than 70 and divisable by 7 owned by your enemies is "+condition);
        
   
    }}