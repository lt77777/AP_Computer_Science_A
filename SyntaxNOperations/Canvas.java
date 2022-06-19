/**
 * 
 * 
 *  Write a graphics program that displays the coordinates of the center point of a panel in the form (x,y). 
 * This information should be displayed at the panel’s center point and be automatically updated when the panel is resized.
 * Hint: getHeight and getWidth methods will help with finding the center.
 * 
 * Lawrence Tsai
 * 25SEP2019
 *
 * 
 */
import javax.swing.*;
import java.awt.*;
public class Canvas
{
   public static void main (String[] args){
       JFrame frame=new JFrame();
       
       frame.setTitle("Canvas");
       frame.setSize(300,300);
      
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       CenterPoint larry = new CenterPoint(Color.red);
       frame.add(larry);
       frame.setVisible(true);
       
    }
}