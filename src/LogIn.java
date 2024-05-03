
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.*;
import javax.swing.*;

public class LogIn implements ActionListener  
{
	JFrame f;
	
	JTextField t,t1,t3;
	JLabel l,l1,l2;
	JButton Login1,b1,back;
	JPasswordField p;
	String TempUname,TempPass;
	
	
	
	LogIn(String TempUname,String TempPass){
		
		this.TempUname=TempUname;
		this.TempPass=TempPass;
		
		f=new JFrame("Parking Lot");
		Image i=Toolkit.getDefaultToolkit().getImage("icon.png");
		f.setIconImage(i);
		
		l=new JLabel("\"Welcome\"");
		l.setFont(new Font("", Font.PLAIN, 20));
		l.setBounds(150,20,150,20);
		l.setForeground(Color.white);
		f.add(l);
		
		l1=new JLabel("Username: ");
		l1.setBounds(50,70,100,20);
		l1.setForeground(Color.white);
		f.add(l1);
		t=new JTextField();
		t.setBounds(150,70,200,20);
		f.add(t);
		
		l2=new JLabel("Password: ");
		l2.setBounds(50,100,100,20);
		l2.setForeground(Color.white);
		f.add(l2);
		p=new JPasswordField();
		p.setBounds(150,100,200,20);
		f.add(p);
		
		Login1=new JButton("Login");
		Login1.setBounds(200,150,80,30);
		f.add(Login1);
		Login1.addActionListener(this);
		
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
	
	public void actionPerformed(ActionEvent e) {
		
	String Uname=t.getText();
	String UPass=p.getText();

	if(e.getSource()==Login1)
	{
		
	if(Uname.equals(TempUname) && UPass.equals(TempPass))
		{           
		f.dispose();
			new DashBoard(TempUname,TempPass);	
			
		}
		 else {
			 
			JOptionPane.showMessageDialog(f," Username or Password is incorrect ","Error",JOptionPane.ERROR_MESSAGE); 
		
		}
	}
		 
		 if(e.getSource()==back) {
			 
				f.dispose();
				new SignUp();
				
			}		
	}
	
}
