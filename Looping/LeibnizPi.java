
/**
 *The German mathematician Gottfried Leibniz developed the following method to approximate the value of π:
π = 4 - 4/3 + 4/5 - 4/7 + ....
Write a program that allows the user to specify the number of iterations used in this approximation and displays the resulting value
 

Larry Tsai
 10OCT2019
 */
import java.util.Scanner;
public class LeibnizPi{
public static void main(){

    Scanner scanny =new Scanner(System.in);
    double top=4;
    double bottom=1;
    double pi=(double) top/bottom;
    System.out.println("How many iterations do you want to approximate π?");
    int an = scanny.nextInt();
    for(int i = 1; i<=an; i++){
       
 bottom+=2;
pi= pi-(top/bottom);
 bottom+=2;
pi= pi+(top/bottom);
       
        
       
    
}
System.out.println("Pi is approximately " + pi + " with "+ an+ " iterations");
 }
}