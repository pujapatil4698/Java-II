/*
						Layout Management

1.By default layout of the frame is "Border Layout".
It means only one component can be displayed at a time on the frame.

*/

	import java.awt.*;

	class ButtonDemo extends Frame
	{
		ButtonDemo()
		{
		Button b1,b2;
		setVisible(true);
		setSize(400,400);
		b1=new Button("First");
		add(b1);
		b2=new Button("Second");
		add(b2);

		}
		public static void main(String ar[])
		{
			new ButtonDemo();
		}
	}