
/**
 * Inside VarsAndOps create a new class called MyInfo. 
MyInfo will have variables that hold...
your age, 
9 numbers each in a different variable, 
the average of those 9 numbers,
your middle initial (a single character),
your favorite book,
Have user enter the above information using a Scanner object.
Then display this information in a visual pleasing manor.
 * Larry Tsai
 * 13SEP2019
 */
import java.util.Scanner;
public class MyInfo
{public static void main () {
    
    double ave;
   
    char middle;
    String favoritebook;
    Scanner myObj1 = new Scanner(System.in);
      System.out.println("How many years old are you?");          
          int age = myObj1.nextInt();
          System.out.println("Gonna find the average of the next 9 numbers");
    Scanner myObj2 = new Scanner(System.in);
      System.out.println("Enter an integer");          
          int a = myObj2.nextInt();
          Scanner myObj3 = new Scanner(System.in);
      System.out.println("Enter an integer");          
          int b = myObj3.nextInt();
          Scanner myObj4 = new Scanner(System.in);
      System.out.println("Enter an integer");          
          int c = myObj4.nextInt();
          Scanner myObj5 = new Scanner(System.in);
      System.out.println("Enter an integer");          
         int d = myObj5.nextInt();
          Scanner myObj6 = new Scanner(System.in);
      System.out.println("Enter an integer");          
          int e = myObj6.nextInt();
          Scanner myObj7 = new Scanner(System.in);
      System.out.println("Enter an integer");          
          int f = myObj7.nextInt();
          Scanner myObj8 = new Scanner(System.in);
      System.out.println("Enter an integer");          
          int g = myObj8.nextInt();
          Scanner myObj9 = new Scanner(System.in);
      System.out.println("Enter an integer");          
          int h = myObj9.nextInt();
          Scanner myObj10 = new Scanner(System.in);
      System.out.println("Enter an integer");          
          int i = myObj10.nextInt();
          ave = (double)(a+b+c+d+e+f+g+h+i)/9;
          Scanner myObj11 = new Scanner(System.in);
          System.out.println("What is your middle initial?");
     middle=myObj11.next().charAt(0);
     myObj11.nextLine();
      Scanner myObj12 = new Scanner(System.in);
          System.out.println("What is your favorite book?");
     favoritebook=myObj12.nextLine();
     ////output data
     System.out.println("I see that your age is " + age );
     System.out.println("The average of your numbers is " + ave);
     System.out.println("I think that " + middle+  " is a great letter");
     System.out.println("I think that " + favoritebook+ " is a great book too");
     
        }
    }
         
    
    
    
    
    

