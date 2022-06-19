
/**
 *JFrame and JPanel
 *Different layout and colors and containers
 * 
 *Lawrence Tsai 
 * 17SEP2019
 */

import javax.swing.*;   //import the jframe and jpanel
import java.awt.*;     //colors and containers

public class GUIWindow
{
    public static void main ()throws InterruptedException{
        //jframe is a window
        //how to make an object
     //    class name of object = newClass arguments
     // Scanner scanny = new Scanner(System.in);
     JFrame GUI = new JFrame("My first JFrame");
     //GUI.seTitle(" ");
     GUI.setSize(500,600);  //width by height
     GUI.setResizable(true);
     GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     BorderLayout Layout=new BorderLayout();
     GUI.setLayout(new BorderLayout());
     JPanel YellowPanel=new JPanel();
     YellowPanel.setBackground(Color.yellow);
     JPanel BluePanel=new JPanel();
     BluePanel.setBackground(Color.blue);
     JPanel GreenPanel=new JPanel();
     GreenPanel.setBackground(Color.green);
     JPanel GrayPanel=new JPanel();
     GrayPanel.setBackground(Color.gray);
     JPanel RedPanel=new JPanel();
     RedPanel.setBackground(Color.red);   //voloy (200,50,30) 200 red 50 blue 30 green
     Color melaColor=new Color(200,20,50);
     JPanel melaPanel=new JPanel();
     melaPanel.setBackground(melaColor);
     GUI.setVisible(true);
//     JButton myBut=new JButton ("Click Me");
//      GUI.add(myBut);
//      myBut.setSize(15,20);
     GUI.add(YellowPanel, BorderLayout.WEST);
     GUI.add(GreenPanel, BorderLayout.NORTH);
     GUI.add(RedPanel, BorderLayout.SOUTH);
     GUI.add(GrayPanel, BorderLayout.EAST);
     GUI.add(melaPanel, BorderLayout.CENTER);
     GUI.add(BluePanel, BorderLayout.WEST);
     
     //////////////////////////////////////////////////////////////////////////////////////////////
     
     //mMy Second GUI
     //grid layout
//      for(int i=74; i>11; i++){ //for infinite loop
    Thread.sleep(2000);  //2 second wait

     JFrame GUI2=new JFrame();
      GUI2.setSize(500,600);  //width by height
     GUI2.setResizable(true);
     GUI2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
     
     GridLayout mylayout=new GridLayout (2,3);  //2x3 grid
     GUI2.setLayout(mylayout);
     GUI2.setVisible(true);
     
     JPanel p1=new JPanel();
     p1.setBackground(Color.);
        JPanel p2=new JPanel();
     p2.setBackground(Color.blue);
        JPanel p3=new JPanel();
     p3.setBackground(Color.pink);
        JPanel p4=new JPanel();
     p4.setBackground(Color.cyan);
        JPanel p5=new JPanel();
     p5.setBackground(Color.green);
        JPanel p6=new JPanel();
     p6.setBackground(Color.black);
        JPanel p7=new JPanel();
     p7.setBackground(Color.white);
        JPanel p8=new JPanel();
     p8.setBackground(Color.gray);
     
     GUI2.add(p1);
      GUI2.add(p2); 
      GUI2.add(p3);
      GUI2.add(p4);
      GUI2.add(p5);
       GUI2.add(p6);
        GUI2.add(p7);
         GUI2.add(p8);
         Container myContainer=new Container();
         GridLayout layout3=new GridLayout(2,1);
         myContainer.setLayout(layout3);
         myContainer.add(p6);
         myContainer.add(p7);
         GUI.add(myContainer);
     
    
}
}
   