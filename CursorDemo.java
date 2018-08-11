import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class CursorDemo extends  JFrame implements ActionListener
{
	JButton b1,b2,b3,b4,b5;
	CursorDemo()
	{
			setVisible(true);
			setSize(500,500);
			setLayout(new FlowLayout());
			b1=new JButton("First");
			b2=new JButton("Second");
			b3=new JButton("Third");
			b4=new JButton("Fourth");
			b5=new JButton("Fifth");

			add(b1);
			add(b2);
			add(b3);
			add(b4);
			add(b5);

			b1.addActionListener(this);
			b2.addActionListener(this);
			b3.addActionListener(this);
			b4.addActionListener(this);
			b5.addActionListener(this);


	}
	public void actionPerformed(ActionEvent e)
	{
		Object obj=e.getSource();
		if(obj==b1)
			b1.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		else if(obj==b2)
					b2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		else if(obj==b3)
					b3.setCursor(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR));

		else if(obj==b4)
					b4.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		else if(obj==b5)
		{
			Toolkit tk=Toolkit.getDefaultToolkit();
			Image img=tk.getImage("cur.gif");
			b5.setCursor(tk.createCustomCursor(img,new Point(10,10),"face"));
		}

	}
	public static void main(String ar[])
	{
		new CursorDemo();
	}

}
