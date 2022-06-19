
/**
 *Have the user type a sentence.
a. Error check – with a while loop: must be at least 10 characters, at most 25, AND must contain at least 2 words
b. Using a for loop, display each character of the sentence (including spaces) on a separate line.
c. Display the number of times that letters from your own first name are in the sentence
d. Display whether this # is divisible by 3
 *
 *Larry Tsai
18OCT2019
 */
import java.util.Scanner;
public class ForCounter
{
    public static void main(String args[]){

        Scanner scanny=new Scanner(System.in);
        System.out.println ("Type a sentence");
        String sentence=scanny.nextLine();
        int length=sentence.length();
        while(length<10  || length>25 || !sentence.contains(" ")){
            System.out.println("Print another sentence that has 10-25 characters and at least 2 words");
            sentence=scanny.nextLine();
            length=sentence.length();
            
        }

     
        while(length>=10  && length<=25 && sentence.contains(" ")){
            int name=0;
            for(int a=0; a<sentence.length();a++){
                System.out.println(sentence.charAt(a));
                if(sentence.charAt(a)=='l'){
                    name++;}
                if(sentence.charAt(a)=='a'){
                    name++;}
                if(sentence.charAt(a)=='w'){
                    name++;}
                if(sentence.charAt(a)=='r'){
                    name++;}
                if(sentence.charAt(a)=='e'){
                    name++;}
                if(sentence.charAt(a)=='n'){
                    name++;}
                if(sentence.charAt(a)=='c'){
                    name++;}
            }
       
            System.out.println("There are "+name+" characters in your sentence in my name");
            if(name%3==0){
                System.out.println("The number of characters from my name in your sentence is divisable by 3");
                break;}
                else{
                      System.out.println("The number of characters from my name in your sentence is not divisable by 3");
                    break;}
            }
        

    }
}
