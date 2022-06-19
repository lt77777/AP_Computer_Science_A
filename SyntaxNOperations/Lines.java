
/**
 * The Muller-Lyer illusion is caused by an image that consists of two parallel line segments. One line segment looks like an arrow with two heads, and the other line segment looks like an arrow with two tails. Although the line segments are exactly the same length, they appear to be unequal. Write a graphics program that illustrates this illusion.
Link to Wikipedia for Muller-Lyer illusion: https://en.wikipedia.org/wiki/M%C3%BCller-Lyer_illusion
 * 
 * Lawrence Tsai
 * 26SEP2019
 */
import javax.swing.*;
import java.awt.*;
public class Lines extends JPanel
{
   public Lines(){
       setBackground(Color.black);
    }
    public void paintComponent(Graphics g){
    super.paintComponent(g);
    g.setColor(Color.blue);
    g.drawLine(100,100,200,100);
    g.drawLine(100,200,200,200);
    g.drawLine(100,300,200,300);
    g.drawLine(100,100,120,120);
    g.drawLine(100,100,120,80);
    g.drawLine(200,100,220,120);
    g.drawLine(200,100,220,80);
    g.drawLine(100,200,80,220);
    g.drawLine(100,200,80,180);
    g.drawLine(200,200,220,220);
    g.drawLine(200,200,220,180);
    g.drawLine(100,300,120,320);
    g.drawLine(100,300,120,280);
     g.drawLine(200,300,180,20);
    g.drawLine(200,300,180,80);
    

}
}
