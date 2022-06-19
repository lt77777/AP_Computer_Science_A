
/**
 * Write a description of class Pic here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import javax.swing.*;
import java.awt.*;
public class Pic
{
    public static void main(String[] args){
        JFrame frame=new JFrame();
       
       frame.setTitle("Canvas");
       frame.setSize(1000,1000);
      
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       MyCoolGraphicPic larry = new MyCoolGraphicPic();
       frame.add(larry);
       frame.setVisible(true);
    }
}
    