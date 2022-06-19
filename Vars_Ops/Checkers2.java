
/**
 * Write a program that displays a 3-by-3 and a 4-by-3 grid of black and white rectangles. 
 * The rectangles should be positioned so that no two rectangles of the same color are adjacent to each other. 
Later Challenge: Ask the user for the number of rows and columns and display the correct board. This will be a future problem.
 * 
 * Larry Tsai
 * 19SEP2019
 */
import javax.swing.*;   
import java.awt.*; 
import java.util.Scanner;
public class Checkers2
{
    public static void main (){
        Scanner myObj1 = new Scanner(System.in);
        System.out.println("How many rows would you like?");
        int row = myObj1.nextInt();
        System.out.println("How many columns would you like?");
        int column= myObj1.nextInt();

        if( column % 2==0) {
            for(int i=row*column; i<row*column; i++){
                JFrame GUI2=new JFrame("Jframe");
                GUI2.setSize(500,300);  
                GUI2.setResizable(true);
                GUI2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                GridLayout mylayout=new GridLayout (row,column); 
                GUI2.setLayout(mylayout);
                JPanel p1=new JPanel();
                p1.setBackground(Color.white);
                JPanel p2=new JPanel();
                p2.setBackground(Color.black);
                

                GUI2.add(p1);
                GUI2.add(p2); 
                
                GUI2.setVisible(true);

            }

        }else {
            for(int i=row*column; i<row*column; i++){
                JFrame GUI2=new JFrame("Jframe");
                GUI2.setSize(500,300);  
                GUI2.setResizable(true);
                GUI2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                GridLayout mylayout=new GridLayout (row,column); 
                GUI2.setLayout(mylayout);
                JPanel p12=new JPanel();
             
                p12.setBackground(Color.white);
                JPanel p22=new JPanel();
                p22.setBackground(Color.black);
               
                GUI2.add(p12);
                GUI2.add(p22); 
              
                GUI2.setVisible(true);
            }
        }

     
    }
}
