import java.awt.*;
import javax.swing.event.*;
import javax.swing.*;
class MyPanel extends JPanel implements ListSelectionListener
{
	JList list;
	JScrollPane p;
	String s1="";
	String s[]={ "c Programing",  "cpp","java","Python","DS","ASP",};
	MyPanel()
	{
		list =new JList(s);
		list.setVisibleRowCount(3);
		list.setSelectionBackground(Color.yellow);
		list.setSelectionForeground(Color.red);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		p=new JScrollPane(list);
		add(p);
		list.addListSelectionListener(this);
	}
	public void valueChanged(ListSelectionEvent e)
	{
		s1=(String)list.getSelectedValue();
		repaint();
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Font f=new Font("jokerman",Font.BOLD,25);
		g.setFont(f);
		g.setColor(Color.red);
		g.drawString("Cource Selected is "+s1,50,300);
	}
}


class JListDemo extends JFrame
{
	JListDemo()
	{
		add(new MyPanel());
		setVisible(true);
		setSize(500,500);
	}
	public static void main(String ar[])
	{
		new JListDemo();
	}

}