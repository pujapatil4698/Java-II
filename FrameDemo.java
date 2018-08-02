import java.awt.*;
class FrameDemo extends Frame
{
	FrameDemo()
	{
		setVisible(true);
		setSize(500,500);
		Color c=new Color(0,255,255);
		setBackground(c);
	}
	public void paint(Graphics g)
	{
		Font f=new Font("Jokerman",Font.BOLD,25);
		g.setFont(f);
		g.setColor(Color.RED);
		g.drawString("Good Morning",200,200);
	}
	public static void main(String ar[])
	{
		new FrameDemo();
	}
}

