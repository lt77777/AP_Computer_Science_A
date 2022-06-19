
/**
 * Modify the Binary class so that the user enters in both the base and the exponent. 
 * The program should accept user input, compute the result, 
 * and display each set of inputs and their result on an output line in the terminal window.
 * This calculation is done using a loop not the Math class.
 * 
 * 
 * Larry Tsai
 *15OCT2019
 */
import java.util.Scanner;
public class ModBinary
{
    public static void main (){
        Scanner scanny=new Scanner (System.in);
        int x=0;
          while(x<=1000){
             System.out.println("What base would you like?");
             int base=scanny.nextInt();
             int base2=base;
              System.out.println("What exponent would you like?");
        int power=scanny.nextInt();
       if(power==-1){
               break;}
       
        if(power>=2){
        for(int i=1; i<power; i++){
            base=base*base2;
           
        
        }}
      if(power==1){
          base=base;
        }
         if(power==0){
          base=0;}
        
    System.out.println("Your answer is "+base);
}}
}
