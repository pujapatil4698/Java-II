import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class PizzaDemo extends JFrame implements ActionListener
{
	JPanel radio,check,order;
	JRadioButton r1,r2,r3;
	JCheckBox c1,c2,c3,c4;
	JLabel l1,l2,l3;
	JTextField t1,t2,t3;
	ButtonGroup g;
	JButton b1;
	PizzaDemo()
	{
		setVisible(true);
		setSize(500,500);
		setTitle("Pizza Demo");

		radio=new JPanel();
		radio.setLayout(new GridLayout(3,1));
		r1=new JRadioButton("Plain");
		r2=new JRadioButton("Veg");
		r3=new JRadioButton("Chinese");

		g=new ButtonGroup();
		g.add(r1);
		g.add(r2);
		g.add(r3);

		radio.add(r1);
		radio.add(r2);
		radio.add(r3);

		add(radio,"West");

		check=new JPanel();
		check.setLayout(new GridLayout(2,2));

		c1=new JCheckBox("Chili");
		c2=new JCheckBox("Sauce");
		c3=new JCheckBox("Butter");
		c4=new JCheckBox("Paneer");

		check.add(c1);
		check.add(c2);
		check.add(c3);
		check.add(c4);

		add(check,"East");

		order=new JPanel();

		l1=new JLabel("Qty");
		t1=new JTextField(5);
		l2=new JLabel("Rate");
		t2=new JTextField(5);
		b1=new JButton("Amt");
		l3=new JLabel("Show");
		t3=new JTextField(5);

		order.add(l1);
		order.add(t1);
		order.add(l2);
		order.add(t2);
		order.add(b1);
		order.add(l3);
		order.add(t3);

		add(order,"South");

		r1.addActionListener(this);
		r2.addActionListener(this);
		r3.addActionListener(this);
		b1.addActionListener(this);

		validate();
		pack();
	}
	public void actionPerformed(ActionEvent e)
	{
		Object obj=e.getSource();
		if(obj==r1)
		{
		c1.setSelected(true);
		c2.setSelected(false);
		c3.setSelected(false);
		c4.setSelected(true);
		t2.setText("100");
		t1.setText("");
		t3.setText("");
		}
		else if(obj==r2)
		{
		c1.setSelected(false);
		c2.setSelected(false);
		c3.setSelected(true);
		c4.setSelected(true);
		t2.setText("200");
		t1.setText("");
		t3.setText("");
		}
		else if(obj==r3)
		{
		c1.setSelected(true);
		c2.setSelected(true);
		c3.setSelected(false);
		c4.setSelected(false);
		t2.setText("180");
		t1.setText("");
		t3.setText("");
		}
		else if(obj==b1)
		{
		int a=Integer.parseInt(t1.getText());
		int b=Integer.parseInt(t2.getText());
		int c=a*b;
		t3.setText(Integer.toString(c));
		}
	}
	public static void main(String ar1[])
		{
			new PizzaDemo();
		}
}
