
/**
 *Create a class called FubarClass with the following methods. (Then create a client to test it.)
Create a constructor. It receives the person’s age as a parameter, and it assigns this value to an instance variable in the class.
ageDiv() – accepts no parameters, returns true if the person’s age is divisible by 5, false if not
abs() - accepts one number as a parameter, returns the absolute value of that number
nextToLast() - accepts one word as a parameter, returns the next-to-last letter in the word
getName() – accepts no parameters; asks for the user’s name, then returns it, with an insult attached to it
displayStuff() – accepts a num and a word, displays that word num times, returns nothing     
findIndex() – accepts a word and a letter as parameters, returns which index that letter was found at in the word (ignore multiple occurrences of the letter), returns 999 if the letter is not found
primeNum()  - receives a number, returns true if it is prime, false if not.
getPrimez( ) -- Accepts two #s, returns how many primes exist between (and including) the two numbers.
sumOfDigits( ) – accepts a 3-digit number, returns the sum of its digits
Method and Constructor overloads
An overloaded constructor – it should receive no parameters, and assign the number 42 to the age variable.
An overloaded abs( ) – receives two numbers as parameters, only returns the absolute value of the smaller number.
same( ) – receives 2 words as parameters, returns true if they are the same word
An overloaded same( ) – receives one word as a parameter, returns true if the word is “bird”
convertToDecimal( ) – receives a String parameter (which will actually be an 8-bit binary #), converts this number to decimal, and returns it (as an int).
displayGreeting( ) – a private method that just displays “oh hey.”
letterGame( ) – receives no parameters, calls the private method displayGreeting( ), creates a random lowercase letter (hint: easier than it seems), then gives the user 10 chances to guess the letter. Returns nothing.
 *
 *
 *Larry Tsai
 *06NOV2019
 *
 **/
import java.util.Scanner;
public class FubarClient
{
    public static void main(){

        Scanner scanny=new Scanner(System.in);
        System.out.println("What is your age?");
        int age=scanny.nextInt();
        FubarClass Fubar=new FubarClass(age);
        System.out.println(Fubar.ageDiv());
    
         System.out.println("Enter a number!");
         int number3=scanny.nextInt();
        System.out.println(Fubar.abs(number3));
        String r=scanny.nextLine();
        System.out.println("Type stuff");
        String nextToLast=scanny.nextLine();
        System.out.println(Fubar.nextToLast(nextToLast));

        Fubar.getName();
        Fubar.displayStuff();
        System.out.println("Enter a word");
        String wakanda=scanny.nextLine();

        System.out.println("Enter a letter");

        char forever=scanny.next().charAt(0);
        System.out.println(Fubar.findIndex(wakanda, forever));
        System.out.println("Enter a number");
        int primeNum=scanny.nextInt();
        System.out.println(Fubar.primeNum(primeNum));
        System.out.println("Enter a number");
        int prime1=scanny.nextInt();
        System.out.println("Enter another number");
        int prime2=scanny.nextInt();
        System.out.println(Fubar.getPrimez(prime1, prime2));
         System.out.println("Enter a 3 digit number");
        int number1=scanny.nextInt();
          System.out.println(Fubar.sumOfDigits(number1));
            String rge=scanny.nextLine();
            
          System.out.println("Type a word");
        String one=scanny.nextLine();
        System.out.println("Type a word");
        String two=scanny.nextLine();
        System.out.println(Fubar.same(one,two));
        System.out.println("Type another word");
        String three=scanny.nextLine();
        System.out.println(Fubar.same(three));
           System.out.println("Enter some binary number");
        String decimal=scanny.nextLine();
        System.out.println(Fubar.convertToDecimal(decimal));
    }
}

