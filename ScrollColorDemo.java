import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class ScrollColorDemo extends JFrame implements AdjustmentListener
{
	JLabel r,g,b;
	JScrollBar rs,gs,bs;
	JPanel scroll,color;
	ScrollColorDemo()
	{
		setVisible(true);
		setSize(600,600);

		scroll=new JPanel();
		scroll.setLayout(new GridLayout(3,2));

		r=new JLabel("Red");
		rs=new JScrollBar(Adjustable.HORIZONTAL,0,0,0,255);

		scroll.add(r);
		scroll.add(rs);

		g=new JLabel("Green");
		gs=new JScrollBar(Adjustable.HORIZONTAL,0,0,0,255);

		scroll.add(g);
		scroll.add(gs);

		b=new JLabel("Blue");
		bs=new JScrollBar(Adjustable.HORIZONTAL,0,0,0,255);

		scroll.add(b);
		scroll.add(bs);

		add(scroll,"North");

		color=new JPanel();
		add(color,"Center");

		rs.addAdjustmentListener(this);
		gs.addAdjustmentListener(this);
		bs.addAdjustmentListener(this);
		validate();

	}
	public void adjustmentValueChanged(AdjustmentEvent e)
	{
		r.setText("Red :"+rs.getValue());
		g.setText("Green :"+gs.getValue());
		b.setText("Blue :"+bs.getValue());

		rs.setBackground(new Color(rs.getValue(),0,0));
		gs.setBackground(new Color(0,gs.getValue(),0));
		bs.setBackground(new Color(0,0,bs.getValue()));

		color.setBackground(new Color(rs.getValue(),gs.getValue(),bs.getValue()));
	}
	public static void main(String ar[])
	{
		new ScrollColorDemo();
	}
}