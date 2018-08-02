import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class ComboDemo extends JFrame implements ActionListener
{
	JTextArea t;
	JTextField t1;
	JButton b1;
	JComboBox c;
	JPanel p;
	String s[]={"simple","robust","platform independent","object oriented"};
	ComboDemo()
	{
		setVisible(true);
		setSize(500,500);
		t=new JTextArea(10,50);
		add(t,"North");

		p=new JPanel();

		p.add(new JLabel("Feature"));

		t1=new JTextField(10);
		p.add(t1);

		b1=new JButton("Add");
		p.add(b1);

		c=new JComboBox(s);
		c.setMaximumRowCount(2);
		p.add(c);

		add(p,"South");

		validate();
		b1.addActionListener(this);
		c.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		Object obj=e.getSource();
		if(obj==b1)
		{
			c.addItem(t1.getText());
		}
		else if(obj==c)
		{
			Object ob=c.getSelectedItem();
			String s=(String)ob;
			t.setText("Feature of java is :"+s);

		}
	}
	public static void main(String ar[])
	{
		new ComboDemo();
	}

}
