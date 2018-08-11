 import java.awt.*;
 import java.awt.event.*;
 import javax.swing.*;
 class ButtonPic extends JFrame implements ActionListener
 {
	 JButton b1,b2,b3;
	 ButtonPic()
	 {
		 setVisible(true);
		 setSize(500,500);
		 setLayout(new FlowLayout());
		 b1=new JButton(new ImageIcon("11.png"));
		 add(b1);
		 b2=new JButton(new ImageIcon("2.png"));
		 add(b2);
		b3=new JButton(new ImageIcon("8.png"));
		add(b3);
		b3.setPressedIcon(new ImageIcon("5.png"));
		b3.setRolloverIcon(new ImageIcon("6.png"));
		b3.setDisabledIcon(new ImageIcon("12.png"));
	 	b1.addActionListener(this);
	 	b2.addActionListener(this);
	 	validate();
	 }
	 public void actionPerformed(ActionEvent e)
	 {
		 Object obj=e.getSource();
		 if(obj==b1)
		 {
			 b3.setEnabled(false);
		 }
		 if(obj==b2)
		 {
		 	 b3.setEnabled(true);
		 }
	 }
	 public static void main(String ar[])
	 {
		 new ButtonPic();
	 }
 }