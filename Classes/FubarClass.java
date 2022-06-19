
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

 */
import java.util.Scanner;
public class FubarClass
{
    
    Scanner scanny=new Scanner(System.in);
    private int age;

    public FubarClass()
    {
        int age=42; 

    }

    public FubarClass(int age)
    {
        this.age=age; 

    }

    public boolean ageDiv()
    {

        if(age%5==0){

            return true;
        }
        else{

            return false;
        }

    }

    public double abs(int number3)
    {

        if(number3>0)
        {
            int abs=number3;
            return abs;
        }
        else
        {
            int abs=number3*-1;
            return abs;
        }
    }   

    public char nextToLast(String nextToLast)
    {

        int length=nextToLast.length();
        char nextToLast2=nextToLast.charAt(length-2); 

        return nextToLast2;
    }

    public void getName()
    {
        System.out.println("What is your name?");
        String getName=scanny.nextLine();
        String getName2=(getName+" you are stupid");
        System.out.println(getName2);

    }

    public void displayStuff()
    {
        System.out.println("Enter a number");
        int num=scanny.nextInt();
        String enter=scanny.nextLine();
        System.out.println("Enter a word");
        String Stuff=scanny.nextLine();
        for (int i=1; i<=num; i++)
        {
            System.out.println(Stuff);

        }

    }

    public int findIndex(String wakanda, char forever)
    {
        int index=wakanda.indexOf(forever);
        if(index>=0)
        {
            return index;
        }
        else
        {
            return 999;
        }

    }

    public boolean primeNum(int prime)
    {
        if(prime==2){
            return true;
        }
        if(prime==1){
            return true;}

        for(int i=2; i<prime; i++)
        {if (prime%i==0){
                return false;
            }

        }
        return true;
    }

    public int getPrimez(int prime1, int prime2)
    {

        int n=0;
        for(int j=prime1; j<=prime2; j++)
        { 

                
            if(j==2)
            {
                n++;

            }
            for(int i=2; i<j; i++)
            {

                if ((j%i==0)){
                    break;
                }
                if(i==j-1){
                    n++;
                }
            }

        }
        return n;

    }

    public int sumOfDigits(int number1)
    {
        int a=number1/100;
        int z=number1-(a*100);
        int b=z/10;
        int y=z-(b*10);
        int c=a+b+y;
        return c;

    
    }

    public double abs(int number, int number2)
    {
        if(number<number2){  
            if(number>0)
            {
                int abs=number;
                return abs;
            }
            else
            {
                int abs=number*-1;
                return abs;
            }
        }
        else{
            if(number2>0)
            {
                int abs=number2;
                return abs;
            }
            else
            {
                int abs=number2*-1;
                return abs;
            }
        }
    }

    public boolean same(String one, String two)
    {
        if(one.equals(two)){
            return true;
        }
        else{
            return false;
        }

    } 

    public boolean same(String three)
    {
        if(three.equals("bird")){
            return true;
        }
        else{
            return false;
        }

    } 

    public int convertToDecimal(String decimal)
    {

        int x=0;
        int y=0;
        for(int z=decimal.length()-1; z>=0;z--){
            if(decimal.charAt(z)==('1')){
                y+=(Math.pow(2,x));

            }
            x++;
        }

        return y; 
    }
    private String displayGreeting()
    {
        return ("oh hey");
    }
    public void letterGame()
    {
     displayGreeting();
    
    }
}