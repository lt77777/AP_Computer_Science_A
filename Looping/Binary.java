
/**
 * Computers use the binary system, which is based on powers of 2. 
 * Write a program that displays the positive powers of 2.
 * When the user enters the exponent at a prompt, the program displays 2 to that power. 
 * This calculation is done using a loop not the Math class.
 * The program continues to accept an exponent, display the power of 2 and halts when the user enters -1.
 * 
 * 
 * Larry Tsai
 *15OCT2019
 */
import java.util.Scanner;
public class Binary
{
    public static void main (){
        Scanner scanny=new Scanner (System.in);
        int x=0;
          while(x<=1000){
             System.out.println("What power of 2 would you like?");
        int power=scanny.nextInt();
       if(power==-1){
               break;}
        int base=2;
        if(power>=2){
        for(int i=1; i<power; i++){
            base=base*2;
           
        
        }}
      if(power==1){
          base=2;
        }
         if(power==0){
          base=0;}
        
    System.out.println("Your answer is "+base);
}}
}
