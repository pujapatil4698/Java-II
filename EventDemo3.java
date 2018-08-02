import java.awt.*;
import java.awt.event.*;
class EventDemo3 extends Frame implements ActionListener
{
	Button b1;
	int x=50,y=100;
	EventDemo3()
	{
		setVisible(true);
		setSize(500,500);
		setLayout(new FlowLayout());
		b1=new Button("Click");
		add(b1);
		b1.addActionListener(this);

	}
	public void actionPerformed(ActionEvent e)
	{
		x+=10;
		y+=10;
		repaint();
	}
	public void paint(Grap hics g)
	{
		g.drawString("Hello",x,y);

	}
	public static void main(String ar[])
	{
		new EventDemo3();
}
}