/* Flow Layout
	Buttons are displayed in proper size at top and center of the frame.

*/

import java.awt.*;
import javax.swing.*;

class JButtDemo extends JFrame
{
	JButton b1,b2,b3;
	JButtDemo()
	{

		setVisible(true);
		setSize(400,400);
		setLayout(new FlowLayout());

		//setLayout(new FlowLayout(FlowLayout.RIGHT)); To set Direction on the frame

		b1=new JButton("First");
		b2=new JButton("Second");
		b3=new JButton("Third");

		add(b1);
		add(b2);
		add(b3);
	}
	public static void main(String ar[])
	{
		new JButtDemo();
	}
}