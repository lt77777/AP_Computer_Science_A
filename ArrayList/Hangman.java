
/**
 * Design the simple game hangman. Ten misses.
Hint, make two arrays one with the word and the other with incorrect guesses.

Should look something like this:
Pick a letter: M Letter Picked: Q, G
M _ _ _ _ _
 *
 * Larry Tsai
 * 27FEB2020
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Hangman
{
    public static void main()
    {
        Scanner scanny=new Scanner(System.in);
        System.out.println("What word are you thinking of?");
        String word=scanny.nextLine();
        int length=word.length();
        
        ArrayList answer = new ArrayList(); 
        ArrayList guess = new ArrayList(); 
      
         System.out.println("Guess a letter");
        System.out.println("Letters picked: " + guess);
      
          for (int i=0;i<=length-1;i++)
        {
          if( word.charAt(i)==(' '))
          {
            answer.add(i," ");
            
        }
        else{
            answer.add(i,"_ ");
        }
    }
     
    for(int i=0;i<=25;i++)
        {
            
            char guessletter=scanny.next().trim().charAt(0);
            guess.add(i,guessletter+" ");
            for(int j=0;j<=length-1;j++)
            {
                if(guessletter==(word.charAt(j))){
                    answer.set(j,(guessletter));
                }
                 
 System.out.print('\u000C');
                System.out.println("Guess a letter");
        System.out.println("Letters picked: " + guess);
      for (int k=0;k<=length-1;k++){
       System.out.print(answer.get(k)+ " ");
    
    }
   
    
    }
            }
                  System.out.println("Congrats you got it!")  ;
                }
                
            }
            
        
    

