import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class PopUpDemo extends JFrame implements ActionListener
{
	JPopupMenu p;
	JMenuItem i1,i2,i3;

	PopUpDemo()
	{
		setVisible(true);
		setSize(500,500);
		p=new JPopupMenu();

		i1=new JMenuItem("New");
		i2=new JMenuItem("Close");
		i3=new JMenuItem("Exit");

		p.add(i1);
		p.addSeparator();
		p.add(i2);
		p.addSeparator();
		p.add(i3);

		addMouseListener(new MouseAdapter()
		{
			public void mouseReleased(MouseEvent e)
			{
				if(e.getModifiers()==InputEvent.BUTTON3_MASK)
				p.show(e.getComponent(),e.getX(),e.getY());
			}

		});

		i1.addActionListener(this);
		i2.addActionListener(this);
		i3.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		Object obj=e.getSource();
		if(obj==i1)
		{
			JFrame f1=new JFrame();
			f1.setVisible(true);
			f1.setSize(400,400);

		}
		if(obj==i2)
		{
			setVisible(false);
		}
		if(obj==i3)
			System.exit(0);

	}

	public static void main(String ar[])
	{
		new PopUpDemo();
	}
}