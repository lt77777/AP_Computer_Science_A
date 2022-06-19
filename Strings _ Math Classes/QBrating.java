
/**
 * Look up the formula for NFL QB rating; also look up any NFL quarterback’s 2013 stats (completions, attempts, yards, TDs, and INTs). 
 * Then, write a program that asks the user for those 5 stats, and displays the correct QB rating round to the hundredths.
Example: 
Please enter completions = 150
attempts = 198
yards = 1886
TDs = 20
INTs = 1
Your QB has a rating of 136.47.
 * 
 * 
 * Larry Tsai
 * 24OCT2019
 */
import java.util.Scanner;
public class QBrating
{
public static void main(){
    Scanner scanny=new Scanner (System.in);
    System.out.println("Please enter completions");
     double completion=scanny.nextDouble();
    System.out.println("Please enter attempts");
     double attempt=scanny.nextDouble();
    System.out.println("Please enter yards");
     double yard=scanny.nextDouble();
    System.out.println("Please enter TDs");
     double td=scanny.nextDouble();
    System.out.println("Please enter INTs");
     double INT=scanny.nextDouble();
    double completionper=(double)(((completion/attempt)*100)-30)*0.05;
    if(completionper<0){
        completionper=0;
    }
     if(completionper>2.375){
        completionper=2.375;
    }
    double yardsper=(double)((yard/attempt)-3)*.25;
     if(yardsper<0){
        yardsper=0;
    }
     if(yardsper>2.375){
        yardsper=2.375;}
    double tdper=(double)((td/attempt)*100)/5;
      if(tdper<0){
        tdper=0;
    }
     if(tdper>2.375){
        tdper=2.375;}
    double intper=(double)(9.5-((INT/attempt)*100))/4;
     if(intper<0){
        intper=0;
    }
    if(intper>2.375){
        intper=2.375;}
    double rating=(completionper+yardsper+tdper+intper)/0.06;
    System.out.println("The QB rating is "+rating);
}

}