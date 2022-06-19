
/**
 * Ask the user how many players are on their ping-pong team. (Error check with a while loop: minimum of 5 players.) Then, using another while loop, 
 * ask for each player’s number of wins. 
ex: How many wins does player # 3 have? 
When finished, display the average # of wins, the most wins, the least wins, and how many double-digit wins there are.

 * 16OCT2019
 */
import java.util.Scanner;
public class PingPong
{
    public static void main (){
        Scanner scanny=new Scanner(System.in);
        System.out.println("How many players are on your ping-pong team?");
        int players=scanny.nextInt();
        double win=0;
        int max=0;
        int min=1000000000;
        int doubledig=0;
        while(players<5){
            System.out.println("There is a minimum of 5 players, try again.");
            players=scanny.nextInt();
        }
           while(players>=5){
               for (int i=1; i<=players; i++){
                   System.out.println("How many wins does player # "+i+" have?");
                   int dubs=scanny.nextInt();
                   if (dubs>max){
                       max=dubs;
                    }
                    if(dubs<min){
                        min=dubs;
                    }
                   if(dubs>9){
                       
                       doubledig++;
                    }
                   win+=dubs;
                   
        
                }
                double ave=(double)win/players;
        System.out.println("The average number of wins is "+ave);
               System.out.println("The lowest number of wins is "+min);
                      System.out.println("The greatest number of wins is "+max);
                      System.out.println("The  number of double digits wins is "+doubledig);
                      break;
    }
    
}
}
    


