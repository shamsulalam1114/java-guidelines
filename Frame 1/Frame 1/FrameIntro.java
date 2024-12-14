import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FrameIntro extends JFrame implements MouseListener,ActionListener
{
	JPanel panel;
	JButton logbtn,regbtn,backbtn;
	JLabel name,pass;
	JTextField namefield;
	JPasswordField passfield;
	Color mycolor,mycolor1;
	Font myfont;
	
	public FrameIntro()
	{
		super("My first gui");
		this.setSize(1200,800);
		
		
		mycolor=new Color(210,213,130); 
		mycolor1=new Color(130,190,175);
		
		myfont=new Font("Arial",Font.PLAIN,28);
		
		panel=new JPanel();
		panel.setLayout(null);
		panel.setBackground(mycolor);
		
		name=new JLabel("Name");
		name.setBounds(400,150,100,50);
		name.setBackground(mycolor1);
		name.setOpaque(true);
		name.setFont(myfont);
		name.setForeground(Color.RED);
		panel.add(name);
		
		namefield=new JTextField();
		namefield.setBounds(550,150,100,50);
		panel.add(namefield);
		
		pass=new JLabel("Password");
		pass.setBounds(400,220,100,50);
		panel.add(pass);
		
		passfield=new JPasswordField();
		passfield.setBounds(550,220,100,50);
		passfield.setEchoChar('*');
		panel.add(passfield);
		
		logbtn=new JButton("Login");
		logbtn.setBounds(350,300,100,50);
		logbtn.setBackground(Color.PINK);
		logbtn.addMouseListener(this);
		logbtn.addActionListener(this);
		panel.add(logbtn);
		
		regbtn=new JButton("Register");
		regbtn.setBounds(470,300,100,50);
		regbtn.addMouseListener(this);
		regbtn.addActionListener(this);
		panel.add(regbtn);
		
		backbtn=new JButton("Back");
		backbtn.setBounds(600,300,100,50);
		panel.add(backbtn);
		
		this.add(panel);
	}
	
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource()==logbtn)
		{
			logbtn.setBackground(Color.BLUE);
			logbtn.setForeground(Color.WHITE);
		}
		else if(me.getSource()==regbtn)
		{
			regbtn.setBackground(Color.BLUE);
			regbtn.setForeground(Color.WHITE);
		}
	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource()==logbtn)
		{
			logbtn.setBackground(Color.PINK);
			logbtn.setForeground(Color.BLACK);
		}
		
		else if(me.getSource()==regbtn)
		{
			regbtn.setBackground(Color.WHITE);
			regbtn.setForeground(Color.BLACK);
		}
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==regbtn)
		{
			Registration r1=new Registration();
			r1.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource()==logbtn)
		{
			Homepage h1=new Homepage();
			h1.setVisible(true);
			this.setVisible(false);
		}
	}
}