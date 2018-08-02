import java.awt.*;
class MyFrame extends Frame
{
	MyFrame()
	{
		setVisible(true);
		setSize(400,400);
		setTitle("My Frame");
		setLocation(100,100);
		setResizable(false);
		setBackground(Color.RED);

	}
	public static void main(String ar[])
	{
		new MyFrame();
	}
}

