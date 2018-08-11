 import java.awt.*;
 import java.awt.event.*;
 import javax.swing.*;
 class CardDemo extends JFrame implements ActionListener
 {
	JPanel center,south,p1,p2,p3,p4;
	JButton b1,b2,b3,b4;
	CardLayout c;
 	CardDemo()
 	{
		setVisible(true);
		setSize(500,500);
		south=new JPanel();

		b1=new JButton("First");
		b2=new JButton("Next");
		b3=new JButton("Previous");
		b4=new JButton("Last");

		south.add(b1);
		south.add(b2);
		south.add(b3);
		south.add(b4);

		add(south,"South");

		center=new JPanel();
		c=new CardLayout(20,20);
		center.setLayout(c);
		p1=new JPanel();
		p2=new JPanel();
		p3=new JPanel();
		p4=new JPanel();

		p1.setBackground(Color.green);
		p2.setBackground(Color.red);
		p3.setBackground(Color.cyan);
		p4.setBackground(Color.magenta);

		p1.add(new JLabel("This is Panel1"));
		p2.add(new JLabel("This is Panel2"));
		p3.add(new JLabel("This is Panel3"));
		p4.add(new JLabel("This is Panel4"));

 		center.add("Card1",p1);
 		center.add("Card2",p2);
 		center.add("Card3",p3);
 		center.add("Card4",p4);

 		c.show(center,"Card1");

 		add(center,"Center");
 		validate();
 		b1.addActionListener(this);
 		b2.addActionListener(this);
 		b3.addActionListener(this);
 		b4.addActionListener(this);
 	}
 	public void actionPerformed(ActionEvent e)
 	{
		String s=e.getActionCommand();
		if(s.equals("First"))
			c.first(center);
		else if(s.equals("Next"))
			c.next(center);
		else if(s.equals("Previous"))
			c.previous(center);
		else if(s.equals("Last"))
			c.last(center);

	}
 	public static void main(String ar[])
	{
		new CardDemo();
	}
 }