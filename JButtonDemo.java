import java.awt.*;
import javax.swing.*;
class JButtonDemo extends JFrame
{
	JButtonDemo()
	{
		JButton b1,b2,b3,b4,b5;
		setVisible(true);
		setSize(400,400);
		b1=new JButton("North");

		//add(b1,"North");   OR  add(b1,BorderLayout.NORTH);

		add(b1,BorderLayout.NORTH);
		b2=new JButton("South");
		add(b2,"South");
		b3=new JButton("East");
		add(b3,"East");
		b4=new JButton("West");
		add(b4,"West");
		b5=new JButton("Center");
		add(b5,"Center");

	}
	public static void main(String ar[])
	{
		new JButtonDemo();
	}
}