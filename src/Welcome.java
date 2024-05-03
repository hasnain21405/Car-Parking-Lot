import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Welcome implements ActionListener
{
	
	JFrame first;
	JLabel l,signupL;
	JButton signup;
	
	Welcome(){
		
		first = new JFrame("Car Parking");
		Image i=Toolkit.getDefaultToolkit().getImage("icon.png");
		first.setIconImage(i);
		
		l=new JLabel("Welcome To Car Parking App");
		l.setBounds(45,30,350,40);
		l.setForeground(Color.white);
		l.setFont(new Font("", Font.PLAIN, 20));
		first.add(l);

		signup=new JButton("Signup");
		signup.setBounds(135,100,80,30);
		first.add(signup);
		signup.setFocusable(false);
		signup.addActionListener(this);
		
		signupL=new JLabel("Click SignUp To Create Your Account");
		signupL.setFont(new Font("", Font.ITALIC, 13));
		signupL.setBounds(75,150,250,20);
		signupL.setForeground(Color.white);
		first.add(signupL);
		
		first.getContentPane().setBackground((new Color(0x2A3457)));
		first.setSize(360,250);
		
		first.setLayout(null);
		first.setLocationRelativeTo(null);
		first.setVisible(true);	
	}

	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==signup) 
		{
			first.dispose();
			new SignUp();
		}	
	}
}
