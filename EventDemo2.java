import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class EventDemo2 extends JFrame implements ActionListener
{
	JButton b1,b2,b3;
	EventDemo2()
	{
			setVisible(true);
			setSize(500,500);
			setLayout(new FlowLayout());
			b1=new JButton("Red");
			add(b1);
			b2=new JButton("Green");
			add(b2);
			b3=new JButton("Blue");
			add(b3);
			validate();
			b1.addActionListener(this);
			b2.addActionListener(this);
			b3.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		Object obj=e.getSource();
		Container cp=getContentPane();
		if(obj==b1)
		{
			cp.setBackground(Color.red);
		}
		else if(obj==b2)
		{
			cp.setBackground(Color.green);
		}
		else if(obj==b3)
		{
			cp.setBackground(Color.blue);
		}

	}
	public static void main(String ar[])
	{
		new EventDemo2();
	}

}
