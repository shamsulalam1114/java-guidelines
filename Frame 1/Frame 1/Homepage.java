import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Homepage extends JFrame
{
	JPanel panel;
	JLabel label1;
	
	public Homepage()
	{
		super("Home Page");
		this.setSize(1200,800);
		
		panel=new JPanel();
		panel.setLayout(null);
		
		
		label1=new JLabel("Info");
		label1.setBounds(200,150,100,50);
		panel.add(label1);
		
		this.add(panel);
	}
}