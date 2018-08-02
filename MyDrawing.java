import java.awt.*;
import javax.swing.*;

class MyPanel extends JPanel
{
	public void paintComponent(Graphics g)
	 	{
			super.paintComponent(g);
	 		//g.drawString("Hello",100,100);
	 		g.setColor(Color.orange);

	 		g.drawOval(430,30,100,100);
			g.fillOval(430,30,100,100);
			g.setColor(Color.green);

			g.drawLine(0,200,120,30);
			g.drawLine(120,30,240,200);
			g.drawLine(240,200,360,30);
			g.drawLine(360,30,480,200);
			g.drawLine(480,200,600,30);
			g.drawLine(600,30,720,200);
			g.drawLine(0,200,720,200);

			g.setColor(Color.red);
			g.fillRect(240,300,400,100);

			g.drawRect(240,300,400,100);
			Toolkit tk=Toolkit.getDefaultToolkit();
			Image img=tk.getImage("1.jpg");
			g.drawImage(img,100,300,200,200,this);
		}
}

class MyDrawing extends JFrame
{
	MyDrawing()
	{
		setVisible(true);
		setSize(750,750);
		setLocation(300,300);
		add(new MyPanel());

	}
	public static void main(String ar[])
	{
		new MyDrawing();
	}

}