import java.awt.*;
import java.awt.event.*;
class WindowDemo extends Frame implements WindowListener
{
	WindowDemo()
	{
		addWindowListener(this);
		setVisible(true);
		setSize(400,400);
	}
	public void windowDeactivated(WindowEvent e)
	{
		setBackground(Color.green);
		System.out.println("Window is Deactivated");
	}
	public void windowActivated(WindowEvent e)
	{
		setBackground(Color.red);
		System.out.println("Window is activated");
	}
	public void windowDeiconified(WindowEvent e)
	{
		setBackground(Color.PINK);
		System.out.println("Window is Restore");
	}
	public void windowIconified(WindowEvent e)
	{
		System.out.println("Window is minimised");
	}
	public void windowClosed(WindowEvent e)
	{
		System.out.println("Window is Closed");

	}
	public void windowClosing(WindowEvent e)
	{

		System.out.println("Window is Closing");
		System.exit(0);
	}
	public void windowOpened(WindowEvent e)
	{
		setBackground(Color.red);
		System.out.println("Window is opened");
	}
	public static void main(String ar[])
	{
		new WindowDemo();
	}
}