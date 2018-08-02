import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class EventDemo extends JFrame implements ActionListener
{
	JButton b1;
	EventDemo()
	{
			setVisible(true);
			setSize(500,500);
			setLayout(new FlowLayout());
			b1=new JButton("click");
			add(b1);
			b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		Container cp=getContentPane();
		cp.setBackground(Color.pink);
	}
	public static void main(String ar[])
	{
		new EventDemo();
	}

}
