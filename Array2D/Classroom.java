
/**
 *Create a classroom diagram: 5 rows, 6 columns. (30 seats)
The empty room should look like the image attached at the bottom of this assignment 
1. Place a dash in each “box.”

2. There are 12 students in the class. Ask the user where each student wants to sit, and then place an ‘S’ in that spot.

3. After each student is placed, clear the screen and display the classroom.

4. Error checking:
a. Don’t allow the user to choose a spot that’s already taken.
b. Prevent OutOfBounds exceptions
 *
 * Larry Tsai
 * 13JAN2020
 */
import java.util.Scanner;
public class Classroom
{
    public static void main()
    {
        String[][] x = new String[5][6];

        fillArray(x); 
        Scanner scanny=new Scanner(System.in);
        for(int i=1;i<=12;i++)
        {
            System.out.println("What row would you like to sit?");
            int row=scanny.nextInt();
            if(row>5||row<1)
            {
                System.out.println("There are only 5 rows");
                System.out.println("What row would you like to sit?");

                row=scanny.nextInt()-1; 
            }
            System.out.println("What column would you like to sit?");
            int column=scanny.nextInt();
            if(column>6||column<1)
            {
                System.out.println("There are only 6 columns");
                System.out.println("What column would you like to sit?");
                
                    column=scanny.nextInt()-1; 
                }

                 if(x[row][column]==("-"))
                {
                    x[row][column]=("S");
                }
                while(x[row][column]==("S")){
                    System.out.println("Sorry, that seat is taken");
                
                     System.out.println("What row would you like to sit?");
            row=scanny.nextInt();
            while(row>5||row<1)
            {
                System.out.println("There are only 5 rows");
                System.out.println("What row would you like to sit?");

                row=scanny.nextInt(); 
            }
            System.out.println("What column would you like to sit?");
            column=scanny.nextInt();
            while(column>6||column<1)
            {
                System.out.println("There are only 6 columns");
                System.out.println("What column would you like to sit?");
                
                    column=scanny.nextInt(); 
                }
            }
        
                    x[row][column]=("S");
                
            
        
                }
                                            
            
        
    
    final String ANSI_CLS = "\u001b[2J";
    final String ANSI_HOME = "\u001b[H";

    System.out.println(" 1 2 3 4 5 6");

    printArray(x);

}

public static void fillArray(String[][] temp)
{
for(int r = 0;r<=4; r++)
{
for(int c = 0; c<=5;c++)
{
temp[r][c] = "-";
}

}

}

public static void printArray(String[][] temp)
{
for(int r = 0;r<temp.length; r++)

{
System.out.print((r+1)+" ");
for(int c = 0; c<temp[r].length;c++)
{
System.out.print(temp[r][c] + " ");
}
System.out.println();
}
}
}

