
/**
 * A checkerboard consists of an 8-by-8 grid of black and red squares in which no two squares of the same are adjacent. 
 * Write code for a modified checkerboard that prompts the user for the number of rows and columns of the board before displaying them. 
 * (Challenge is to make it so that the even numbered columns still look like a checker board)
 * 
 * Larry Tsai
 * 15OCT2019
 */
import javax.swing.*;   
import java.awt.*; 
import java.util.Scanner;

public class Checkers2

{
    public static void main ()throws InterruptedException{

        Scanner scanny=new Scanner(System.in);
        System.out.println("How many rows would you like?");
        int row=scanny.nextInt();

        System.out.println("How many columns would you like?");
        int column=scanny.nextInt();
        JFrame GUI2=new JFrame("Jframe");
        GUI2.setSize(500,300);  
        GUI2.setResizable(true);
        GUI2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridLayout mylayout=new GridLayout (row,column); 
        GUI2.setLayout(mylayout);

        for(int i=0;i<row;i++){

        
        for(int j=0;j<column;j++){
            if((i+j)%2==0){
                JPanel p1=new JPanel();
                p1.setBackground(Color.black);
                  GUI2.add(p1);
            }
            else{

                JPanel p3=new JPanel();
                p3.setBackground(Color.red);
                
                 GUI2.add(p3);
                
            }
        }

            GUI2.setVisible(true);

        }
    }
}
    