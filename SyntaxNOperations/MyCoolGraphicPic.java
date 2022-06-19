
/**
 * Write a graphics program that displays an interesting graphic creation of your choosing. 
 * Make it fun and creative. For example a snowman, house or a beach scene. 
 * Use your imagination and make it look like it took some time.
 * 
 * Lawrence Tsai
 * 26SEP2019
 */
import javax.swing.*;
import java.awt.*;
public class MyCoolGraphicPic extends JPanel{

    public MyCoolGraphicPic(){
        setBackground(Color.white);
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.yellow);
        g.drawOval(300,300,100,100);
        g.fillOval(300,300,100,100);
        g.fillOval(280,400,150,150);
       
        g.drawOval(280,400,150,150);
        
        
        g.drawLine(280,475,220,400);
        g.drawLine(430,475,490,400);
        g.setColor(Color.black);
         g.drawOval(320,320,5,5);
        g.drawOval(370,320,5,5);
         g.fillOval(320,320,5,5);
        g.fillOval(370,320,5,5);
        g.drawOval(350,450,10,10);
        g.drawOval(350,470,10,10);
        g.drawOval(350,490,10,10);
         g.fillOval(350,450,10,10);
          g.fillOval(350,470,10,10);
        g.fillOval(350,490,10,10);
        g.drawArc(330,350,40,20,0,-180);
        g.drawLine(300,300,400,300);
        g.drawLine(300,280,300,300);
        g.drawLine(400,280,400,300);
        g.drawLine(300,280,320,280);
        g.drawLine(400,280,380,280);
        g.drawLine(380,280,380,250);
        g.drawLine(380,280,380,250);
       g.drawLine(320,280,320,250);
        g.drawLine(320,250,380,250);
        g.drawOval(345,340,7,7);
         g.fillOval(345,340,7,7);
        
     
       
       
        
        
        

    }
}
