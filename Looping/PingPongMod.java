
/**
Modify Pingpong so that IF the total number of wins goes over 50,
the loop breaks, and you announce “OVERLOAD,” but still display the correct average. (make sure you test for this.)
 * 16OCT2019
 */
import java.util.Scanner;
public class PingPongMod
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
                 if(win>=50){
                    System.out.println("OVERLOAD");
                    break;
            }
        }

    
    double ave=(double)win/players;
System.out.println ("The average number of wins is "+ave);
               System.out.println ("The lowest number of wins is "+min);
                      System.out.println ("The greatest number of wins is "+max);
                      System.out.println ("The  number of double digits wins is "+doubledig);

}
}




