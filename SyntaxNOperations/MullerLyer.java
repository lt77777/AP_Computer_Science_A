
/**
 * 
 * The Muller-Lyer illusion is caused by an image that consists of two parallel line segments. One line segment looks like an arrow with two heads, and the other line segment looks like an arrow with two tails. Although the line segments are exactly the same length, they appear to be unequal. Write a graphics program that illustrates this illusion.
*Link to Wikipedia for Muller-Lyer illusion: https://en.wikipedia.org/wiki/M%C3%BCller-Lyer_illusion
*
*Lawrence Tsai
*26SEP2019
 */
import javax.swing.*;
import java.awt.*;
public class MullerLyer
{
    public static void main(String[] args){
        JFrame frame=new JFrame();
       
       frame.setTitle("Canvas");
       frame.setSize(300,300);
      
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       Lines larry = new Lines();
       frame.add(larry);
       frame.setVisible(true);
    }
}
    