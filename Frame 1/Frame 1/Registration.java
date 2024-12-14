import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Registration extends JFrame implements ActionListener
{
	JPanel panel;
	JLabel username,password;
	JTextField userfield;
	JPasswordField passfield;
	JButton regbtn,backbtn;
	
	public Registration()
	{
		super("Registration");
		this.setSize(1200,800);
		
		panel=new JPanel();
		panel.setLayout(null);
		
		username=new JLabel("Name");
		username.setBounds(250,150,100,50);
		panel.add(username);
		
		userfield=new JTextField();
		userfield.setBounds(400,150,100,50);
		panel.add(userfield);
		
		password=new JLabel("Password");
		password.setBounds(250,280,100,50);
		panel.add(password);
		
		
		passfield=new JPasswordField();
		passfield.setBounds(400,280,100,50);
		panel.add(passfield);
		
		regbtn=new JButton("Sign up");
		regbtn.setBounds(280,410,100,50);
		regbtn.addActionListener(this);
		panel.add(regbtn);
		
		backbtn=new JButton("Back");
		backbtn.setBounds(400,410,100,50);
		backbtn.addActionListener(this);
		panel.add(backbtn);
		
		
		this.add(panel);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==regbtn)
		{
			JOptionPane.showMessageDialog(null,"Fill up all");
			
			FrameIntro f1=new FrameIntro();
			f1.setVisible(true);
			this.setVisible(false);
			
		}
		else if(ae.getSource()==backbtn)
		{
			FrameIntro f1=new FrameIntro();
			f1.setVisible(true);
			this.setVisible(false);
		}
	}
}