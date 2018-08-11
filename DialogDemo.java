import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class DialogDemo extends JFrame implements ActionListener
{
	JRadioButton r1,r2,r3,r4;
	ButtonGroup g;
	String op[]={"Red","Green","Blue","Cyan"};
	DialogDemo()
	{
		setVisible(true);
		setSize(400,400);
		setLayout(new GridLayout(4,1));

		r1=new JRadioButton("Message");
		r2=new JRadioButton("Confirm");
		r3=new JRadioButton("Input");
		r4=new JRadioButton("Option");

		g=new ButtonGroup();
		g.add(r1);
		g.add(r2);
		g.add(r3);
		g.add(r4);

		add(r1);
		add(r2);
		add(r3);
		add(r4);
		validate();

		r1.addActionListener(this);
		r2.addActionListener(this);
		r3.addActionListener(this);
		r4.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		Object obj=e.getSource();
		if(obj==r1)
			JOptionPane.showMessageDialog(this,"Welcome to Paris","MsgBox",JOptionPane.QUESTION_MESSAGE,new ImageIcon("1.png"));
		else if(obj==r2)
			JOptionPane.showConfirmDialog(this,"Do you want to close ?","ConfirmBox",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
		else if(obj==r3)
		{
			int s=Integer.parseInt(JOptionPane.showInputDialog(this,"Enter the number","InputBox",JOptionPane.PLAIN_MESSAGE));

			JOptionPane.showMessageDialog(this,s);
		}
		else if(obj==r4)
		{
				JOptionPane.showOptionDialog(this,"Click on any one Button","OptionBox",JOptionPane.OK_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,new ImageIcon("3.png"),op,op[0]);

		}
	}
	public static void main(String ar[])
	{
		new DialogDemo();
	}
}