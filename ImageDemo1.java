import java.awt.*;
class ImageDemo1 extends Frame
{
	ImageDemo1()
	{
		setVisible(true);
		setSize(500,500);
	}
	public void paint(Graphics g)
	{
		Toolkit tk=Toolkit.getDefaultToolkit();
		Image img=tk.getImage("1.jpg");
		g.drawImage(img,100,100,400,300,this);  //g.drawImage(img,100,100,300,300,null);

	}
	public static void main(String ar[])
	{
		new ImageDemo1();
	}
}