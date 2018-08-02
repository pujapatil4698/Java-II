/* Null Layout
 In this we define the height width and position of the button on the frame
*/

import java.awt.*;
import javax.swing.*;

class NullLayDemo extends JFrame
{
	JButton b1,b2;
	NullLayDemo()
	{

		setVisible(true);
		setSize(400,400);
		setLayout(null);

		b1=new JButton("First");
		b2=new JButton("Second");

		b1.setBounds(50,50,80,30);
		b2.setBounds(150,50,80,30);

		add(b1);
		add(b2);

	}
	public static void main(String ar[])
	{
		new NullLayDemo();
	}
}