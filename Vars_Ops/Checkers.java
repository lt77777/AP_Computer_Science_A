
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
public class Checkers
{
    public static void main ()throws InterruptedException{
         JFrame GUI2=new JFrame("Jframe");
      GUI2.setSize(500,300);  
     GUI2.setResizable(true);
     GUI2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     GridLayout mylayout=new GridLayout (3,3); 
     GUI2.setLayout(mylayout);
        
     JPanel p1=new JPanel();
     p1.setBackground(Color.white);
        JPanel p2=new JPanel();
     p2.setBackground(Color.black);
      JPanel p3=new JPanel();
     p3.setBackground(Color.white);
        JPanel p4=new JPanel();
     p4.setBackground(Color.black);
      JPanel p5=new JPanel();
     p5.setBackground(Color.white);
        JPanel p6=new JPanel();
     p6.setBackground(Color.black);
      JPanel p7=new JPanel();
     p7.setBackground(Color.white);
        JPanel p8=new JPanel();
     p8.setBackground(Color.black);
      JPanel p9=new JPanel();
     p9.setBackground(Color.white);
       
       
     GUI2.add(p1);
     
      GUI2.add(p2); 
          GUI2.add(p3);
      
      GUI2.add(p4); 
      
       GUI2.add(p5);
     
      GUI2.add(p6); 
      
       GUI2.add(p7);
       
      GUI2.add(p8); 
      
       GUI2.add(p9);
       GUI2.setVisible(true);
       Thread.sleep(2000);
     GUI2.remove(p2);
      GUI2.remove(p3); 
      GUI2.remove(p4);
      GUI2.remove(p5);
   GUI2.remove(p6); 
      GUI2.remove(p7);
      GUI2.remove(p8);
      GUI2.remove(p9); 
      
      
     
     Thread.sleep(2000);
     GUI2.setVisible(false);
        
      JFrame GUI3=new JFrame("Jframe2");
      GUI3.setSize(500,300);  
     GUI3.setResizable(true);
     GUI3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     GridLayout mylayout2=new GridLayout (3,4); 
     GUI3.setLayout(mylayout2);
        
     JPanel p12=new JPanel();
     p12.setBackground(Color.white);
        JPanel p22=new JPanel();
     p22.setBackground(Color.black);
      JPanel p32=new JPanel();
     p32.setBackground(Color.white);
        JPanel p42=new JPanel();
     p42.setBackground(Color.black);
      JPanel p52=new JPanel();
     p52.setBackground(Color.black);
        JPanel p62=new JPanel();
     p62.setBackground(Color.white);
      JPanel p72=new JPanel();
     p72.setBackground(Color.black);
        JPanel p82=new JPanel();
     p82.setBackground(Color.white);
      JPanel p92=new JPanel();
     p92.setBackground(Color.white);
     JPanel p152=new JPanel();
     p152.setBackground(Color.black);
        JPanel p162=new JPanel();
     p162.setBackground(Color.white);
      JPanel p172=new JPanel();
     p172.setBackground(Color.black);
       
       
     GUI3.add(p12);
     
      GUI3.add(p22); 
          GUI3.add(p32);
      
      GUI3.add(p42); 
      
       GUI3.add(p52);
     
      GUI3.add(p62); 
      
       GUI3.add(p72);
       
      GUI3.add(p82); 
      
       GUI3.add(p92);
          GUI3.add(p152);
             GUI3.add(p162);
                GUI3.add(p172);
                
     
   
     GUI3.setVisible(true);
        
        
        
    }
}
    