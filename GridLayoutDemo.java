/* Grid Layout
	Components are displsyed in the form of Rows and Coloms

*/

import java.awt.*;
import javax.swing.*;

class GridLayoutDemo extends JFrame
{
	JButton b1,b2,b3,b4,b5,b6;
	GridLayoutDemo()
	{

		setVisible(true);
		setSize(400,400);
		setLayout(new GridLayout(3,2,10,10));

		//setLayout(new FlowLayout(FlowLayout.RIGHT)); To set Direction on the frame

		b1=new JButton("First");
		b2=new JButton("Second");
		b3=new JButton("Third");
		b4=new JButton("4th");
		b5=new JButton("5th");
		b6=new JButton("6th");

		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
	}
	public static void main(String ar[])
	{
		new GridLayoutDemo();
	}
}