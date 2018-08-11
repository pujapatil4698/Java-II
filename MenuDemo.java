import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class MenuDemo extends  JFrame implements ActionListener
{
	JMenuBar bar;
	JMenu m1,m2,m3,m4;
	JMenuItem i1,i2,i3,i4,i5;
	JTextArea t;
	JScrollPane p;
	MenuDemo()
	{
		setVisible(true);
		setSize(500,500);

		bar =new JMenuBar();

		m1=new JMenu("File");
		m1.setMnemonic('f');
		m2=new JMenu("Format");
		m2.setMnemonic('o');
		m3=new JMenu("Color");
		m4=new JMenu("Help");
		m4.setMnemonic('h');

		bar.add(m1);
		bar.add(m2);
		m2.add(m3);
		bar.add(Box.createHorizontalGlue());
		bar.add(m4);

		i1=new JMenuItem("new",new ImageIcon("1.png"));

		i1.setAccelerator(KeyStroke.getKeyStroke('N',InputEvent.CTRL_DOWN_MASK));

		i2=new JMenuItem("Close",new ImageIcon("2.png"));
		i3=new JMenuItem("Exit",new ImageIcon("3.png"));

		i4=new JMenuItem("Cyan");
		i5=new JMenuItem("Red");

		m1.add(i1);
		m1.addSeparator();
		m1.add(i2);
		m1.addSeparator();
		m1.add(i3);
		m3.add(i4);
		m3.addSeparator();
		m3.add(i5);

		setJMenuBar(bar);

		t=new JTextArea();
		p=new JScrollPane(t);
		add(p);

		validate();
		i1.addActionListener(this);
		i2.addActionListener(this);
		i3.addActionListener(this);
		i4.addActionListener(this);
		i5.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		Object obj=e.getSource();
		if(obj==i1)
		{
			t.setText("");
			t.setBackground(Color.white);
			t.setForeground(Color.black);
		}
		else if(obj==i2)
			setVisible(false);

		else if(obj==i3)
			System.exit(0);
		else if(obj==i4)
			t.setBackground(Color.cyan);
		else if(obj==i5)
			t.setForeground(Color.red);


	}
	public static void main(String ar[])
	{
		new MenuDemo();
	}

}