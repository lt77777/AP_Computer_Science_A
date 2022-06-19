
/**
 * National flags are displayed on various Web sites, such as http://flagspot.net/flags/ .
 * The flags of France, Mauritius, and Bulgaria consist of flat, colored areas. 
 * Write one class programs that display these flags. Use the time delay provided.
 * 
 * Larry Tsai 
 * 18SEP2019
 */
import javax.swing.*;   
import java.awt.*;   
public class Cooper
{
    public static void main () throws InterruptedException{
       JFrame GUI2=new JFrame("Jframe");
      GUI2.setSize(500,300);  
     GUI2.setResizable(true);
     GUI2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     GridLayout mylayout=new GridLayout (1,3); 
     GUI2.setLayout(mylayout);
     
     JPanel p1=new JPanel();
     p1.setBackground(Color.red);
        JPanel p2=new JPanel();
     p2.setBackground(Color.white);
        JPanel p3=new JPanel();
     p3.setBackground(Color.blue);
        
     GUI2.add(p1);
      GUI2.add(p2); 
      GUI2.add(p3);
     GUI2.setVisible(true);
     Thread.sleep(2000);
      GUI2.remove(p1);
      GUI2.remove(p2); 
      GUI2.remove(p3);
        
       GUI2.setVisible(false);
        GridLayout mylayout2=new GridLayout (4,1);
        GUI2.setLayout(mylayout2);
             
     
     
     JPanel p12=new JPanel();
     p12.setBackground(Color.red);
        JPanel p22=new JPanel();
     p22.setBackground(Color.blue);
        JPanel p32=new JPanel();
     p32.setBackground(Color.yellow);
     JPanel p24=new JPanel();
     p24.setBackground(Color.green);
     
        
     GUI2.add(p12);
      GUI2.add(p22); 
      GUI2.add(p32);
      GUI2.add(p24);
     GUI2.setVisible(true);
     Thread.sleep(2000);
     GUI2.remove(p12);
      GUI2.remove(p22); 
      GUI2.remove(p32);
      GUI2.remove(p24);
        
        
 GUI2.setVisible(false);
      GridLayout mylayout3=new GridLayout (3,1);
       GUI2.setLayout(mylayout3);
        
         JPanel p122=new JPanel();
     p122.setBackground(Color.white);
        JPanel p222=new JPanel();
     p222.setBackground(Color.green);
        JPanel p322=new JPanel();
     p322.setBackground(Color.red);
        
     GUI2.add(p122);
      GUI2.add(p222); 
      GUI2.add(p322);
     GUI2.setVisible(true);
        Thread.sleep(2000);
       
       
    }
}