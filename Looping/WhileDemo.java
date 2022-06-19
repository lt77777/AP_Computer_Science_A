
/**
 * While Demo// demonstrate while loop
 * 
 * Larry Tsai
 * 11OCT2019
 */
import java.util.Scanner;
public class WhileDemo
{
    public static void main (){
        int x=1;   //initialize variables inside the loop because of scope of variable
        while(x<=10){
            //  loop body
            //  perform some type of calculation or display
            System.out.print(x +" ");
            x++;//print 1-10
        }
       
        // do...while
        do{
            System.out.print(x +" ");
            x++;//print 1-10
        }
        while(x<=10);
        
        //count backwards
        System.out.println();
        x=20;
        while(x>0){
            System.out.print(x +" ");
            x--;
        }
       int sum=0;
       x=1;
       while(x<=1000){
           sum+=x;
           x++;
           if(sum>6000){
               break;}
           }
         System.out.println("The sum was: " + sum);
        // sentinels
        Scanner scanny=new Scanner(System.in);
        System.out.println("Enter your score");
        int score=scanny.nextInt();
        sum=score;
        int counter=1;
        double average=0;
        while(score !=-1)
        {
            
          System.out.println("Enter another score");
          score=scanny.nextInt();
          
          if(score !=-1)
          {
             sum += score; 
              
            }
            
          counter++;
          
            
            
        }
        average = (double) sum/counter;
        System.out.println("Your average is " + average);
   
 
        
        
        
        
        ////////////////////////////////////////
        System.out.println("Number?");
        int number=scanny.nextInt();
        while (!(number>0 && number <=100)) {
        
            System.out.println("That number is not in the range.");
            System.out.println("Between 1-100 this time...");
            number=scanny.nextInt();
            
        }
        System.out.println("thanks");
        
        
        
        
        
        
        
        
    }
}