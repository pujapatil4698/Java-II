import java.awt.*;
class ImageDemo extends Frame
{
	ImageDemo()
	{
		setVisible(true);
		setSize(500,500);
	}
	public void paint(Graphics g)
	{
		Toolkit tk=Toolkit.getDefaultToolkit();
		Image img=tk.getImage("1.jpg");
		g.drawImage(img,100,100,200,200,this);
	}
	public static void main(String ar[])
	{
		new ImageDemo();
	}
}