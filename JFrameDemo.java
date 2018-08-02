import javax.swing.*;
import java.awt.*;
class JFrameDemo extends JFrame
{
	JFrameDemo()
	{
		setVisible(true);
		setSize(500,500);
		setLocation(200,200);
		setTitle("JFrame Demo");
		Container cp=getContentPane();	//there are 6 layers in JFrame
		cp.setBackground(Color.cyan);
	}

	public static void main(String ar[])
	{
		new JFrameDemo();

	}
}