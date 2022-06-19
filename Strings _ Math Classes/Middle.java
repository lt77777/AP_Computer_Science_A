
/**
 *Prompt the user to enter their middle name.
a. If the 1st letter is a vowel, display “Vowel”, otherwise, “consonant”
b. If there are more than 8 letters in the name, say “long”, if between 5 and 8 (inclusive), say “medium”, otherwise, say “short”
c. Display whether the # of letters in the name is even or odd. Also, if it’s even, display whether or not it is divisible by 4. 
If it’s odd, display whether or not it is divisible by 5.
d. If the letter ‘a’ is in the name, display the first index # it was found at (example: “The letter a was found at index #3”) 
If it is not found, then say “The letter a was not found.”
e. If the first and last letters in the name are the same, display “same,” otherwise “different”
f. If the 2nd letter and the 2nd-to-last letter are both k, display “YES”
 *
 * Larry Tsai
 * 23OCT2019
 */
import java.util.Scanner;
public class Middle
{
    public static void main(){

        Scanner scanny=new Scanner(System.in);
        System.out.println("Enter your middle name");
        String middle=scanny.nextLine();
        middle=middle.toLowerCase();
        char one=middle.charAt(0);
        if(one==('a')||one==('e')||one==('i')||one==('o')||one==('u')){

            System.out.println("Vowel");

        }
        else{
            System.out.println("Consonant");
        }
        if(middle.length()>8){
            System.out.println("Long");
        }
        else if (middle.length()>4&&middle.length()<9){
            System.out.println("Medium");
        }
        else{
            System.out.println("Short");
        }
        if (middle.length()%2==0){
            System.out.println("The name has an even number of characters");
            if (middle.length()%4==0){
                System.out.println("The number of characters is divisable by 4");
            }
        }
        else{
            System.out.println("The name has an odd number of characters");
            if (middle.length()%5==0){
                System.out.println("The number of characters is divisable by 5");
            }
        }
        int a=-1;
        for(int i=0;i<middle.length();i++){
            if (middle.charAt(i)==('a')){
                a=i;
                if(a>=0){
                    break;}
            }
        }
        if(a>=0){
            System.out.println("The letter a was found at index #" + a);
        }
        else{

            System.out.println("The letter a was not found");
        }

        if(middle.charAt(0)==middle.charAt(middle.length()-1)){

            System.out.println("Same");

        }
        else{
            System.out.println("Different");
            
        }
         if(middle.charAt(1)==('k')&& middle.charAt(middle.length()-2)==('k')){
             System.out.println("YES");
            }
    }
}
