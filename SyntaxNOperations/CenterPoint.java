
/**
 * Write a graphics program that displays the coordinates of the center point of a panel in the form (x,y). 
 * This information should be displayed at the panel’s center point and be automatically updated when the panel is resized.
 * Hint: getHeight and getWidth methods will help with finding the center.
 * 
 * Lawrence Tsai
 * 25SEP2019
 *
 */
import javax.swing.*;
import java.awt.*;


public class CenterPoint extends JPanel
{
    
       public CenterPoint (Color backColor){
           setBackground(backColor);
        }
      public void paintComponent (Graphics g){
          super.paintComponent(g);
        
      
        int x = getWidth() /2;
        int y = getHeight() / 2;
        g.setColor(Color.blue);
        g.drawOval(x,y,10,10);
            g.drawString("The centerpoint is (" + x + "," + y + ")",x,y);
        
        }  
    }