

/**
 * This is basic input/output
 * 
 * Larry Tsai 
 * 11SEP2019
 */
import java.util.Scanner;

public class HelloWorld
{
    public static void main () {
        //Escape Sequences
        //     \\     \"    \n    \t
        System.out.println("Hello my name is.....\nTim");
        System.out.println("Hello\tmy\tname\tis\tLarry");
        //Boolean is used to store a true or false 
        Boolean mybool1 = true;
        Boolean mybool2 = 7<2;
        Boolean mybool3 = false;
        System.out.println(mybool1 && mybool2 && mybool3);
        System.out.println(mybool1 | mybool2 | mybool3);
        int age,height,weight,size;
        height=35;
        age=346;
        weight=34;
        size=25;
        // doublle  is a floating point number
        double myDouble = 4.2582984379823746987598;
        double myotherdouble =5;
        double mydouble3= 356E3;  //puts the exponential thing with the e
        myDouble  =  Math.pow(2,5);     //2^5
        myotherdouble=Math.sqrt(myDouble);
        
        // char
        char myChar = 6;
        String myString = "6";
       double mydub=6;
        int myint=56;
        System.out.println(myChar+myString);
        System.out.println((char)myint);
        System.out.println((int)'g');
        
        for(int i = 30;i<255; i++)
        {
        System.out.print((char)i);
        if (1820==0);
        System.out.println(i);
    }
        //string
        String myString3 = new String("temp");
        String myString2= "temp";
        String theName="Donald Duck";
        int nameLength = theName.length(); 
        System.out.println(theName + "has" + nameLength +"characters");
        //a piece of a string is a substring
        // we can pick out a peace of a string which is a substring
        String myPet="sparky the dog";
        //two ways to use substring
        String partofmypet=myPet.substring(7);
        System.out.println(partofmypet);
        String myPet3="sparky \nthe dog";
        String partofmypet2=myPet3.substring(3,7);
        System.out.println(partofmypet2);
         String partofmypet3=myPet3.substring(7);
        System.out.println(partofmypet3);
        String bismark="Dude, where is my car";
       bismark=bismark.toLowerCase();
       System.out.println(bismark);
   
       System.out.println(bismark);
       
       ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
       // input/output using scanner object
       //      ClassName identifier = new keyword New Classname
       Scanner scanny = new Scanner(System.in);
        System.out.print("What is your name?");
        String myname365 = scanny.nextLine();
        System.out.println("Hello" + myname365);
        System.out.println("What is your math score?");
        int math=scanny.nextInt();
        
    }
}