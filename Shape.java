import java.awt.*;
class Shape extends Frame
{
	Shape()
	{
		setVisible(true);
		setSize(500,500);
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.red);
		g.drawArc(100,100,100,100,0,180);
		g.fillArc(100,100,100,100,0,180);
		g.setColor(Color.pink);
		g.drawLine(50,200,300,200);
		g.setColor(Color.green);
		g.drawOval(250,250,100,100);
		g.fillOval(250,250,100,100);
		g.setColor(Color.magenta);
		g.drawRect(150,150,100,100);
		g.fillRect(150,150,100,100);
	}
	public static void main(String ar[])
	{
		new Shape();
	}
}