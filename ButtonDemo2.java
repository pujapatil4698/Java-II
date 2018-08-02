/*					Layout Management

2.However in border Layout we can set the components in 5 directions
that is north,South,East,West,Center.

*/


import java.awt.*;

class ButtonDemo2 extends Frame
{
	ButtonDemo2()
	{
		Button b1,b2,b3,b4,b5;
		setVisible(true);
		setSize(400,400);
		b1=new Button("North");

		//add(b1,"North");   OR  add(b1,BorderLayout.NORTH);

		add(b1,BorderLayout.NORTH);
		b2=new Button("South");
		add(b2,"South");
		b3=new Button("East");
		add(b3,"East");
		b4=new Button("West");
		add(b4,"West");
		b5=new Button("Center");
		add(b5,"Center");

	}
	public static void main(String ar[])
	{
		new ButtonDemo2();
	}
}