 import java.awt.*;
 import javax.swing.*;

 class MyPanel extends JPanel
 {
 	public void paintComponent(Graphics g)
 	{
 		g.drawString("Hello",100,100);
 	}
 }

 class MyJFrame extends JFrame
 {
 	MyJFrame()
 	{
 		setVisible(true);
 		setSize(500,500);
 		setLocation(200,200);
 		setBackground(Color.magenta);
 		add(new MyPanel());
 	}
 	public static void main(String ar[])
 	{
 		new MyJFrame();
 	}
 }