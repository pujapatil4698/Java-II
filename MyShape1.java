import java.awt.*;
import javax.swing.*;
class MyPanel extends JPanel
{
 	public void paintComponent(Graphics g)
 	{
		super.paintComponent(g);
 		g.drawString("Hello",100,100);
 		g.setColor(Color.red);
		g.drawOval(100,100,100,100);
		g.fillOval(100,100,100,100);

	}
 }

class MyShape1 extends JFrame
{
	MyShape1()
	{
		setVisible(true);
		setSize(500,500);
		add(new MyPanel());
	}
	public static void main(String ar[])
	{
		new MyShape1();
	}
}