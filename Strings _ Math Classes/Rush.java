
/**
 * Prompt the user to enter a word.
a. If the word is “Neil,” then ask the user to enter a letter. 
If the letter is a or b, display “Peart.” If it’s another letter, display “Xanadu.”
b. If the word is “Geddy,” then ask the user to enter a number. 
If the number is odd and divisible by 9, display “Lee.” If the number is negative or equals 2017, display “YYZ.”
 *
 * Larry Tsai
 * 22OCT2019
 */
import java.util.Scanner;
public class Rush
{
    public static void main (String args[]){

        
        Scanner scanny=new Scanner(System.in);
        System.out.println("Enter a word");
        String word=scanny.nextLine();
     
        if(word.equals("Neil")){
            System.out.println("Enter a letter");
            String letter=scanny.nextLine();
            
            if (letter.equals("a")||letter.equals("b")){
                System.out.println("Peart");
            }
            else{
                System.out.println("Xanadu");
            }
        }
       if(word.equals("Geddy")){
            System.out.println("Enter a number");
            int number=scanny.nextInt();
            if (number%2==1&&number%9==0){
                System.out.println("Lee");}
            if (number<0||number==2017){
                System.out.println("YYZ");}
        }
    }

}