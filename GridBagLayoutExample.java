import java.awt.*;
import javax.swing.*;

class GridBagLayoutExample extends JFrame
{
	public static void main(String ar[])
	{
		new GridBagLayoutExample();
	}
	GridBagLayoutExample()
	{
		GridBagConstraints gbc =new GridBagConstraints();

		setLayout(new GridBagLayout());

		gbc.fill=GridBagConstraints.HORIZONTAL;
		//gbc.weightx=0.5; //ipadx is also same
		//gbc.weighty=0.5;
		gbc.gridx=0;
		gbc.gridy=0;
		add(new Button("Button one"),gbc);
		gbc.gridx=1;
		gbc.gridy=0;
		add(new Button("Button two"),gbc);
		gbc.fill=GridBagConstraints.HORIZONTAL;
		gbc.ipady=35; //button height increase

		//gbc.gridwidth=2; //2button make 1 button
		gbc.gridx=0;
		gbc.gridy=1;
		add(new Button("Button three"),gbc);
		gbc.gridx=1;
		gbc.gridy=1;

		add(new Button("Button Four"),gbc);
		gbc.gridx=0;
		gbc.gridy=2;
		gbc.fill=GridBagConstraints.HORIZONTAL;
		gbc.gridwidth=2;
		add(new Button("Button Five"),gbc);
		setSize(500,500);
		setVisible(true);
	}
}