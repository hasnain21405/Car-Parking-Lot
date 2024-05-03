import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class SignUp implements ActionListener 
{
	JFrame f,info;
	JTextField t,t1;
	JLabel l,l1,l2;
	JButton b,back;
	JPasswordField p;
	String username,password;
	SignUp(){
		
		f=new JFrame("Parking Lot");
		Image i=Toolkit.getDefaultToolkit().getImage("icon.png");
		f.setIconImage(i);
		
		l=new JLabel("\"SignUp Page\"");
		l.setFont(new Font("", Font.PLAIN, 20));
		l.setBounds(145,20,150,25);
		l.setForeground(Color.white);
		f.add(l);
		
		l1=new JLabel("Username:");
		l1.setBounds(50,70,100,20);
		l1.setForeground(Color.white);
		f.add(l1);
		t=new JTextField();
		t.setBounds(150,70,200,20);
		f.add(t);
		
		l2=new JLabel("Password :");
		l2.setBounds(50,100,100,20);
		l2.setForeground(Color.white);
		f.add(l2);
		p=new JPasswordField();
		p.setBounds(150,100,200,20);
		f.add(p);
		
		b=new JButton("SignUp");
		b.setBounds(200,140,80,30);
		f.add(b);
		b.addActionListener(this);
		
		back=new JButton("Go Back");
		back.setBounds(50,210,100,30);
		f.add(back);
		back.addActionListener(this);
	
		
		f.getContentPane().setBackground((new Color(0x2A3457)));
		f.setSize(400,310);
		f.setLayout(null);
		f.setLocationRelativeTo(null);
		f.setVisible(true);	
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		
		username=t.getText();
		password=p.getText();
		
		if(e.getSource()==back) 
		{
			f.dispose();
			new Welcome();
		}
		if(e.getSource()==b)  
		{
			if(username.equals("") || password.equals(""))
			{
				JOptionPane.showMessageDialog(f, "Please enter all details.","Error", JOptionPane.ERROR_MESSAGE);
			}
			else
			{
				f.dispose();
				new LogIn(username,password);
			}
		
			
		}
	}
}
